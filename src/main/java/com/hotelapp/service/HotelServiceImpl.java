package com.hotelapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelapp.exception.HotelNotFoundException;
import com.hotelapp.model.Hotel;
import com.hotelapp.repository.HotelRepository;


@Service
public class HotelServiceImpl implements HotelService {
@Autowired
HotelRepository hr1;
	@Override
	public void AddHotel(Hotel hotel) {
		hr1.save(hotel);
	}

	@Override
	public void UpdateHotel(Hotel hotel) {
		hr1.save(hotel);
	}

	@Override
	public void deleteHotel(int hotelid) {
		hr1.deleteById(hotelid);
	}

	@Override
	public Hotel getHotelById(int hotelid) 
	{
		return hr1.findById(hotelid).get();
	}

	@Override
	public List<Hotel> getHotelByCity(String city) 
	{
		List<Hotel> hotelByCity=hr1.FindByCity(city);
		if(hotelByCity.isEmpty())
		{
			throw new HotelNotFoundException("Hotel by city " +city+ " not found");
		}
		return hotelByCity;
	}

	@Override
	public List<Hotel> getHotelByMenu(String menu) {
		List<Hotel> hotelByMenu=hr1.FindByMenu(menu);
		if(hotelByMenu.isEmpty())
		{
			throw new HotelNotFoundException("Hotel with Menu " +menu+ " not found");
		}
		return hotelByMenu;
	}

	@Override
	public List<Hotel> getHotelByDelivery(String pName) {
		return hr1.FindByDelivery(pName);
	}
	
	@Override
	public List<Hotel> getAllHotels() 
	{
		return hr1.findAll();
	}

	@Override
	public List<Hotel> getHotelByLocation(String location) {
		List<Hotel> hotelBylocation=hr1.FindByLocation(location);
		if(hotelBylocation.isEmpty())
		{
			throw new HotelNotFoundException("Hotel by location " +location+ " not found");
		}
		return hotelBylocation;
		
	}
	public List<Hotel> getHotelByLocationAndMenu(String location, String menu) {
		List<Hotel> hotelByLandM=hr1.FindByLocationAndMenu(location,menu);
		if(hotelByLandM.isEmpty())
		{
			throw new HotelNotFoundException("Hotel Not found");
		}
		return hotelByLandM;
		
	}
}