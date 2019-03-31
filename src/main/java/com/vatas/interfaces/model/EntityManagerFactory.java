package com.vatas.interfaces.model;

import javax.persistence.EntityManager;

/**
 * @Autor: Arnold Herrera
 * @Date: 31/03/2019
 * @Project: concesionario_spring
 * @FileName:EntityManagerFactory.java Copyrigt(C) 2019 Todos los derechos
 *                                     reservados.
 */
public interface EntityManagerFactory {
	public EntityManager getEntityManager();
}
