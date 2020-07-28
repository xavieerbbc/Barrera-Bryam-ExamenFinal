package ec.edu.ups.entidad;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: SignosVitales
 *
 */
@Entity

public class SignosVitales implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int codigo;
	private String presion;
	private String frecuenciaCardiaca;
	private String frecuenciaRespiratoria;
	private String saturacion;
	
	@OneToOne
	@JoinColumn
	private CitaMedica citamedica;
	
	@Transient
	private boolean editable;
	
	
	
	public SignosVitales() {
		super();
	}



	@Override
	public String toString() {
		return "SignosVitales [codigo=" + codigo + ", presion=" + presion + ", frecuenciaCardiaca=" + frecuenciaCardiaca
				+ ", frecuenciaRespiratoria=" + frecuenciaRespiratoria + ", saturacion=" + saturacion + ", citamedica="
				+ citamedica + "]";
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
		SignosVitales other = (SignosVitales) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}



	public SignosVitales(String presion, String frecuenciaCardiaca, String frecuenciaRespiratoria, String saturacion) {
		super();
		this.presion = presion;
		this.frecuenciaCardiaca = frecuenciaCardiaca;
		this.frecuenciaRespiratoria = frecuenciaRespiratoria;
		this.saturacion = saturacion;
	}



	public SignosVitales(String presion, String frecuenciaCardiaca, String frecuenciaRespiratoria, String saturacion,
			CitaMedica citamedica) {
		super();
		this.presion = presion;
		this.frecuenciaCardiaca = frecuenciaCardiaca;
		this.frecuenciaRespiratoria = frecuenciaRespiratoria;
		this.saturacion = saturacion;
		this.citamedica = citamedica;
	}



	public SignosVitales(String presion, String frecuenciaCardiaca, String frecuenciaRespiratoria, String saturacion,
			CitaMedica citamedica, boolean editable) {
		super();
		this.presion = presion;
		this.frecuenciaCardiaca = frecuenciaCardiaca;
		this.frecuenciaRespiratoria = frecuenciaRespiratoria;
		this.saturacion = saturacion;
		this.citamedica = citamedica;
		this.editable = editable;
	}



	public boolean isEditable() {
		return editable;
	}



	public void setEditable(boolean editable) {
		this.editable = editable;
	}



	public int getCodigo() {
		return codigo;
	}



	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}



	public String getPresion() {
		return presion;
	}



	public void setPresion(String presion) {
		this.presion = presion;
	}



	public String getFrecuenciaCardiaca() {
		return frecuenciaCardiaca;
	}



	public void setFrecuenciaCardiaca(String frecuenciaCardiaca) {
		this.frecuenciaCardiaca = frecuenciaCardiaca;
	}



	public String getFrecuenciaRespiratoria() {
		return frecuenciaRespiratoria;
	}



	public void setFrecuenciaRespiratoria(String frecuenciaRespiratoria) {
		this.frecuenciaRespiratoria = frecuenciaRespiratoria;
	}



	public String getSaturacion() {
		return saturacion;
	}



	public void setSaturacion(String saturacion) {
		this.saturacion = saturacion;
	}



	public CitaMedica getCitamedica() {
		return citamedica;
	}



	public void setCitamedica(CitaMedica citamedica) {
		this.citamedica = citamedica;
	}
	
   
}
