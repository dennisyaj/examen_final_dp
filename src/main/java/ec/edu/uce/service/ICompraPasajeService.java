package ec.edu.uce.service;

import ec.edu.uce.modelo.CompraPasaje;

public interface ICompraPasajeService {

	void insertar(CompraPasaje compraPasaje);

	void actualizar(CompraPasaje compraPasaje);

	void borrar(Integer id);

	CompraPasaje buscar(Integer id);

	CompraPasaje buscarNumero(String numero);

}
