package ec.edu.uce.service;

import ec.edu.uce.modelo.Avion;

public interface IAvionService {

	void insertar(Avion avion);

	void actualizar(Avion avion);

	void borrar(Integer id);

	Avion buscar(Integer id);
}
