package ar.edu.fi.unju.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ofertas_laborales")
public class OfertaLaboral {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ofl_id")
	private long id;
	
	@Column(name = "ofl_cantidadVacantes") //
	private int cantidadVacantes;
	
	@Column(name = "ofl_resumenPuesto") //
	private String resumenPuesto;
	
	@Column(name = "ofl_disponbilidadHoraria") //
	private String disponibilidadHoraria;
	
	@Column(name = "ofl_principalesTareas") //
	private String principalesTareas;
	
	@Column(name = "ofl_datosContacto") //
	private String datosContacto;
	
	@Column(name = "ofl_jornada") //
	private String jornada;
	
	@Column(name = "ofl_requisitos") //
	private String requisitos;
	
	@Column(name = "ofl_salario") //
	private double salario;
	
	@Column(name = "ofl_beneficios") //
	private String beneficios;
	
	@Column(name = "ofl_disponible")
	private boolean disponible;
	
	/*Una o muchas ofertas tienen un empleador
	tambien se utiliza un @Autowired*/
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "emp_id")
	private Empleador empleador;
	
	public OfertaLaboral() {
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getCantidadVacantes() {
		return cantidadVacantes;
	}

	public void setCantidadVacantes(int cantidadVacantes) {
		this.cantidadVacantes = cantidadVacantes;
	}

	public String getResumenPuesto() {
		return resumenPuesto;
	}

	public void setResumenPuesto(String resumenPuesto) {
		this.resumenPuesto = resumenPuesto;
	}

	public String getDisponibilidadHoraria() {
		return disponibilidadHoraria;
	}

	public void setDisponibilidadHoraria(String disponibilidadHoraria) {
		this.disponibilidadHoraria = disponibilidadHoraria;
	}

	public String getPrincipalesTareas() {
		return principalesTareas;
	}

	public void setPrincipalesTareas(String principalesTareas) {
		this.principalesTareas = principalesTareas;
	}

	public String getDatosContacto() {
		return datosContacto;
	}

	public void setDatosContacto(String datosContacto) {
		this.datosContacto = datosContacto;
	}

	public String getJornada() {
		return jornada;
	}

	public void setJornada(String jornada) {
		this.jornada = jornada;
	}

	public String getRequisitos() {
		return requisitos;
	}

	public void setRequisitos(String requisitos) {
		this.requisitos = requisitos;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getBeneficios() {
		return beneficios;
	}

	public void setBeneficios(String beneficios) {
		this.beneficios = beneficios;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public Empleador getEmpleador() {
		return empleador;
	}

	public void setEmpleador(Empleador empleador) {
		this.empleador = empleador;
	}

	public OfertaLaboral(int cantidadVacantes, String resumenPuesto, String disponibilidadHoraria,
			String principalesTareas, String datosContacto, String jornada, String requisitos, double salario,
			String beneficios, boolean disponible, Empleador empleador) {
		super();
		this.cantidadVacantes = cantidadVacantes;
		this.resumenPuesto = resumenPuesto;
		this.disponibilidadHoraria = disponibilidadHoraria;
		this.principalesTareas = principalesTareas;
		this.datosContacto = datosContacto;
		this.jornada = jornada;
		this.requisitos = requisitos;
		this.salario = salario;
		this.beneficios = beneficios;
		this.disponible = disponible;
		this.empleador = empleador;
	}
}
