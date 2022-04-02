package ec.edu.uce.service;

import ec.edu.uce.modelo.Cliente;

public interface IClienteService {
	
	void insertar(Cliente cliente);

	void actualizar(Cliente cliente);

	void borrar(Integer id);

	Cliente buscar(Integer id);
}
