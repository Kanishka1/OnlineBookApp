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
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Menu {
	@Id
	 Integer menuid;
	 String menuName;
	 double price;
	 Hotel hotel;
	public Menu(Integer menuid, String menuName, double price) {
		super();
		this.menuid=menuid;
		this.menuName = menuName;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Menu [menuName=" + menuName + ", price=" + price + "]";
	}

}
