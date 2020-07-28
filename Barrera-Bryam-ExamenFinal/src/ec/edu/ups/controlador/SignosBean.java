package ec.edu.ups.controlador;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.annotation.FacesConfig;
import javax.inject.Named;

import ec.edu.ups.ejb.SignosVFacade;

import ec.edu.ups.entidad.SignosVitales;

@FacesConfig(version = FacesConfig.Version.JSF_2_3)
@Named
@SessionScoped
public class SignosBean implements Serializable{
	
private static final long serialVersionUID = 1L;
	
	
	@EJB
	private SignosVFacade signosFacade;
	private List<SignosVitales> list;
	
	private String presion;
	private String frecuenciaCardiaca;
	private String frecuenciaRespiratoria;
	private String saturacion;
	
	@PostConstruct
	private void init() {
		list = signosFacade.findAll();
	}
	
	public String add() {
		signosFacade.create(new SignosVitales(this.presion, this.frecuenciaCardiaca, this.frecuenciaRespiratoria, this.saturacion));
		list = signosFacade.findAll();
		return null;
	}

	public SignosVFacade getSignosFacade() {
		return signosFacade;
	}

	public void setSignosFacade(SignosVFacade signosFacade) {
		this.signosFacade = signosFacade;
	}

	public List<SignosVitales> getList() {
		return list;
	}

	public void setList(List<SignosVitales> list) {
		this.list = list;
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
	
	
}
