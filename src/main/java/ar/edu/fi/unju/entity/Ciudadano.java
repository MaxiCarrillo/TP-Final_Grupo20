package ar.edu.fi.unju.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ciudadanos")
public class Ciudadano {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ciu_nTramite")
	private int nTramite;
	
	@Column(name = "ciu_dni")
	private int dni;
	
	@Column(name = "ciu_email")
	private String email;
	
	@Column(name = "ciu_estadoCivil")
	private String estadoCivil;
	
	@Column(name = "ciu_provincia")
	private String provincia;
	
	@Column(name = "ciu_telefono")
	private int telefono;
	
	@Column(name = "ciu_fechaNacimiento")
	private LocalDate fechaNacimiento;
	
	@Column(name = "ciu_contraseña")
	private String contraseña;
	
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
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
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
	
	public Ciudadano(int dni, String email, String estadoCivil, String provincia, int telefono,
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
