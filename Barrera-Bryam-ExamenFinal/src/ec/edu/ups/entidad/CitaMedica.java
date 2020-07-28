package ec.edu.ups.entidad;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: CitaMedica
 *
 */
@Entity

public class CitaMedica implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue()
	private int codigo;
	private Date fecha;
	
	private String sintomas;
	private String alergias;
	private String enfermedadesPrevias;
	
	//@OneToMany
	//private Set<SignosVitales> listaSignos = new HashSet<SignosVitales>();
	
	
	@ManyToOne
	@JoinColumn
	private Paciente paciente;
	
	
	public CitaMedica() {
		super();
	}
	

	public CitaMedica(Date fecha, String sintomas, String alergias, String enfermedadesPrevias, Paciente paciente) {
		super();
		this.fecha = fecha;
		this.sintomas = sintomas;
		this.alergias = alergias;
		this.enfermedadesPrevias = enfermedadesPrevias;
		this.paciente = paciente;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	public String getSintomas() {
		return sintomas;
	}


	public void setSintomas(String sintomas) {
		this.sintomas = sintomas;
	}


	public String getAlergias() {
		return alergias;
	}


	public void setAlergias(String alergias) {
		this.alergias = alergias;
	}


	public String getEnfermedadesPrevias() {
		return enfermedadesPrevias;
	}


	public void setEnfermedadesPrevias(String enfermedadesPrevias) {
		this.enfermedadesPrevias = enfermedadesPrevias;
	}





	public Paciente getPaciente() {
		return paciente;
	}


	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
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
		CitaMedica other = (CitaMedica) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}
	
   
}
