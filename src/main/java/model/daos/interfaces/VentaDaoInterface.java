package model.daos.interfaces;

import model.dtos.Venta;

public interface VentaDaoInterface {
	public void crearVenta();

	public Venta consultarVenta(String idVenta);
	
	public void actualizarVenta(String valor);

}
