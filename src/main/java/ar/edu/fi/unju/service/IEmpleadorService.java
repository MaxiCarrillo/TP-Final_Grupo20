package ar.edu.fi.unju.service;

import java.util.List;

import ar.edu.fi.unju.entity.Empleador;

public interface IEmpleadorService {
	public Empleador getEmpleador();
	public void guardarEmpleador(Empleador empleador);
	public void modificarEmpleador(Empleador empleador);
	public void eliminarEmpleador(long id);
	public List<Empleador> getListaEmpleador();
	public Empleador buscarEmpleador(long id); 
}
