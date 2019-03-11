package model.entities.factory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerfactory implements model.entities.factory.interfaces.EntityManagerFactory {
	private static final String PERSISTENCE_UNIT_NAME = "concesionario";
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
	private EntityManager em;

	public EntityManagerfactory() {
		em = emf.createEntityManager();
	}

	public EntityManager getEntityManager() {
		return em;
	}

}
