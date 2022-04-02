package ec.edu.uce.modelo;

public class CheckTO {
	private String numero;
	private String estado;

	public CheckTO() {
		super();
	}

	public CheckTO(String numero, String estado) {
		super();
		this.numero = numero;
		this.estado = estado;
	}

	// get and set
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
