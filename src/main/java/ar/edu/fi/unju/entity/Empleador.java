package ar.edu.fi.unju.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "empleadores")
public class Empleador {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "emp_id")
	private long id;
	
	@Column(name ="emp_cuit")
	private String cuit;
	
	@Column(name ="emp_contraseña")
	private String contraseña;
	
	@Column(name ="emp_razonSocial")
	private String razonSocial;
	
	@Column(name = "emp_nombreComercial")
	private String nombreComercial;
	
	@Column(name = "emp_email")
	private String email;
	
	@Column(name = "emp_domicilio")
	private String domicilio;
	
	@Column(name = "emp_provincia")
	private String provincia;
	
	@Column(name = "emp_paginaWeb")
	private String paginaWeb;
	
	@Column(name = "emp_descripcion")
	private String descripcion;
	
	@Column(name = "emp_fechaInicio")
	private LocalDate fechaInicio;
	
	@Column(name = "emp_telefono")
	private int telefono;
	
	public Empleador() {
		// TODO Auto-generated constructor stub
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCuit() {
		return cuit;
	}
	public void setCuit(String cuit) {
		this.cuit = cuit;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	public String getNombreComercial() {
		return nombreComercial;
	}
	public void setNombreComercial(String nombreComercial) {
		this.nombreComercial = nombreComercial;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getPaginaWeb() {
		return paginaWeb;
	}
	public void setPaginaWeb(String paginaWeb) {
		this.paginaWeb = paginaWeb;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public LocalDate getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	public Empleador(String cuit, String contraseña, String razonSocial, String nombreComercial, String email,
			String domicilio, String provincia, String paginaWeb, String descripcion, LocalDate fechaInicio,
			int telefono) {
		super();
		this.cuit = cuit;
		this.contraseña = contraseña;
		this.razonSocial = razonSocial;
		this.nombreComercial = nombreComercial;
		this.email = email;
		this.domicilio = domicilio;
		this.provincia = provincia;
		this.paginaWeb = paginaWeb;
		this.descripcion = descripcion;
		this.fechaInicio = fechaInicio;
		this.telefono = telefono;
	}
}
