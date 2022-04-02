package ec.edu.uce.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Cliente;

@Transactional
@Repository
public class ClienteRepoImpl implements IClienteRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Cliente cliente) {
		this.entityManager.persist(cliente);

	}

	@Override
	public void actualizar(Cliente cliente) {
		this.entityManager.merge(cliente);

	}

	@Override
	public void borrar(Integer id) {
		this.entityManager.remove(this.buscar(id));

	}

	@Override
	public Cliente buscar(Integer id) {
		return this.entityManager.find(Cliente.class, id);
	}

}
