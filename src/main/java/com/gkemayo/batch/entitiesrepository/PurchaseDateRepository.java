package com.gkemayo.batch.entitiesrepository;

import java.util.Date;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.gkemayo.batch.entities.PurchaseDate;

public interface PurchaseDateRepository extends CrudRepository<PurchaseDate, Long> {
	
	@Query("select * from DIM_DATE where DATE_TIME = :date ")
	public PurchaseDate findByDate(@Param("date") Date date);

}
