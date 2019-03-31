package com.vatas.model.dtos;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the auto database table.
 * 
 */
@Entity
@NamedQuery(name="Auto.findAll", query="SELECT a FROM Auto a")
public class Auto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_auto")
	private String idAuto;

	@Column(name="id_ciudad")
	private String idCiudad;

	@Column(name="id_tipo")
	private String idTipo;

	private String marca;

	private String nombre;

	private String placa;

	private String valor;

	//bi-directional many-to-one association to Venta
	@OneToMany(mappedBy="auto")
	private Set<Venta> ventas;

	public Auto() {
		// default implementation ignored
	}

	public String getIdAuto() {
		return this.idAuto;
	}

	public void setIdAuto(String idAuto) {
		this.idAuto = idAuto;
	}

	public String getIdCiudad() {
		return this.idCiudad;
	}

	public void setIdCiudad(String idCiudad) {
		this.idCiudad = idCiudad;
	}

	public String getIdTipo() {
		return this.idTipo;
	}

	public void setIdTipo(String idTipo) {
		this.idTipo = idTipo;
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPlaca() {
		return this.placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getValor() {
		return this.valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public Set<Venta> getVentas() {
		return this.ventas;
	}

	public void setVentas(Set<Venta> ventas) {
		this.ventas = ventas;
	}

	public Venta addVenta(Venta venta) {
		getVentas().add(venta);
		venta.setAuto(this);

		return venta;
	}

	public Venta removeVenta(Venta venta) {
		getVentas().remove(venta);
		venta.setAuto(null);

		return venta;
	}

}