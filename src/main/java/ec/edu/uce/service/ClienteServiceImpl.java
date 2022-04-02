package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Cliente;
import ec.edu.uce.repository.IClienteRepo;

@Service
public class ClienteServiceImpl implements IClienteService {
	
	@Autowired
	private IClienteRepo iClienteRepo;

	@Override
	public void insertar(Cliente cliente) {
		this.iClienteRepo.insertar(cliente);
	}

	@Override
	public void actualizar(Cliente cliente) {
		this.iClienteRepo.actualizar(cliente);
	}

	@Override
	public void borrar(Integer id) {
		this.iClienteRepo.borrar(id);
	}

	@Override
	public Cliente buscar(Integer id) {
		return this.iClienteRepo.buscar(id);
	}

}
