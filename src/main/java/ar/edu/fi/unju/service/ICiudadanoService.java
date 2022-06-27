package ar.edu.fi.unju.service;

import java.util.List;

import ar.edu.fi.unju.entity.Ciudadano;

public interface ICiudadanoService {
	public Ciudadano getCiudadano();
	public void guardarCiudadano(Ciudadano ciudadano);
	public void modificarCiudadano(Ciudadano ciudadano);
	public void eliminarCiudadano(int dni);
	public List<Ciudadano> getListaCiudadano();
	public Ciudadano buscarCiudadano(long id);
}
