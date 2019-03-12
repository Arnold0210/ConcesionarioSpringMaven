package model.daos.interfaces;

import model.dtos.Cliente;

public interface ClienteDaoInterface {
	public void crearCliente(Cliente cliente);

	public Cliente consultarCliente(String idCliente);

	public void actualizarCliente(String apellido,String idCliente);

	public void actualizarCliente(String apellido1, String apellido2,String idCliente);

	public void actualizarCliente(String nombre1, String nombre2, String apellido1, String apellido2,String idCliente);

	public void actualizarTelefonoCliente(String telefono,String idCliente);
	
	public void actualizarCorreoCliente(String correo,String idCliente);

}
