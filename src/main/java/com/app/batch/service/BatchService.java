package com.app.batch.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.batch.model.Batch;
import com.app.batch.repository.BatchRepository;

@Service
public class BatchService {

	@Autowired
	private BatchRepository batch;
	
	public List<Batch> getBatches(){
		return this.batch.findAll();
	}
}
