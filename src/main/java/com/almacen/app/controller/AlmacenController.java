package com.almacen.app.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.almacen.app.entity.Almacen;
import com.almacen.app.service.AlmacenService;



@RestController
@RequestMapping("/api/Almacenes")
public class AlmacenController {
	
	@Autowired
	private AlmacenService almacenService;
	
	//Crear nuevo almacen
	@PostMapping
	public ResponseEntity<?> create (@RequestBody Almacen almacen){
		return ResponseEntity.status(HttpStatus.CREATED).body(almacenService.save(almacen));		
	}
    
	//Leer almacen
	@GetMapping("/{id}")
	public ResponseEntity<?> read (@PathVariable(value = "id") Long almacenId){
		Optional<Almacen> oAlmacen = almacenService.findById(almacenId);
		if(!oAlmacen.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		    return ResponseEntity.ok(oAlmacen);
	}
}
