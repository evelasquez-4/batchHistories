package com.app.batch.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name = "prueba", schema = "public")
public class Prueba {
	
	private Long id;
    private String cadena;
    private Integer numero;
    private List<Prueba2> prueba2s = new ArrayList<>();
    
    
	public Prueba(Long id, String cadena, Integer numero, List<Prueba2> prueba2) {
		super();
		this.id = id;
		this.cadena = cadena;
		this.numero = numero;
		this.prueba2s = prueba2;
	}
    
	public Prueba() {
		
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCadena() {
		return cadena;
	}

	public void setCadena(String cadena) {
		this.cadena = cadena;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "prueba")
	@JsonManagedReference
	public List<Prueba2> getPrueba2s() {
		return prueba2s;
	}

	public void setPrueba2s(List<Prueba2> prueba2s) {
		this.prueba2s = prueba2s;
	}

}
