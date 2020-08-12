package com.hotelapp.model;

import java.util.Set;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
//@Data
@NoArgsConstructor
//@AllArgsConstructor
public class Delivery {
	@Id
	Integer id;
	String pName;
	int charges;
	Set<Hotel>hotels;
	public Delivery(Integer id,String pName, int charges) {
		super();
		this.id=id;
		this.pName = pName;
		this.charges = charges;
	}
	public Delivery(String pName) {
		super();
		this.pName = pName;
	}
	@Override
	public String toString() {
		return "Delivery [pName=" + pName + ", charges=" + charges + "]";
	}


}
