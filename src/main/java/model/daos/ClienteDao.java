package model.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;
import javax.persistence.TypedQuery;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import model.dtos.Cliente;
import model.entities.factory.EntityManagerfactory;

public class ClienteDao implements model.daos.interfaces.ClienteDaoInterface {
	EntityManagerfactory emf = new EntityManagerfactory();
	EntityManager em = emf.getEntityManager();

	@Override
	public void crearCliente(Cliente cliente) {
		Log log = LogFactory.getLog(this.getClass());
		
		try {
			em.getTransaction().begin();
			em.persist(cliente);
			em.getTransaction().commit();
			log.info("Cliente almacenado en base de datos");
			Logger.getLogger(getClass()).log(Level.INFO, "Cliente almacenado en base de datos");
		} catch (PersistenceException e) {
			em.getTransaction().rollback();
			Throwable th = e.getCause();
			log.error("Error when saving 'Cliente' in Database EXCEPTION STRING: {0}"+ e.getMessage());
			log.trace("EXCEPTION STRING: {0}"+e.toString());
			Logger.getLogger(getClass()).log(Level.ERROR,"Error when saving 'Cliente' in Database EXCEPTION STRING: {0}"+ e.getMessage());
			Logger.getLogger(getClass()).log(Level.TRACE,"EXCEPTION STRING: {0}"+e.toString());
			Logger.getLogger(ClienteDao.class.getName()).log(Level.ERROR,
					"Error when saving 'Cliente' in Database  THROWABLE MESSAGE: {0}" + th.toString());
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
					"ClienteDao  actualizar apellido persistence exception EXCEPTION STRING: {0}" + e.toString());
			Logger.getLogger(ClienteDao.class.getName()).log(Level.INFO,
					"ClienteDao actualizar apellido persistence exception THROWABLE MESSAGE: {0}" + th.toString());
			Logger.getLogger(ClienteDao.class.getName()).log(Level.INFO,
					"ClienteDao actualizar apellido persistence exceptions THROWABLE STRING: {0}" + th.toString());
		} finally {
			em.close();
		}

	}

	@Override
	public void actualizarCliente(String apellido1, String apellido2, String idCliente) {
		try {
			em.getTransaction().begin();
			Cliente cliente = this.consultarCliente(idCliente);
			cliente.setApellido1(apellido1);
			cliente.setApellido2(apellido2);
			em.merge(cliente);
			em.getTransaction().commit();
		} catch (PersistenceException e) {
			em.getTransaction().rollback();
			Throwable th = e.getCause();
			Logger.getLogger(ClienteDao.class.getName()).log(Level.INFO,
					"ClienteDao actualizar apellidos persistence exception EXCEPTION STRING: {0}" + e.toString());
			Logger.getLogger(ClienteDao.class.getName()).log(Level.INFO,
					"ClienteDao actualizar apellidos persistence exception THROWABLE MESSAGE: {0}" + th.toString());
			Logger.getLogger(ClienteDao.class.getName()).log(Level.INFO,
					"ClienteDao actualizar apellidos persistence exceptions THROWABLE STRING: {0}" + th.toString());
		} finally {
			em.close();
		}
	}

	@Override
	public void actualizarCliente(String nombre1, String nombre2, String apellido1, String apellido2,
			String idCliente) {
		try {
			em.getTransaction().begin();
			Cliente cliente = this.consultarCliente(idCliente);
			cliente.setNombre1(nombre1);
			cliente.setNombre2(nombre2);
			cliente.setApellido1(apellido1);
			cliente.setApellido2(apellido2);
			em.merge(cliente);
			em.getTransaction().commit();
		} catch (PersistenceException e) {
			em.getTransaction().rollback();
			Throwable th = e.getCause();
			Logger.getLogger(ClienteDao.class.getName()).log(Level.INFO,
					"ClienteDao actualizar fullname persistence exception EXCEPTION STRING: {0}" + e.toString());
			Logger.getLogger(ClienteDao.class.getName()).log(Level.INFO,
					"ClienteDao actualizar fullname persistence exception THROWABLE MESSAGE: {0}" + th.toString());
			Logger.getLogger(ClienteDao.class.getName()).log(Level.INFO,
					"ClienteDao actualizar fullname persistence exceptions THROWABLE STRING: {0}" + th.toString());
		} finally {
			em.close();
		}

	}

	@Override
	public void actualizarTelefonoCliente(String telefono, String idCliente) {
		try {
			em.getTransaction().begin();
			Cliente cliente = this.consultarCliente(idCliente);
			cliente.setTelefono(telefono);
			em.merge(cliente);
			em.getTransaction().commit();
		} catch (PersistenceException e) {
			em.getTransaction().rollback();
			Throwable th = e.getCause();
			Logger.getLogger(ClienteDao.class.getName()).log(Level.INFO,
					"ClienteDao actualizar telefono persistence exception EXCEPTION STRING: {0}" + e.toString());
			Logger.getLogger(ClienteDao.class.getName()).log(Level.INFO,
					"ClienteDao actualizar telefono persistence exception THROWABLE MESSAGE: {0}" + th.toString());
			Logger.getLogger(ClienteDao.class.getName()).log(Level.INFO,
					"ClienteDao actualizar telefono persistence exceptions THROWABLE STRING: {0}" + th.toString());
		} finally {
			em.close();
		}
	}

	@Override
	public void actualizarCorreoCliente(String correo, String idCliente) {
		try {
			em.getTransaction().begin();
			Cliente cliente = this.consultarCliente(idCliente);
			cliente.setCorreo(correo);
			em.merge(cliente);
			em.getTransaction().commit();
		} catch (PersistenceException e) {
			em.getTransaction().rollback();
			Throwable th = e.getCause();
			Logger.getLogger(ClienteDao.class.getName()).log(Level.INFO,
					"ClienteDao actualizar correo persistence exception EXCEPTION STRING: {0}" + e.toString());
			Logger.getLogger(ClienteDao.class.getName()).log(Level.INFO,
					"ClienteDao actualizar correo persistence exception THROWABLE MESSAGE: {0}" + th.toString());
			Logger.getLogger(ClienteDao.class.getName()).log(Level.INFO,
					"ClienteDao actualizar correo persistence exceptions THROWABLE STRING: {0}" + th.toString());
		} finally {
			em.close();
		}
	}

	@Override
	public void actualizarContrasenaCliente(String contrasena, String idCliente) {
		try {
			em.getTransaction().begin();
			Cliente cliente = this.consultarCliente(idCliente);
			cliente.setContrasena(contrasena);
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

}
