package com.ipn.mx.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ipn.mx.modelo.entidades.Categoria;
import com.ipn.mx.modelo.repositorios.CategoriaRepository;
import com.ipn.mx.modelo.repositorios.TMPCategoriaRepository;

@Service
public class CategoriaServiceImpl implements CategoriaService {
	@Autowired
	CategoriaRepository repository;
	TMPCategoriaRepository repository2;
	
	@Override
	@Transactional (readOnly=true)
	public List<Categoria> findAll() {
		return (List<Categoria>) repository.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Categoria findById(Long id) {
		System.out.println(id);
		return repository2.findById(1);
	}

	@Override
	@Transactional
	public void deletById(Long id) {
		repository.deleteById(id);
	}

	@Override
	@Transactional
	public Categoria save(Categoria categoria) {
		return repository.save(categoria);
	}

}
