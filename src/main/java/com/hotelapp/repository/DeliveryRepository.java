package com.hotelapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.hotelapp.model.Delivery;
import com.hotelapp.model.Hotel;


@Repository
public interface DeliveryRepository extends MongoRepository<Delivery, Integer> 
{
	
}
