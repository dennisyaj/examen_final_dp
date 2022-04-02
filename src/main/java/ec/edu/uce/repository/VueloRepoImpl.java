package ec.edu.uce.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Vuelo;

@Transactional
@Repository
public class VueloRepoImpl implements IVueloRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Vuelo vuelo) {
		this.entityManager.persist(vuelo);
	}

	@Override
	public void actualizar(Vuelo vuelo) {
		this.entityManager.merge(vuelo);

	}

	@Override
	public void borrar(Integer id) {
		this.entityManager.remove(this.buscar(id));

	}

	@Override
	public Vuelo buscar(Integer id) {
		return this.entityManager.find(Vuelo.class, id);
	}

	@Override
	public List<Vuelo> buscarVuelosOrigenDestino(String origen, String destino, String fechaVuelo) {
		TypedQuery<Vuelo> myQuery = this.entityManager.createQuery(
				"SELECT v FROM Vuelo v WHERE v.origen=: origen AND v.destino=:destino AND v.fechaVuelo=:fechaVuelo",
				Vuelo.class);
		myQuery.setParameter("origen", origen);
		myQuery.setParameter("destino", destino);
		myQuery.setParameter("fechaVuelo", fechaVuelo);
		return myQuery.getResultList();
	}

	@Override
	public List<Vuelo> buscarTodos() {
		TypedQuery<Vuelo> myQuery = this.entityManager.createQuery("SELECT v FROM Vuelo v ", Vuelo.class);
		return myQuery.getResultList();
	}

}
