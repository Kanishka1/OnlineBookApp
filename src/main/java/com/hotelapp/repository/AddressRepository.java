package com.hotelapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.hotelapp.model.Address;
import com.hotelapp.model.Hotel;


@Repository
public interface AddressRepository extends MongoRepository<Address, Integer> 
{
	

}
