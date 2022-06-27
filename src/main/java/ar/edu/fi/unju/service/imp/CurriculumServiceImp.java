package ar.edu.fi.unju.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.fi.unju.entity.CurriculumVitae;
import ar.edu.fi.unju.repository.CurriculumRepository;
import ar.edu.fi.unju.service.ICurriculumService;

@Service
public class CurriculumServiceImp implements ICurriculumService {

	@Autowired
	CurriculumRepository curriculumRepository;
	
	@Override
	public CurriculumVitae getCurriculum() {
		return new CurriculumVitae();
	}

	@Override
	public void guardarCurriculum(CurriculumVitae curriculum) {
		curriculumRepository.save(curriculum);
	}

	@Override
	public void modificarCurriculum(CurriculumVitae curriculum) {
		curriculumRepository.save(curriculum);
	}

	@Override
	public void eliminarCurriculum(long id) {
		curriculumRepository.deleteById(id);
	}

	@Override
	public List<CurriculumVitae> getListaCurriculum() {
		return curriculumRepository.findAll();
	}

	@Override
	public CurriculumVitae buscarCurriculum(long id) {
		return curriculumRepository.findById(id).get();
	}

}
