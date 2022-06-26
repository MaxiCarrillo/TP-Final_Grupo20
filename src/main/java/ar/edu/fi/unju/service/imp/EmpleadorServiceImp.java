package ar.edu.fi.unju.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.fi.unju.entity.Empleador;
import ar.edu.fi.unju.repository.EmpleadorRepository;
import ar.edu.fi.unju.service.IEmpleadorService;

@Service
public class EmpleadorServiceImp implements IEmpleadorService {

	@Autowired
	EmpleadorRepository empleadorRepository;
	
	@Override
	public Empleador getEmpleador() {
		return new Empleador();
	}

	@Override
	public void guardarEmpleador(Empleador empleador) {
		empleadorRepository.save(empleador);
	}

	@Override
	public void modificarEmpleador(Empleador empleador) {
		empleadorRepository.save(empleador);
		//save sirve para modificar
	}

	@Override
	public void eliminarEmpleador(long id) {
		empleadorRepository.deleteById(id);
	}

	@Override
	public List<Empleador> getListaEmpleador() {
		// TODO Auto-generated method stub
		return empleadorRepository.findAll();
	}

	@Override
	public Empleador buscarEmpleador(long id) {
		return empleadorRepository.findById(id).get();
	}

}
