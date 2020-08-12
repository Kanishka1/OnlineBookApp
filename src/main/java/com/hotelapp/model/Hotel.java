package com.hotelapp.model;

import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("hotel")
public class Hotel {
	@Id
	Integer hotelid;
	String Hotelname;
	Address address;
	Set<Menu> menu;
	Set<Delivery> delivery;

}
