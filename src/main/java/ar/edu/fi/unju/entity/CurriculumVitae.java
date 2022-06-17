package ar.edu.fi.unju.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "curriculums")
public class CurriculumVitae {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cur_id")
	private long id;
	
	@Column(name = "cur_datosIdentidad")
	private String datosIdentidad;
	
	@Column(name = "cur_contacto")
	private String contacto;
	
	@Column(name = "cur_experienciaLaboral")
	private String experienciaLaboral;
	
	@Column(name = "cur_educacion")
	private String educacion;
	
	@Column(name = "cur_idiomas")
	private String idiomas;
	
	@Column(name = "cur_conocimientosInformaticos")
	private String conocimientosInformaticos;
	
	@Column(name = "cur_informacionComplementaria")
	private String informacionComplementaria;
	
	@Column(name = "cur_datosAdicionales")
	private String datosAdicionales;
	
	@OneToOne(mappedBy = "curriculum", fetch = FetchType.LAZY)
	private Ciudadano ciudadano;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDatosIdentidad() {
		return datosIdentidad;
	}
	public void setDatosIdentidad(String datosIdentidad) {
		this.datosIdentidad = datosIdentidad;
	}
	public String getContacto() {
		return contacto;
	}
	public void setContacto(String contacto) {
		this.contacto = contacto;
	}
	public String getExperienciaLaboral() {
		return experienciaLaboral;
	}
	public void setExperienciaLaboral(String experienciaLaboral) {
		this.experienciaLaboral = experienciaLaboral;
	}
	public String getEducacion() {
		return educacion;
	}
	public void setEducacion(String educacion) {
		this.educacion = educacion;
	}
	public String getIdiomas() {
		return idiomas;
	}
	public void setIdiomas(String idiomas) {
		this.idiomas = idiomas;
	}
	public String getConocimientosInformaticos() {
		return conocimientosInformaticos;
	}
	public void setConocimientosInformaticos(String conocimientosInformaticos) {
		this.conocimientosInformaticos = conocimientosInformaticos;
	}
	public String getInformacionComplementaria() {
		return informacionComplementaria;
	}
	public void setInformacionComplementaria(String informacionComplementaria) {
		this.informacionComplementaria = informacionComplementaria;
	}
	public String getDatosAdicionales() {
		return datosAdicionales;
	}
	public void setDatosAdicionales(String datosAdicionales) {
		this.datosAdicionales = datosAdicionales;
	}
	public Ciudadano getCiudadano() {
		return ciudadano;
	}
	public void setCiudadano(Ciudadano ciudadano) {
		this.ciudadano = ciudadano;
	}
	
	public CurriculumVitae(String datosIdentidad, String contacto, String experienciaLaboral, String educacion,
			String idiomas, String conocimientosInformaticos, String informacionComplementaria, String datosAdicionales,
			Ciudadano ciudadano) {
		super();
		this.datosIdentidad = datosIdentidad;
		this.contacto = contacto;
		this.experienciaLaboral = experienciaLaboral;
		this.educacion = educacion;
		this.idiomas = idiomas;
		this.conocimientosInformaticos = conocimientosInformaticos;
		this.informacionComplementaria = informacionComplementaria;
		this.datosAdicionales = datosAdicionales;
		this.ciudadano = ciudadano;
	}
	
}
