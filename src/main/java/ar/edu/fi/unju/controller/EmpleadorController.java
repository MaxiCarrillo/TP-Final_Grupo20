package ar.edu.fi.unju.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.fi.unju.entity.Empleador;
import ar.edu.fi.unju.entity.OfertaLaboral;
import ar.edu.fi.unju.service.IEmpleadorService;
import ar.edu.fi.unju.service.IOfertaService;

@Controller
@RequestMapping("/empleador")
public class EmpleadorController {

	@Autowired
	IEmpleadorService empleadorService;
	
	@Autowired
	IOfertaService ofertaService;
	
	Log LOGGER = LogFactory.getLog(EmpleadorController.class);
	
	@GetMapping("/cargar")
	public String empleadorCargarPage(Model model) {
		model.addAttribute("empleadorAlias", empleadorService.getEmpleador());
		return "nuevoEmpleador";
	}
	
	@PostMapping("")
	public ModelAndView agregarEmpleador(@Validated @ModelAttribute("empleadorAlias") Empleador empleador, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			ModelAndView modeloVista = new ModelAndView ("nuevoEmpleador");
			modeloVista.addObject("empleadorAlias", empleador);
			return modeloVista;
		}
		
		ModelAndView modeloVista = new ModelAndView ("redirect:/empleador/listaEmpleadores");
		empleadorService.guardarEmpleador(empleador);
		LOGGER.info("Guarda un empleador en la base de datos");
		return modeloVista;
	}
	
	@GetMapping("/listaEmpleadores")
	public String mostrarEmpleadores(Model model) {
		model.addAttribute("empleadores", empleadorService.getListaEmpleador());
		return "empleadores";
	}
	
	@GetMapping("/ver/{id}")
	public ModelAndView verEmpleador(@PathVariable("id") long id) {
		ModelAndView modeloVista = new ModelAndView("verEmpleador");
		modeloVista.addObject("empleadorAlias",empleadorService.buscarEmpleador(id));
		return modeloVista;
	}
	
	@GetMapping("/editar/{id}")
	public ModelAndView editarEmpleador(@PathVariable("id") long id) {
		ModelAndView modeloVista = new ModelAndView("editarEmpleador");
		Empleador empleador = empleadorService.buscarEmpleador(id);
		modeloVista.addObject("empleadorAlias", empleador);
		return modeloVista;
	}
	
	@PostMapping("/modificar")
	public ModelAndView modificarCandidato(@Validated @ModelAttribute("empleadorAlias") Empleador empleador, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			ModelAndView modeloVista = new ModelAndView ("editarEmpleador");
			modeloVista.addObject("empleadorAlias", empleador);
			return modeloVista;
		}
		
		ModelAndView modeloVista = new ModelAndView ("redirect:/empleador/listaEmpleadores");
		empleadorService.modificarEmpleador(empleador);
		LOGGER.info("Modifica el empleador con el ID "+empleador.getId()+" de la base de datos");
		return modeloVista;
		
	}
	
	@GetMapping("/eliminar/{id}")
	public ModelAndView eliminarEmpleador(@PathVariable("id") long id) {
		ModelAndView modeloVista = new ModelAndView("redirect:/empleador/listaEmpleadores");
		empleadorService.eliminarEmpleador(id);
		return modeloVista;
	}
	
	@GetMapping("/crear/oferta")
	public String cargarOfertaPage(Model model) {
		model.addAttribute("ofertaAlias", ofertaService.getOferta());
		return "crearOferta";
	}
	
	@PostMapping("/oferta")
	public ModelAndView ofertaGuardarPage(@Validated @ModelAttribute("ofertaAlias") OfertaLaboral ofertaLaboral, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			ModelAndView modeloVista = new ModelAndView("crearOferta");
			modeloVista.addObject("ofertaAlias", ofertaLaboral);
			return modeloVista;
		}
		
		ModelAndView modeloVista = new ModelAndView("redirect:/empleador/listaEmpleadores");
		ofertaService.guardarOferta(ofertaLaboral);
		return modeloVista;
	}
	
}

