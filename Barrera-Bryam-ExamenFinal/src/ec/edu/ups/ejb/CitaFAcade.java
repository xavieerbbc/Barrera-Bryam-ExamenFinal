package ec.edu.ups.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ups.entidad.CitaMedica;

@Stateless
public class CitaFAcade extends AbstractFacade<CitaMedica>{
	@PersistenceContext(unitName = "Barrera-Bryam-ExamenFinal")
	private EntityManager em;
	
	public CitaFAcade() {
		super(CitaMedica.class);
	}
	
	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return em;
	}
	
	
	
}
