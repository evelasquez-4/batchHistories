package com.app.batch.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "address", schema = "public")
public class Address {

	//--- ENTITY PRIMARY KEY 
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id", nullable=false)
    private Long id;

    //--- ENTITY DATA FIELDS 
    @Column(name="text", nullable=false, length=100)
    private String text;

    @Column(name="county", nullable=false, length=50)
    private String county;

    @Column(name="state", nullable=false, length=50)
    private String state;

    @Column(name="zip_code", nullable=false)
    private Integer zipCode;

    @Column(name="is_verify")
    private Boolean isVerify = false;

    @Column(name="is_house")
    private Boolean isHouse;
    
    //--- ENTITY LINKS ( RELATIONSHIP )
    @OneToMany(mappedBy="address")
    @JsonManagedReference
    private List<Store> stores ; 
    
    @OneToMany(mappedBy="address")
    @JsonManagedReference
    private List<Order> orders = new ArrayList<>();

    public Address() {}
    
	public Address(Long id, String text, String county, String state, Integer zipCode, Boolean isVerify,
			Boolean isHouse, List<Store> stores, List<Order> orders) {
		this.id = id;
		this.text = text;
		this.county = county;
		this.state = state;
		this.zipCode = zipCode;
		this.isVerify = isVerify;
		this.isHouse = isHouse;
		this.stores = stores;
		this.orders = orders;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getZipCode() {
		return zipCode;
	}

	public void setZipCode(Integer zipCode) {
		this.zipCode = zipCode;
	}

	public Boolean getIsVerify() {
		return isVerify;
	}

	public void setIsVerify(Boolean isVerify) {
		this.isVerify = isVerify;
	}

	public Boolean getIsHouse() {
		return isHouse;
	}

	public void setIsHouse(Boolean isHouse) {
		this.isHouse = isHouse;
	}

	public List<Store> getStores() {
		return stores;
	}

	public void setStores(List<Store> stores) {
		this.stores = stores;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
    
	
}

