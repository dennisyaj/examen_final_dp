package ec.edu.uce.service;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Vuelo;
import ec.edu.uce.repository.IVueloRepo;

@Service
public class VueloServiceImpl implements IVueloService {

	@Autowired
	private IVueloRepo iVueloRepo;

	@Override
	public void insertar(Vuelo vuelo) {
		this.iVueloRepo.insertar(vuelo);
	}

	@Override
	public void actualizar(Vuelo vuelo) {
		this.iVueloRepo.actualizar(vuelo);
	}

	@Override
	public void borrar(Integer id) {
		this.iVueloRepo.borrar(id);
	}

	@Override
	public Vuelo buscar(Integer id) {
		return this.iVueloRepo.buscar(id);
	}

	@Override
	@Async
	public CompletableFuture<List<Vuelo>> buscarVuelosTipo(List<Vuelo> listaVuelo, String tipo) {
		List<Vuelo> filtrada = listaVuelo.stream().filter(a -> a.getCategoria().compareTo(tipo) == 0)
				.filter(a -> a.getEstado().compareTo("D") == 0).collect(Collectors.toList());
		return CompletableFuture.completedFuture(filtrada);
	}

	@Override
	public List<Vuelo> buscarVuelosOrigenDestino(String origen, String destino, String fechaVuelo) {
		return this.iVueloRepo.buscarVuelosOrigenDestino(origen, destino, fechaVuelo);
	}

	@Override
	public List<Vuelo> buscarTodos() {
		return this.iVueloRepo.buscarTodos();
	}

}
