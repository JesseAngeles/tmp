package com.ipn.mx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ipn.mx.modelo.repositorios.CategoriaRepository;

@SpringBootApplication
public class ProyectoProductosApplication
		implements CommandLineRunner {
	@Autowired
	CategoriaRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoProductosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Inicio");
	}

}