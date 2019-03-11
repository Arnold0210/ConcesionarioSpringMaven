package model.entities.factory.interfaces;

import javax.persistence.EntityManager;

public interface EntityManagerFactory {
	public EntityManager getEntityManager();
}
