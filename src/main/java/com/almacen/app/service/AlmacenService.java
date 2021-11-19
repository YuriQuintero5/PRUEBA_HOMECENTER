package com.almacen.app.service;

import java.util.Optional;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;

import com.almacen.app.entity.Almacen;

public interface AlmacenService {

	public Iterable<Almacen> findAll();
	
	public Page<Almacen> findAll(Pageable pageable);
	
	public Optional<Almacen> findById(Long id);
	
	public Almacen save(Almacen almacen);
	
	public void deleteById(Long id);
	
}
