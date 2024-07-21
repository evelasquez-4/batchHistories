package com.app.batch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.batch.model.Shopper;
import com.app.batch.service.ShopperService;

@RestController
@RequestMapping("/batch/shopper")
public class ShopperController {

	@Autowired
	private ShopperService shopper;
	
	@GetMapping("/list_shopper")
	public List<Shopper> getShoppers(){
		return this.shopper.getShoppers();
	}
}
