package ec.edu.uce.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import ec.edu.uce.modelo.Avion;

@SpringBootTest
@Rollback(false)
@Transactional
class AvionServiceImplTest {
	@Autowired
	private IAvionService iAvionService;

	@Test
	void testInsertar() {
		Avion avion = new Avion();
		avion.setCapacidadAsientos(100);
		avion.setNombre("gh-125");
		this.iAvionService.insertar(avion);

		assertEquals(100, this.iAvionService.buscarNombre("gh-125").getCapacidadAsientos());

	}

}
