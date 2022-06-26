package ar.edu.fi.unju.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "ciudadanos")
public class Ciudadano {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ciu_id")
	private Long id;
	
	@Column(name = "ciu_nTramite")
	private int nTramite;
	
	@NotNull
	@Column(name = "ciu_dni")
	private int dni;
	
	@NotEmpty @Email
	@Column(name = "ciu_email")
	private String email;
	
	@NotEmpty
	@Column(name = "ciu_estadoCivil")
	private String estadoCivil;
	
	@NotEmpty
	@Column(name = "ciu_provincia")
	private String provincia;
	
	@NotNull
	@Column(name = "ciu_telefono")
	private Long telefono;
	
	@Past
	@NotNull(message="La fecha no puede ser nula")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@Column(name = "ciu_fechaNacimiento")
	private LocalDate fechaNacimiento;
	
	@NotEmpty(message = "Debe ingresar una contraseña")
	@Column(name = "ciu_contraseña")
	private String contraseña;
	
	/*Un ciudadano tiene un Curriculo*/
	@OneToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name = "cur_id")
	private CurriculumVitae curriculum;
	
	public Ciudadano() {
		// TODO Auto-generated constructor stub
	}
	
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public int getnTramite() {
		return nTramite;
	}
	public void setnTramite(int nTramite) {
		this.nTramite = nTramite;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public Long getTelefono() {
		return telefono;
	}
	public void setTelefono(Long telefono) {
		this.telefono = telefono;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public CurriculumVitae getCurriculum() {
		return curriculum;
	}

	public void setCurriculum(CurriculumVitae curriculum) {
		this.curriculum = curriculum;
	}
	
	public Ciudadano(int dni, String email, String estadoCivil, String provincia, Long telefono,
			LocalDate fechaNacimiento, String contraseña) {
		super();
		this.dni = dni;
		this.email = email;
		this.estadoCivil = estadoCivil;
		this.provincia = provincia;
		this.telefono = telefono;
		this.fechaNacimiento = fechaNacimiento;
		this.contraseña = contraseña;
	}

	
}
