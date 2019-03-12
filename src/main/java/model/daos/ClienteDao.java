package model.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;
import javax.persistence.TypedQuery;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import model.dtos.Cliente;
import model.entities.factory.EntityManagerfactory;

public class ClienteDao implements model.daos.interfaces.ClienteDaoInterface {
	EntityManagerfactory emf = new EntityManagerfactory();
	EntityManager em = emf.getEntityManager();

	@Override
	public void crearCliente(Cliente cliente) {
		try {
			em.getTransaction().begin();
			em.persist(cliente);
			em.getTransaction().commit();
		} catch (PersistenceException e) {
			em.getTransaction().rollback();
			Throwable th = e.getCause();
			Logger.getLogger(ClienteDao.class.getName()).log(Level.INFO,
					"ClienteDao  persistence exception EXCEPTION STRING: {0}" + e.toString());
			Logger.getLogger(ClienteDao.class.getName()).log(Level.INFO,
					"ClienteDao persistence exception THROWABLE MESSAGE: {0}" + th.toString());
			Logger.getLogger(ClienteDao.class.getName()).log(Level.INFO,
					"ClienteDao persistence exceptions THROWABLE STRING: {0}" + th.toString());
		} finally {
			em.close();
		}

	}

	@Override
	public Cliente consultarCliente(String idCliente) {

		TypedQuery<Cliente> consultacliente = em.createNamedQuery("Cliente.findByIdentificacion", Cliente.class);
		consultacliente.setParameter("identificacion", idCliente);
		return consultacliente.getSingleResult();
	}

	@Override
	public void actualizarCliente(String apellido1, String idCliente) {
		try {
			em.getTransaction().begin();
			Cliente cliente = this.consultarCliente(idCliente);
			cliente.setApellido1(apellido1);
			em.merge(cliente);
			em.getTransaction().commit();
		} catch (PersistenceException e) {
			em.getTransaction().rollback();
			Throwable th = e.getCause();
			Logger.getLogger(ClienteDao.class.getName()).log(Level.INFO,
					"ClienteDao  persistence exception EXCEPTION STRING: {0}" + e.toString());
			Logger.getLogger(ClienteDao.class.getName()).log(Level.INFO,
					"ClienteDao persistence exception THROWABLE MESSAGE: {0}" + th.toString());
			Logger.getLogger(ClienteDao.class.getName()).log(Level.INFO,
					"ClienteDao persistence exceptions THROWABLE STRING: {0}" + th.toString());
		} finally {
			em.close();
		}

	}

	@Override
	public void actualizarCliente(String apellido1, String apellido2, String idCliente) {

	}

	@Override
	public void actualizarCliente(String nombre1, String nombre2, String apellido1, String apellido2,
			String idCliente) {

	}

	@Override
	public void actualizarTelefonoCliente(String telefono, String idCliente) {

	}

	@Override
	public void actualizarCorreoCliente(String correo, String idCliente) {

	}

}
