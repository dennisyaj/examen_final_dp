package ec.edu.uce.service;

import java.util.List;

import ec.edu.uce.modelo.Vuelo;

public interface IGestorClienteAerolineaService {

	public List<Vuelo> buscarVuelosDisponibles(String origen, String destino, String fechaVuelo);

	public void reservarVuelos(String numeroVuelo);
}
