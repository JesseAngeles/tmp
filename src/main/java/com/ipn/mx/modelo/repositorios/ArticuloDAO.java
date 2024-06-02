package com.ipn.mx.modelo.repositorios;

import com.ipn.mx.modelo.entidades.Articulo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

public class ArticuloDAO {
    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void insertarArticulo(Articulo articulo) {
        entityManager.persist(articulo);
    }
}
