package com.app.batch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.batch.model.Batch;
import com.app.batch.service.BatchService;

@RestController
@RequestMapping("/batch/batch")
public class BatchController {
	
	@Autowired
	private BatchService batch;
	
	@GetMapping("/list_batch")
	public List<Batch> getShoppers(){
		return this.batch.getBatches();
	}
}
