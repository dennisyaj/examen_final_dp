package ec.edu.uce.controller;

import java.util.List;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ec.edu.uce.modelo.BuscarVueloTO;
import ec.edu.uce.modelo.Vuelo;
import ec.edu.uce.service.IVueloService;

@Controller
@RequestMapping("/clientes/")
public class ClienteController {

	@Autowired
	private IVueloService iVueloService;

	Function<BuscarVueloTO, List<Vuelo>> datos = b -> {

		return this.iVueloService.buscarVuelosOrigenDestino(b.getOrigen(), b.getDestino(),
				b.getFechaVuelo().toString());
	};

	@GetMapping("buscarVuelo")
	public String obtenerPaginaIngresoDatos(Vuelo vuelo) {
		return "vueloNuevo";
	}

	@PostMapping("insertar")
	public String insertar(BuscarVueloTO vuelo, BindingResult result, Model modelo,
			RedirectAttributes redirectAttributes) {
		List<Vuelo> vuelos = this.datos.apply(vuelo);
		modelo.addAttribute("listaVuelos", vuelos);
		return "todos";
	}

	@GetMapping("todos")
	public String buscarTodos(Model modelo) {
		List<Vuelo> listaVuelos = this.iVueloService.buscarTodos();
		modelo.addAttribute("listVuelos", listaVuelos);
		return "todos";
	}
}
