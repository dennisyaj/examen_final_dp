package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Avion;
import ec.edu.uce.repository.IAvionRepo;

@Service
public class AvionServiceImpl implements IAvionService {

	@Autowired
	private IAvionRepo iAvionRepo;

	@Override
	public void insertar(Avion avion) {
		this.iAvionRepo.insertar(avion);
	}

	@Override
	public void actualizar(Avion avion) {
		this.iAvionRepo.actualizar(avion);
	}

	@Override
	public void borrar(Integer id) {
		this.iAvionRepo.borrar(id);
	}

	@Override
	public Avion buscar(Integer id) {
		return this.iAvionRepo.buscar(id);
	}

}
