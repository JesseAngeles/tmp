package com.ipn.mx.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ipn.mx.modelo.entidades.Categoria;
import com.ipn.mx.modelo.repositorios.CategoriaRepository;

@Service
public class CategoriaServiceImpl implements CategoriaService {
	@Autowired
	CategoriaRepository repository;

	@Override
	@Transactional(readOnly = true)
	public List<Categoria> findAll() {
		return (List<Categoria>) repository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Categoria findById(Long id) {
		return repository.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		repository.deleteById(id);
	}

	@Override
	@Transactional
	public Categoria save(Categoria categoria) {
		return repository.save(categoria);
	}

}
