package ec.edu.uce.service;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import ec.edu.uce.modelo.Vuelo;

public interface IVueloService {

	void insertar(Vuelo vuelo);

	void actualizar(Vuelo vuelo);

	void borrar(Integer id);

	Vuelo buscar(Integer id);

	CompletableFuture<List<Vuelo>> buscarVuelosTipo(List<Vuelo> listaVuelo,String tipo);

	List<Vuelo> buscarVuelosOrigenDestino(String origen, String destino, String fechaVuelo);

}
