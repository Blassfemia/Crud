package com.api.crud.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

//Tablas y columnas base datos 

@Entity
@Table(name = "libros")
@Data
public class Book {
	
	@Id
	@Column(name = "id_libro")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idBook;
	
	@Column(name = "nombre_libro")
	private String nameBook;
	
	@Column(name = "autor_libro")
	private String autorBook;

}
