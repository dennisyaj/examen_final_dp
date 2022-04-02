package ec.edu.uce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ec.edu.uce.modelo.BuscarVueloTO;
import ec.edu.uce.modelo.Vuelo;

@Controller
@RequestMapping("/clientes/")
public class ClienteController {

	@GetMapping("buscarVuelo")
	public String obtenerPaginaIngresoDatos(Vuelo vuelo) {
		return "vueloNuevo";
	}

	@PostMapping("insertar")
	public String insertarEstudiante(BuscarVueloTO vuelo, BindingResult result, Model modelo,
			RedirectAttributes redirectAttributes) {
//		this.iEstudianteService.insertarEstudinte(estudiante);
		redirectAttributes.addFlashAttribute("mensaje", "Estudiante guadardo");
		// posibles paginas repuestas para despues de insertar
		return "redirect:/estudiantes/todos";
	}

}
