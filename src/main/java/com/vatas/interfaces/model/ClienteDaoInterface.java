package com.vatas.interfaces.model;

import com.vatas.model.dtos.Cliente;

/**
 * @Autor: Arnold Herrera
 * @Date: 31/03/2019
 * @Project: concesionario_spring
 * @FileName:ClienteDaoInterfae.java 
 * Copyrigt(C) 2019 Todos los derechos reservados.
 */
public interface ClienteDaoInterface {
	public void crearCliente(Cliente cliente);

	public Cliente consultarCliente(String idCliente);

	public void actualizarCliente(String apellido, String idCliente);

	public void actualizarCliente(String apellido1, String apellido2, String idCliente);

	public void actualizarCliente(String nombre1, String nombre2, String apellido1, String apellido2, String idCliente);

	public void actualizarTelefonoCliente(String telefono, String idCliente);

	public void actualizarCorreoCliente(String correo, String idCliente);

	public void actualizarContrasenaCliente(String contrasena, String idCliente);
}
