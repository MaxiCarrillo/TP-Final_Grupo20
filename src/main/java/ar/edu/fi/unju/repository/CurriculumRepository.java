package ar.edu.fi.unju.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.edu.fi.unju.entity.CurriculumVitae;

public interface CurriculumRepository extends JpaRepository<CurriculumVitae, Long>{

}
