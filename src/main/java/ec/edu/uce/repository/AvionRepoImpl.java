package ec.edu.uce.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Avion;

@Transactional
@Repository
public class AvionRepoImpl implements IAvionRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Avion avion) {
		this.entityManager.persist(avion);
	}

	@Override
	public void actualizar(Avion avion) {
		this.entityManager.merge(avion);
	}

	@Override
	public void borrar(Integer id) {
		this.entityManager.remove(this.buscar(id));
	}

	@Override
	public Avion buscar(Integer id) {
		return this.entityManager.find(Avion.class, id);
	}

}
