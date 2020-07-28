package ec.edu.ups.entidad;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Paciente
 *
 */
@Entity
public class Paciente implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	//@Column(unique=true)
	@GeneratedValue()
	private int codigo;
	private String cedula;
	private String nombres;
	private String apellidos;
	private String telefono;
	private String direccion;
	private String correoelectronico;
	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "paciente")
	private Set<CitaMedica> listaCitas = new HashSet<CitaMedica>();
	
	@Transient
	private boolean editable;
	
	public Paciente() {
		super();
	}

	public Paciente(String cedula, String nombres, String apellidos, String telefono, String direccion,
			String correoelectronico, Set<CitaMedica> listaCitas, boolean editable) {
		super();
		this.cedula = cedula;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.direccion = direccion;
		this.correoelectronico = correoelectronico;
		this.listaCitas = listaCitas;
		this.editable = editable;
	}

	public Paciente(String cedula, String nombres, String apellidos, String telefono, String direccion,
			String correoelectronico) {
		super();
		this.cedula = cedula;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.direccion = direccion;
		this.correoelectronico = correoelectronico;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
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

	public Set<CitaMedica> getListaCitas() {
		return listaCitas;
	}

	public void setListaCitas(Set<CitaMedica> listaCitas) {
		this.listaCitas = listaCitas;
	}

	public boolean isEditable() {
		return editable;
	}

	public void setEditable(boolean editable) {
		this.editable = editable;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Paciente other = (Paciente) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Paciente [codigo=" + codigo + ", cedula=" + cedula + ", nombres=" + nombres + ", apellidos=" + apellidos
				+ ", telefono=" + telefono + ", direccion=" + direccion + ", correoelectronico=" + correoelectronico
				+ "]";
	}

	
   
}
