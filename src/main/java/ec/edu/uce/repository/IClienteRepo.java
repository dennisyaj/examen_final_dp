package ec.edu.uce.repository;

import ec.edu.uce.modelo.Cliente;

public interface IClienteRepo {
	
	void insertar(Cliente cliente);

	void actualizar(Cliente cliente);

	void borrar(Integer id);

	Cliente buscar(Integer id);
}
