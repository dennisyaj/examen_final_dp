package ec.edu.uce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ec.edu.uce.modelo.CheckTO;
import ec.edu.uce.modelo.CompraPasaje;
import ec.edu.uce.service.ICompraPasajeService;

@Controller
@RequestMapping("/empleados/")
public class EmpleadoController {

	@Autowired
	private ICompraPasajeService iCompraPasajeService;

	@GetMapping("check/{idNumero}")
	private String obtenerPaginaAtualizarDatos(@PathVariable("idNumero") String numero, CompraPasaje compraPasaje,
			Model modelo) {

		modelo.addAttribute("compraPasaje", this.iCompraPasajeService.buscarNumero(numero));
		return "check";
	}

	@PutMapping("actualizarcheck/{idNumero}")
	public String actualizarEstudiante(@PathVariable("idNumero") String idNumero, CheckTO compraPasaje,
			Model modelo) {

//		this.iEstudianteService.actualizarEstudinte(estudiante);

//		List<Estudiante> listaEstudiantes = this.iEstudianteService.buscarTodos();
//		modelo.addAttribute("listEstudiantes", listaEstudiantes);
//
//		return "index";
		return "redirect:/estudiantes/todos";

	}
}
