package com.ipn.mx.integracion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import com.ipn.mx.modelo.entidades.Categoria;
import com.ipn.mx.servicios.CategoriaService;

@CrossOrigin(origins={"*"})
@RestController
@RequestMapping("/apiCategoria")

public class CategoriaController {
	@Autowired
	CategoriaService service;
	
	@GetMapping("/categorias")
	@ResponseStatus(HttpStatus.OK)
	
		public List<Categoria> mostrarCategoria(){
			return service.findAll();
		}
	
	@GetMapping("/categorias/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	
		public Categoria mostrarCategoria (@PathVariable Long id){
			return service.findById(id);
		}
	
	@PostMapping("/categorias")
	@ResponseStatus(HttpStatus.CREATED)
		public Categoria  crearCategoria (@RequestBody Categoria categoria){
			
			return service.save(categoria);
		}
	
	@PutMapping("/categorias/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Categoria actualizarCategoria(@RequestBody Categoria categoria, @PathVariable Long id) {
		Categoria c = service.findById(id);
	
		return service.save(c);
	}
	
}

