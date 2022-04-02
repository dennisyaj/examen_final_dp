package ec.edu.uce.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Vuelo;

@Service
public class GestorClienteAerolineaServiceImpl implements IGestorClienteAerolineaService {

	@Autowired
	private IVueloService iVueloService;

	@Override
	public List<Vuelo> buscarVuelosDisponibles(String origen, String destino, String fechaVuelo) {

		List<Vuelo> listaV = this.iVueloService.buscarVuelosOrigenDestino(origen, destino, fechaVuelo);
		CompletableFuture<List<Vuelo>> valor1 = this.iVueloService.buscarVuelosTipo(listaV, "E");
		CompletableFuture<List<Vuelo>> valor2 = this.iVueloService.buscarVuelosTipo(listaV, "N");
		CompletableFuture<List<Vuelo>> valor3 = this.iVueloService.buscarVuelosTipo(listaV, "T");

		CompletableFuture.allOf(valor1, valor2, valor3).join();
		List<Vuelo> listaUnida = new ArrayList<>();
		try {
			listaUnida.addAll(valor1.get());
			listaUnida.addAll(valor2.get());
			listaUnida.addAll(valor3.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		return listaUnida;
	}

	@Override
	public void reservarVuelos(String numeroVuelo) {
		// TODO Auto-generated method stub

	}

}
