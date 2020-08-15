package com.gkemayo.batch.entitiesrepository;

import org.springframework.data.repository.CrudRepository;

import com.gkemayo.batch.entities.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {

}
