package ec.edu.uce.service;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import ec.edu.uce.modelo.Vuelo;

@SpringBootTest
@Rollback(false)
@Transactional
class VueloServiceImplTest {

	@Autowired
	private IVueloService iVueloService;

	@Test
	void testInsertar() {
		Vuelo vuelo = new Vuelo();
		vuelo.setCategoria("T");
		vuelo.setDestino("Ecudaor");
		vuelo.setDisponibleAsientos(100);
		vuelo.setEstado("D");
		vuelo.setFechaVuelo(LocalDateTime.now());
		vuelo.setNombre("are-8");
		vuelo.setNumero("1");
		vuelo.setOrigen("Galapagos");
		vuelo.setValorAsiento(new BigDecimal(100));
		this.iVueloService.insertar(vuelo);

		this.iVueloService.buscarVuelosOrigenDestino("Galapagos", "Ecudaor", "0");
	}

}
