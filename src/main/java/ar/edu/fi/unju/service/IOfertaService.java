package ar.edu.fi.unju.service;

import java.util.List;

import ar.edu.fi.unju.entity.OfertaLaboral;

public interface IOfertaService {
	public OfertaLaboral getOferta();
	public void guardarOferta(OfertaLaboral ofertaLaboral);
	public void modificarOferta(OfertaLaboral ofertaLaboral);
	public void eliminarOferta(long id);
	public List<OfertaLaboral> getListaOferta();
	public OfertaLaboral buscarOferta(long id);
}
