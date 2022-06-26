package ar.edu.fi.unju.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "empleadores")
public class Empleador {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "emp_id")
	private long id;
	
	@NotEmpty
	@Column(name ="emp_cuit")
	private String cuit;
	
	@NotEmpty
	@Column(name ="emp_contraseña")
	private String contraseña;
	
	@NotEmpty
	@Column(name ="emp_razonSocial")
	private String razonSocial;
	
	@NotEmpty
	@Column(name = "emp_nombreComercial")
	private String nombreComercial;
	
	@NotEmpty
	@Column(name = "emp_email")
	private String email;
	
	@NotEmpty
	@Column(name = "emp_domicilio")
	private String domicilio;
	
	@NotEmpty
	@Column(name = "emp_provincia")
	private String provincia;
	
	@NotEmpty
	@Column(name = "emp_paginaWeb")
	private String paginaWeb;
	
	@NotEmpty
	@Column(name = "emp_descripcion")
	private String descripcion;
	
	@Past
	@NotNull(message="La fecha no puede ser nula")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@Column(name = "emp_fechaInicio")
	private LocalDate fechaInicio;
	
	@NotNull
	@Column(name = "emp_telefono")
	private long telefono;
	
	//Autorecupera
	@OneToMany(mappedBy = "empleador")
	private List<OfertaLaboral> ofertasLaborales = new ArrayList<OfertaLaboral>();
	
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
	public long getTelefono() {
		return telefono;
	}
	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}
	
	public List<OfertaLaboral> getOfertasLaborales() {
		return ofertasLaborales;
	}

	public void setOfertasLaborales(List<OfertaLaboral> ofertasLaborales) {
		this.ofertasLaborales = ofertasLaborales;
	}
	
	public Empleador(String cuit, String contraseña, String razonSocial, String nombreComercial, String email,
			String domicilio, String provincia, String paginaWeb, String descripcion, LocalDate fechaInicio,
			long telefono) {
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
