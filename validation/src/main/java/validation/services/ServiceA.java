package validation.services;

import java.io.Serializable;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import validation.domain.A;

@Stateless
public class ServiceA implements Serializable, ServiceALocal {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4435484753422184913L;
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void addA(A a) {
		entityManager.persist(a);
	}

}
