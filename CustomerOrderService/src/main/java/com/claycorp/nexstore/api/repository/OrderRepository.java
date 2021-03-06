package com.claycorp.nexstore.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.claycorp.nexstore.api.entity.Order;

@Repository
public interface OrderRepository extends MongoRepository<Order, String>{

}
