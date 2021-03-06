package com.almacen.app.entity;

import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "almacen")
public class Almacen implements Serializable {

	
	private static final long serialVersionUID = 8158635140368395805L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	

	private String nombre;
	
	
	private String FechaIn;
	
	
	private Long TopCli;
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFechaIn() {
		return FechaIn;
	}

	public void setFechaIn(String fechaIn) {
		FechaIn = fechaIn;
	}

	public Long getTopCli() {
		return TopCli;
	}

	public void setTopCli(Long topCli) {
		TopCli = topCli;
	}

	


	
	
	
	
	
	
}
