package com.ipn.mx.integracion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ipn.mx.modelo.entidades.Articulo;
import com.ipn.mx.servicios.ArticuloServiceImpl;

@CrossOrigin(origins = { "*" })
@RestController
@RequestMapping("/apiArticulo")
public class ArticuloController {
    @Autowired
    ArticuloServiceImpl service;

    @GetMapping("/articulos")
    @ResponseStatus(HttpStatus.OK)
    public List<Articulo> mostrarArticulo() {
        return service.findAll();
    }

    @GetMapping("/articulos/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Articulo mostrarArticulo(@PathVariable("id") Long id) {
        return service.findById(id);
    }

    @PostMapping("/articulos")
    @ResponseStatus(HttpStatus.CREATED)
    public Articulo crearArticulo(@RequestBody Articulo articulo) {
        return service.save(articulo);
    }

    @PutMapping("/articulos/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Articulo actualizarArticulo(@RequestBody Articulo articulo, @PathVariable("id") Long id) {
        Articulo a = service.findById(id);

        a.setDescripcionArticulo(articulo.getDescripcionArticulo());
        a.setExistencia(articulo.getExistencia());
        a.setNombreArticulo(articulo.getNombreArticulo());
        a.setPrecio(articulo.getPrecio());

        return service.save(a);
    }

    @GetMapping("/articulos/categoria:{id}")
    @ResponseStatus(HttpStatus.OK)
    public List<Articulo> mostrarArticulosPorCategoria(@PathVariable("id") Long id) {
        return (List<Articulo>) service.findByIdCategoria(id);
    }

}
