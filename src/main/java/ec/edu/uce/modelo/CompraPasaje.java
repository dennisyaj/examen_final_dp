package ec.edu.uce.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "compra_pasaje")
public class CompraPasaje {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_compra_pasaje")
	@SequenceGenerator(name = "seq_compra_pasaje", sequenceName = "seq_compra_pasaje", allocationSize = 1)
	@Column(name = "copa_id")
	private Integer id;

	@Column(name = "copa_numero")
	private String numero;

	@Column(name = "copa_fecha_compra", columnDefinition = "TIMESTAMP")
	private LocalDateTime fechaCompra;

	@Column(name = "copa_numero_tarjeta")
	private String numeroTarjeta;

	@Column(name = "copa_cantidad_asientos_comprados")
	private Integer asientosComprados;

	@Column(name = "copa_estado")
	private String estado;

	@Column(name = "copa_check")
	private String check;

	@ManyToOne
	@JoinColumn(name = "cliente_id")
	private Cliente compraPasajecliente;

	@ManyToOne
	@JoinColumn(name = "vuel_id")
	private Avion vueloCompraPasaje;

	// gets and sets
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public LocalDateTime getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(LocalDateTime fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}

	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	public Integer getAsientosComprados() {
		return asientosComprados;
	}

	public void setAsientosComprados(Integer asientosComprados) {
		this.asientosComprados = asientosComprados;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCheck() {
		return check;
	}

	public void setCheck(String check) {
		this.check = check;
	}

	public Cliente getCompraPasajecliente() {
		return compraPasajecliente;
	}

	public void setCompraPasajecliente(Cliente compraPasajecliente) {
		this.compraPasajecliente = compraPasajecliente;
	}

	public Avion getVueloCompraPasaje() {
		return vueloCompraPasaje;
	}

	public void setVueloCompraPasaje(Avion vueloCompraPasaje) {
		this.vueloCompraPasaje = vueloCompraPasaje;
	}

}
