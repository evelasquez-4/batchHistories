package com.app.batch.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.batch.model.Prueba;
import com.app.batch.service.PruebaService;

@RestController
@RequestMapping("/batch/prueba")
public class PruebaController {
	
	@Autowired
	private  PruebaService prueba; 
	
	@GetMapping("/list")
	public List<Prueba> getPruebas(){
		List<Prueba> res = new ArrayList<>();
		try {
			
			res=  this.prueba.getPruebas();
		} catch (Exception e) {
			System.out.println("ERROR: "+e.getMessage());
		}
		
		return res;
	}

}
