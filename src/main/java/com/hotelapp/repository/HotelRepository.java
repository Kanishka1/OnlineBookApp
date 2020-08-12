package com.hotelapp.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.hotelapp.model.Hotel;


@Repository
public interface HotelRepository extends MongoRepository<Hotel, Integer> 
{
	@Query("{'Address.city':?0}")
	List<Hotel>FindByCity(String city);
	@Query("{'Address.location':?0}")
	List<Hotel>FindByLocation(String location);
	//List<Hotel>FindBy
	@Query("{'Menu.menuName':?0}")
	List<Hotel> FindByMenu(String menu);
	@Query("{'Delivery.pName':?0}")
	List<Hotel> FindByDelivery(String pName);
	@Query("{'Address.location':?0,'Menu.menuName':?1}")
	List<Hotel> FindByLocationAndMenu(String location,String menu);
}
