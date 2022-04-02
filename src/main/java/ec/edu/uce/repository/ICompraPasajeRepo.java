package ec.edu.uce.repository;

import ec.edu.uce.modelo.CompraPasaje;

public interface ICompraPasajeRepo {

	void insertar(CompraPasaje compraPasaje);

	void actualizar(CompraPasaje compraPasaje);

	void borrar(Integer id);

	CompraPasaje buscar(Integer id);

	CompraPasaje buscarNumero(String numero);
}
