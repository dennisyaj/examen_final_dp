package ec.edu.uce.repository;

import ec.edu.uce.modelo.Avion;

public interface IAvionRepo {

	void insertar(Avion avion);

	void actualizar(Avion avion);

	void borrar(Integer id);

	Avion buscar(Integer id);
}
