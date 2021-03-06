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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.fi.unju.entity.Ciudadano;
import ar.edu.fi.unju.entity.CurriculumVitae;
import ar.edu.fi.unju.service.ICiudadanoService;

@Controller
@RequestMapping("/ciudadano")
public class CiudadanoController {
	
	@Autowired
	ICiudadanoService ciudadanoService;
	
	Log LOGGER = LogFactory.getLog(CiudadanoController.class);
	
	@GetMapping("/cargar")
	public String ciudadanoCargarPage(Model model) {
		model.addAttribute("ciudadanoAlias", ciudadanoService.getCiudadano());
		return "nuevoCiudadano";
	}

	@PostMapping("")
	public ModelAndView agregarCiudadano(@Validated @ModelAttribute("ciudadanoAlias") Ciudadano ciudadano, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			ModelAndView modeloVista = new ModelAndView ("nuevoCiudadano");
			modeloVista.addObject("ciudadanoAlias", ciudadano);
			return modeloVista;
		}
		
		ModelAndView modeloVista = new ModelAndView ("redirect:/ciudadano/listaCiudadanos");
		ciudadanoService.guardarCiudadano(ciudadano);
		LOGGER.info("Guarda un ciudadano en la base de datos");
		return modeloVista;
	}
	
	@GetMapping("/listaCiudadanos")
	public String mostrarCiudadanos(Model model) {
		model.addAttribute("ciudadanos", ciudadanoService.getListaCiudadano());
		return "ciudadanos";
	}
	
	@GetMapping("/crear/cv")
	public String curriculumCargarPage(Model model) {
		model.addAttribute("curriculumAlias", new CurriculumVitae());
		return "crearCurriculum";
	}
}
