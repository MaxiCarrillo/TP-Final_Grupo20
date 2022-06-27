package ar.edu.fi.unju.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.fi.unju.entity.OfertaLaboral;
import ar.edu.fi.unju.repository.OfertaRepository;
import ar.edu.fi.unju.service.IOfertaService;

@Service
public class OfertaServiceImp implements IOfertaService {

	@Autowired
	OfertaRepository ofertaRepository;
	
	@Override
	public OfertaLaboral getOferta() {
		return new OfertaLaboral();
	}

	@Override
	public void guardarOferta(OfertaLaboral ofertaLaboral) {
		ofertaRepository.save(ofertaLaboral);
	}

	@Override
	public void modificarOferta(OfertaLaboral ofertaLaboral) {
		ofertaRepository.save(ofertaLaboral);
	}

	@Override
	public void eliminarOferta(long id) {
		ofertaRepository.deleteById(id);
	}

	@Override
	public List<OfertaLaboral> getListaOferta() {
		return ofertaRepository.findAll();
	}

	@Override
	public OfertaLaboral buscarOferta(long id) {
		return ofertaRepository.findById(id).get();
	}

}
