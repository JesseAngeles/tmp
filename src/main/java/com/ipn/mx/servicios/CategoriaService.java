package com.ipn.mx.servicios;

import java.util.List;

import com.ipn.mx.modelo.entidades.Categoria;

public interface CategoriaService {
	public List<Categoria> findAll();

	public Categoria findById(Long id);

	public void deleteById(Long id);

	public Categoria save(Categoria categoria);

}
