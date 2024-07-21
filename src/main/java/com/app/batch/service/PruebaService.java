package com.app.batch.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.batch.model.Prueba;
import com.app.batch.repository.PruebaRepository;

@Service
public class PruebaService {

	@Autowired
	private PruebaRepository prueba;
	
	public List<Prueba> getPruebas() 
	{
		return this.prueba.findAll();
	}
}
