package ec.edu.ups.ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.edu.ups.entidad.Paciente;
import ec.edu.ups.entidad.SignosVitales;

@Stateless
public class SignosVFacade extends AbstractFacade<SignosVitales>{
	@PersistenceContext(unitName = "Barrera-Bryam-ExamenFinal")
	private EntityManager em;

	private SignosVFacade() {
		super(SignosVitales.class);
	}
	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return em;
	}
	
	public SignosVitales readSignos(String presion) {
		Query query = em.createNamedQuery("getBySignos");
		query.setParameter("presion", presion);
		List result = query.getResultList();
		SignosVitales respuesta = null;
		if (!result.isEmpty()) {
			respuesta = (SignosVitales)result.get(0);
		}
		return respuesta;
	}
}
