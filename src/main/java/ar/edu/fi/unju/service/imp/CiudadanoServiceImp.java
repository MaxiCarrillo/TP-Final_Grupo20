package ar.edu.fi.unju.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.fi.unju.entity.Ciudadano;
import ar.edu.fi.unju.repository.CiudadanoRepository;
import ar.edu.fi.unju.service.ICiudadanoService;

@Service
public class CiudadanoServiceImp implements ICiudadanoService {

	@Autowired
	CiudadanoRepository ciudadanoRepository;
	
	@Override
	public Ciudadano getCiudadano() {
		return new Ciudadano();
	}

	@Override
	public void guardarCiudadano(Ciudadano ciudadano) {
		ciudadanoRepository.save(ciudadano);
	}

	@Override
	public void modificarCiudadano(Ciudadano ciudadano) {
		ciudadanoRepository.save(ciudadano);
	}

	@Override
	public void eliminarCiudadano(int dni) {

	}

	@Override
	public List<Ciudadano> getListaCiudadano() {
		// TODO Auto-generated method stub
		return ciudadanoRepository.findAll();
	}

	@Override
	public Ciudadano buscarCiudadano(long id) {
		return ciudadanoRepository.findById(id).get();
	}

}
