package ec.edu.uce.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.CompraPasaje;

@Transactional
@Repository
public class CompraPasajeRepoImpl implements ICompraPasajeRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(CompraPasaje compraPasaje) {
		this.entityManager.persist(compraPasaje);

	}

	@Override
	public void actualizar(CompraPasaje compraPasaje) {
		this.entityManager.merge(compraPasaje);

	}

	@Override
	public void borrar(Integer id) {
		this.entityManager.remove(this.buscar(id));

	}

	@Override
	public CompraPasaje buscar(Integer id) {
		return this.entityManager.find(CompraPasaje.class, id);
	}

	@Override
	public CompraPasaje buscarNumero(String numero) {
		TypedQuery<CompraPasaje> myQuery = this.entityManager
				.createQuery("SELECT c FROM CompraPasaje c WHERE c.numero=:numero", CompraPasaje.class);
		myQuery.setParameter("numero", numero);
		return myQuery.getSingleResult();
	}

}
