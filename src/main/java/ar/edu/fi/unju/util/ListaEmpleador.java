package ar.edu.fi.unju.util;

import java.util.ArrayList;
import java.util.List;

import ar.edu.fi.unju.entity.Empleador;

public class ListaEmpleador {

	private List<Empleador> empleadores;
	
	public ListaEmpleador() {
		// TODO Auto-generated constructor stub
		empleadores = new ArrayList<Empleador>();
	}

	public List<Empleador> getEmpleadores() {
		return empleadores;
	}

	public void setEmpleadores(List<Empleador> empleadores) {
		this.empleadores = empleadores;
	}
	
}
