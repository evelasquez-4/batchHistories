package com.app.batch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.batch.model.Batch;

@Repository
public interface BatchRepository extends JpaRepository<Batch, Long> {

}
