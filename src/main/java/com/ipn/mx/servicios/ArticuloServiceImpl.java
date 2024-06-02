package com.ipn.mx.servicios;

import java.util.List;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ipn.mx.modelo.entidades.Articulo;
import com.ipn.mx.modelo.repositorios.ArticuloRepository;

@Service
public class ArticuloServiceImpl implements ArticuloService {

    @Autowired
    ArticuloRepository repository;

    @Override
    @Transactional(readOnly = true)
    public List<Articulo> findAll() {
        return (List<Articulo>) repository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Articulo findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    @Transactional
    public Articulo save(Articulo articulo) {
        return repository.save(articulo);
    }

    public List<Articulo> findByIdCategoria(Long id) {
        List<Articulo> articulos = (List<Articulo>) repository.findAll();
        Iterator<Articulo> iterator = articulos.iterator();

        while (iterator.hasNext()) {
            Articulo articulo = iterator.next();
            if (articulo.getCategoria().getIdCategoria() != id) {
                iterator.remove();
            }
        }

        return articulos;
    }
}
