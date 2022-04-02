package ec.edu.uce.repository;

import java.util.List;

import ec.edu.uce.modelo.Vuelo;

public interface IVueloRepo {

	void insertar(Vuelo vuelo);

	void actualizar(Vuelo vuelo);

	void borrar(Integer id);

	Vuelo buscar(Integer id);

	List<Vuelo> buscarVuelosOrigenDestino(String origen, String destino, String fechaVuelo);
}
