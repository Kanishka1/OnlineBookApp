package com.hotelapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.hotelapp.model.Hotel;
import com.hotelapp.service.HotelService;
@CrossOrigin(origins="http://127.0.0.1:5500")
@RestController
public class HotelController {
@Autowired
HotelService hotelService;

@GetMapping("/hotels")
public ResponseEntity<List<Hotel>> getAllHotels() {
	List<Hotel> hotelList = hotelService.getAllHotels();
	return ResponseEntity.ok(hotelList) ;
}

@GetMapping("/hotel-by-id/{hotelid}")
public  ResponseEntity<Hotel> getBookById(@PathVariable("hotelid")int hotelid)
{
	Hotel hotelList = hotelService.getHotelById(hotelid);
	HttpHeaders header = new HttpHeaders();
	header.add("desc", "Getting hotel by hotelid");
	header.add("content", "hotel by id ");
	return ResponseEntity.status(HttpStatus.CREATED).headers(header).body(hotelList);
}
@GetMapping("/hotel-by-location")  
public ResponseEntity<List<Hotel>> getHotelByLocation(@RequestParam("location")String location) 
{
	List<Hotel>hotelList=hotelService.getHotelByLocation(location);
	HttpHeaders http= new HttpHeaders();
	http.add("desc", "Getting details");
	return ResponseEntity.status(HttpStatus.ACCEPTED).headers(http).body(hotelList);
}
@GetMapping("/hotel-by-menu")
public ResponseEntity<List<Hotel>> getHotelByMenu(@RequestParam("menu")String menu)
{
	List<Hotel> hotelList=hotelService.getHotelByMenu(menu);
	HttpHeaders http= new HttpHeaders();
	http.add("desc", "Getting details");
	return ResponseEntity.status(HttpStatus.ACCEPTED).headers(http).body(hotelList);
}
@GetMapping("/hotel-by-delivery")
public ResponseEntity<List<Hotel>> getHotelByDelivery(@RequestParam("delivery")String delivery) 
{
	List<Hotel> hotelList=hotelService.getHotelByDelivery(delivery);
	HttpHeaders http= new HttpHeaders();
	http.add("desc", "Getting details");
	return ResponseEntity.status(HttpStatus.ACCEPTED).headers(http).body(hotelList);
}

@PostMapping("/add-hotel")
public ResponseEntity<Void> addHotel(@RequestBody Hotel hotel) {
	hotelService.AddHotel(hotel);
	return new ResponseEntity<Void>(HttpStatus.CREATED);
}


}
