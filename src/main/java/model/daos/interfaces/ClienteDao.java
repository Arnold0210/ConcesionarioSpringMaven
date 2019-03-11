package model.daos.interfaces;

import model.dtos.Cliente;

public interface ClienteDao {
	public void crearCliente();

	public Cliente consultarCliente(String idCliente);

	public void actualizarCliente(String apellido1);

	public void actualizarCliente(String apellido1, String apellido2);

	public void actualizarCliente(String nombre1, String nombre2, String apellido1, String apellido2);

	public void actualizarTelefonoCliente(String telefono);
	
	public void actualizarCorreoCliente(String correo);

}
