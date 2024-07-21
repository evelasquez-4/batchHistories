package com.app.batch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.batch.model.Prueba;

@Repository
public interface PruebaRepository extends JpaRepository<Prueba, Long> 
{

}
