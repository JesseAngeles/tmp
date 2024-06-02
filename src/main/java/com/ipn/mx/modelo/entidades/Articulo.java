package com.ipn.mx.modelo.entidades;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Articulo")
public class Articulo {
	private Long idArticulo;
	private String nombreArticulo;
	private String descripcionArticulo;
	private int existencia;
	private double precio;
	@ManyToOne
	@JoinColumn(name="idCategoria")
	@Id
	//@JsonBackReference
	private Categoria idCategroia;

}
