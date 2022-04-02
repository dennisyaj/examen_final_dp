package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.CompraPasaje;
import ec.edu.uce.repository.IClienteRepo;
import ec.edu.uce.repository.ICompraPasajeRepo;

@Service
public class CompraPasajeServiceImpl implements ICompraPasajeService {

	@Autowired
	private ICompraPasajeRepo iCompraPasajeRepo;

	@Override
	public void insertar(CompraPasaje compraPasaje) {
		compraPasaje.setCheck("R");
		this.iCompraPasajeRepo.insertar(compraPasaje);
	}

	@Override
	public void actualizar(CompraPasaje compraPasaje) {
		this.iCompraPasajeRepo.actualizar(compraPasaje);
	}

	@Override
	public void borrar(Integer id) {
		this.iCompraPasajeRepo.borrar(id);
	}

	@Override
	public CompraPasaje buscar(Integer id) {
		return this.iCompraPasajeRepo.buscar(id);
	}

	@Override
	public CompraPasaje buscarNumero(String numero) {

		return this.iCompraPasajeRepo.buscarNumero(numero);
	}

}
