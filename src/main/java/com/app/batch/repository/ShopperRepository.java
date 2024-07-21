package com.app.batch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.batch.model.Shopper;

@Repository
public interface ShopperRepository extends JpaRepository<Shopper, Long>{

}
