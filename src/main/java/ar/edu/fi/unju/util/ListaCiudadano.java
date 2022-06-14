package ar.edu.fi.unju.util;

import java.util.ArrayList;
import java.util.List;

import ar.edu.fi.unju.entity.Ciudadano;

public class ListaCiudadano {
	
	private List<Ciudadano> ciudadanos;
	
	public ListaCiudadano() {
		// TODO Auto-generated constructor stub
		ciudadanos = new ArrayList<Ciudadano>();
	}

	public List<Ciudadano> getCiudadanos() {
		return ciudadanos;
	}

	public void setCiudadanos(List<Ciudadano> ciudadanos) {
		this.ciudadanos = ciudadanos;
	}
	
}
