package ec.edu.uce.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;

public class BuscarVueloTO {

	private String fechaVuelo;

	private String origen;

	private String destino;

	public BuscarVueloTO() {
		super();
	}

	public BuscarVueloTO(String fechaVuelo, String origen, String destino) {
		super();
		this.fechaVuelo = fechaVuelo;
		this.origen = origen;
		this.destino = destino;
	}

//gets and sets

	public String getOrigen() {
		return origen;
	}

	public String getFechaVuelo() {
		return fechaVuelo;
	}

	public void setFechaVuelo(String fechaVuelo) {
		this.fechaVuelo = fechaVuelo;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

}
