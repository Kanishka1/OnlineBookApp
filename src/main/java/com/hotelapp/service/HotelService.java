package com.hotelapp.service;

import java.util.List;

import com.hotelapp.model.Hotel;

public interface HotelService {
	void AddHotel(Hotel hotel);
	void UpdateHotel(Hotel hotel);
	void deleteHotel(int hotelid);
	Hotel getHotelById(int hotelid);
	List<Hotel>getAllHotels();
	List<Hotel>getHotelByCity(String city);
	List<Hotel>getHotelByMenu(String menu);
	List<Hotel>getHotelByDelivery(String pName);
	List<Hotel>getHotelByLocation(String location);
	List<Hotel>getHotelByLocationAndMenu(String location,String menu);
}
