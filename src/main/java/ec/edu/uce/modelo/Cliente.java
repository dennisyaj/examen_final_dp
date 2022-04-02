package ec.edu.uce.modelo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_cliente")
	@SequenceGenerator(name = "seq_cliente", sequenceName = "seq_cliente", allocationSize = 1)
	@Column(name = "clie_id")
	private Integer id;

	@Column(name = "clie_nombre")
	private String nombre;

	@OneToMany(mappedBy = "compraPasajecliente", cascade = CascadeType.ALL)
	private List<CompraPasaje> detalleCitaMedica;

	// gets and sets
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<CompraPasaje> getDetalleCitaMedica() {
		return detalleCitaMedica;
	}

	public void setDetalleCitaMedica(List<CompraPasaje> detalleCitaMedica) {
		this.detalleCitaMedica = detalleCitaMedica;
	}

}
