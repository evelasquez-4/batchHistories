package com.app.batch.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.batch.model.Shopper;
import com.app.batch.repository.ShopperRepository;

@Service
public class ShopperService {

	@Autowired
	private ShopperRepository shopper;
	
	public List<Shopper> getShoppers(){
		return this.shopper.findAll();
	};
}
