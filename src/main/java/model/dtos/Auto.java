package model.dtos;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the auto database table.
 * 
 */
@Entity
@Table(name="auto")
@NamedQueries({@NamedQuery(name="Auto.findAll", query="SELECT a FROM Auto a"),
	@NamedQuery(name="Auto.findById", query="SELECT a FROM Auto a WHERE a.idAuto = :idAuto")})
public class Auto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_auto", unique=true, nullable=false, length=10)
	private String idAuto;

	@Column(name="id_ciudad", length=15)
	private String idCiudad;

	@Column(name="id_tipo", length=6)
	private String idTipo;

	@Column(length=30)
	private String marca;

	@Column(length=15)
	private String nombre;

	@Column(length=6)
	private String placa;

	@Column(length=30)
	private String valor;

	//bi-directional many-to-one association to Venta
	@OneToMany(mappedBy="auto")
	private Set<Venta> ventas;

	public Auto() {
		//This method is empty because is the contructor of the class.
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