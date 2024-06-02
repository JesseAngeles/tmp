package com.ipn.mx.modelo.repositorios;

import org.springframework.data.repository.CrudRepository;

import com.ipn.mx.modelo.entidades.Articulo;

public interface ArticuloRepository extends CrudRepository<Articulo, Long> {
}
