package com.ipn.mx.modelo.repositorios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.ipn.mx.modelo.entidades.Categoria;

public class TMPCategoriaRepositoryImpl implements TMPCategoriaRepository {
	@Autowired
    private JdbcTemplate jdbcTemplate;
	@Override
	public Categoria findById(int id) {
		String SQL = "SELECT * FROM categoria WHERE idCategoria = ?";
	    return jdbcTemplate.queryForObject(SQL, BeanPropertyRowMapper.newInstance(Categoria.class), id);
	}
	

}
