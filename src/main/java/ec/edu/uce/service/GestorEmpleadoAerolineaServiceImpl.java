package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.CompraPasaje;

@Service
public class GestorEmpleadoAerolineaServiceImpl implements IGestorEmpleadoAerolineaService {
	@Autowired
	private ICompraPasajeService iCompraPasajeService;

	@Override
	public void realizarCheck(String numero) {
		CompraPasaje compraPasaje = this.iCompraPasajeService.buscarNumero(numero);
		compraPasaje.setCheck("I");

	}

}
