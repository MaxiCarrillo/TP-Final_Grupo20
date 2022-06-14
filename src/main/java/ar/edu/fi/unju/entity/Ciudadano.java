package ar.edu.fi.unju.entity;

import java.time.LocalDate;

public class Ciudadano {
	
	private int nTramite;
	private int dni;
	private String email;
	private String estadoCivil;
	private String provincia;
	private int telefono;
	private LocalDate fechaNacimiento;
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
