package com.almacen.app.repository;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.almacen.app.entity.Almacen;

@Repository
public interface AlmacenRepository extends JpaRepository<Almacen, Long>{

	

}
