package ec.edu.ups.controlador;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.annotation.FacesConfig;
import javax.inject.Named;

import ec.edu.ups.ejb.PacienteFacade;
import ec.edu.ups.entidad.Paciente;

@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@Named
@SessionScoped
public class PacienteBean implements Serializable{

	private static final long serialVersionUID = 1L;

	@EJB
	private PacienteFacade ejbPacienteFacade;
	private List<Paciente> list;
	
	
	private String cedula;
	private String nombres;
	private String apellidos;
	private String telefono;
	private String direccion;
	private String correoelectronico;

	
	
	public PacienteFacade getEjbPacienteFacade() {
		return ejbPacienteFacade;
	}

	public void setEjbPacienteFacade(PacienteFacade ejbPacienteFacade) {
		this.ejbPacienteFacade = ejbPacienteFacade;
	}

	public List<Paciente> getList() {
		return list;
	}

	public void setList(List<Paciente> list) {
		this.list = list;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreoelectronico() {
		return correoelectronico;
	}

	public void setCorreoelectronico(String correoelectronico) {
		this.correoelectronico = correoelectronico;
	}

	@PostConstruct
	private void init() {
		list= ejbPacienteFacade.findAll();
	}
	
	public String add() {
		ejbPacienteFacade.create(new Paciente(this.cedula, this.nombres, this.apellidos, this.telefono, this.direccion, this.correoelectronico));
		list = ejbPacienteFacade.findAll();
		return null;
	}
	
	public String save(Paciente d) {
		ejbPacienteFacade.edit(d);
		d.setEditable(false);
		return null;
	}
}
