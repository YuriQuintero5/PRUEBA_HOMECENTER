package com.almacen.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.almacen.app.entity.Almacen;
import com.almacen.app.repository.AlmacenRepository;
@Service
public class AlmacenServiceImpl implements AlmacenService{
	
	
	
	@Autowired
	private AlmacenRepository almacenRepository;
	
	
	
	@Override
	@Transactional(readOnly = true)
	public Iterable<Almacen> findAll() {
		return almacenRepository.findAll();
	}
	

	@Override
	@Transactional(readOnly = true)
	public Page<Almacen> findAll(Pageable pageable) {
		return almacenRepository.findAll(pageable);
	}

	
	@Override
	@Transactional(readOnly = true)
	public Optional<Almacen> findById(Long id) {
		return almacenRepository.findById(id);
	}

	@Override
	@Transactional
	public Almacen save(Almacen almacen) {
		return almacenRepository.save(almacen);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		almacenRepository.deleteById(id);
		
		
	}
	
	
	}
	


