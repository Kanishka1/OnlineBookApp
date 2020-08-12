package com.hotelapp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.hotelapp.exception.HotelNotFoundException;
import com.hotelapp.model.Address;
import com.hotelapp.model.Delivery;
import com.hotelapp.model.Hotel;
import com.hotelapp.model.Menu;
import com.hotelapp.service.HotelService;
//import com.hotelapp.service.MenuService;



@SpringBootApplication
@ComponentScan("com")
@EnableMongoRepositories("com.hotelapp.repository")
public class KloudHotelAppApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(KloudHotelAppApplication.class, args);
	}
	@Autowired
	HotelService hs1;
//	
//	@Autowired
//	MenuService mr1;

	@Override
	public void run(String... args) throws Exception 
	{
//		Address address= new Address(3,"Marathalli","Bangalore", "KAR", 485742);
//		Menu menu= new Menu(1,"Masala Dosa",250);
//		Menu menu2= new Menu(2,"Idli", 200);
//		Set<Menu> mList=new HashSet<>(Arrays.asList(menu,menu2)); 
//		Delivery d1=new Delivery(1,"Swiggy",120);
//		Delivery d2= new Delivery(2,"Zomato",150);
//		Set<Delivery> dList=new HashSet<>(Arrays.asList(d1,d2));
//		Hotel h2=new Hotel(4,"MasalaBox", address, mList, dList);		
//		hs1.AddHotel(h2);
		try
		{
//		Hotel h1=hs1.getHotelById(1);
//		System.out.println("Hotel By Id :");
//		System.out.println(h1);
//		System.out.println();
//		System.out.println("Hotel By City :");
//		List<Hotel>byCity=hs1.getHotelByCity("Bangalore");
//		System.out.println(byCity);
		System.out.println("Hotel By Menu");
		System.out.println(hs1.getHotelByMenu("Idli"));
		System.out.println(hs1.getAllHotels());
//		hs1.getHotelByMenu("Idli").stream().
//		forEach((h)->System.out.println(h.getHotelname()));
//		System.out.println();
//		
//		System.out.println("Hotel By Delivery");
//		hs1.getHotelByDelivery("Swiggy").stream().forEach((h)->System.out.println(h.getHotelname()));
//		System.out.println();
//		//System.out.println(ds1.getDeliveryByPartner("Swiggy"));
//		System.out.println("Hotel By Location");
//		hs1.getHotelByLocation("Vijay Nagar").stream().forEach((h)->System.out.println(h.getHotelname()));
//		System.out.println();
//		System.out.println("Hotel By Location And Menu");
//		hs1.getHotelByLocationAndMenu("VijayNagar","VegThali").stream().forEach((h)->System.out.println(h.getHotelname()));
		
//		System.out.println("Menu By Hotel Name");
//		System.out.println(mr1.getMenusByHotel("Badkul"));
		}
		catch(HotelNotFoundException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
