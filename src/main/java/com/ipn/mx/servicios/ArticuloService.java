package com.ipn.mx.servicios;

import java.util.List;

import com.ipn.mx.modelo.entidades.Articulo;

public interface ArticuloService {
    public List<Articulo> findAll();

    public Articulo findById(Long id);

    public void deleteById(Long id);

    public Articulo save(Articulo articulo);

    public List<Articulo> findByIdCategoria(Long idCategoria);
}
