package com.ipn.mx.modelo.entidades;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "Articulo")
public class Articulo implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idArticulo;

	@NotBlank(message = "El nombre es obligatorio")
	@Size(min = 5, max = 50, message = "Debe de estar en un rango entr 5 y 50")
	@Column(name = "nombreArticulo", length = 50, nullable = false)
	private String nombreArticulo;

	@NotBlank(message = "La descripción es obligatoria")
	@Size(min = 5, max = 250, message = "Debe de estar en un rango entr 5 y 250")
	@Column(name = "descripcionArticulo", length = 250, nullable = false)
	private String descripcionArticulo;

	@Column(name = "existencia", nullable = false)
	private int existencia;

	@Column(name = "precio", nullable = false)
	private double precio;

	@ManyToOne
	@JoinColumn(name = "idCategoria")
	private Categoria categoria;

	public void setNombreArticulo(String nombreArticulo) {
		this.nombreArticulo = nombreArticulo;
	}

	public void setDescripcionArticulo(String descripcionArticulo) {
		this.descripcionArticulo = descripcionArticulo;
	}

	public void setExistencia(int existencia) {
		this.existencia = existencia;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public void setIdCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
}
