package ar.edu.fi.unju.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InicioController {
	
	@RequestMapping("/cargar/ciudadano")
	public String requestMethodName(Model model) {
		return "nuevoCiudadano";
	}
	
	@RequestMapping("/cargar/empleador")
	public String requestEmpleado(Model model) {
		return "nuevoEmpleador";
	}

}
