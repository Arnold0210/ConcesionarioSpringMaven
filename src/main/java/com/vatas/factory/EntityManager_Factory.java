package com.vatas.factory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @Autor: Arnold Herrera
 * @Date: 31/03/2019
 * @Project: concesionario_spring
 * @FileName:EntityManagerFactory.java Copyrigt(C) 2019 Todos los derechos
 *                                     reservados.
 */
public class EntityManager_Factory implements com.vatas.interfaces.model.EntityManagerFactory {

	private static final String PERSISTENCE_UNIT_NAME = "concesionario";
	private static EntityManagerFactory emf;
	private EntityManager em;

	public EntityManager_Factory() {
		emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		em = emf.createEntityManager();
	}

	@Override
	public EntityManager getEntityManager() {
		return em;
	}

}
