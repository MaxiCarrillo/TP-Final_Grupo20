package ar.edu.fi.unju.service;

import java.util.List;

import ar.edu.fi.unju.entity.CurriculumVitae;

public interface ICurriculumService {
	public CurriculumVitae getCurriculum();
	public void guardarCurriculum(CurriculumVitae curriculum);
	public void modificarCurriculum(CurriculumVitae curriculum);
	public void eliminarCurriculum(long id);
	public List<CurriculumVitae> getListaCurriculum();
	public CurriculumVitae buscarCurriculum(long id);
}
