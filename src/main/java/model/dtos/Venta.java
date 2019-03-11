package model.dtos;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the venta database table.
 * 
 */
@Entity
@Table(name="venta")
@NamedQueries({@NamedQuery(name="Venta.findAll", query="SELECT v FROM Venta v"),
	@NamedQuery(name="Venta.findById", query="SELECT v FROM Venta v WHERE v.idVenta = :idVenta")})
public class Venta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_venta", unique=true, nullable=false, length=10)
	private String idVenta;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	private Integer valor;

	//bi-directional many-to-one association to Auto
	@ManyToOne
	@JoinColumn(name="id_auto")
	private Auto auto;

	//bi-directional many-to-one association to Cliente
	@ManyToOne
	@JoinColumn(name="id_cliente")
	private Cliente cliente;

	public Venta() {
		//This method is empty because is constructor of the class
	}

	public String getIdVenta() {
		return this.idVenta;
	}

	public void setIdVenta(String idVenta) {
		this.idVenta = idVenta;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Integer getValor() {
		return this.valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

	public Auto getAuto() {
		return this.auto;
	}

	public void setAuto(Auto auto) {
		this.auto = auto;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}