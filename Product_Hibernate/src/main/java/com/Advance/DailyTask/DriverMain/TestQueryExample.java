package com.Advance.DailyTask.DriverMain;

import java.util.List;

import com.Advance.DailyTask.Entity.Product;
import com.Advance.DailyTask.queryexample.AQueryExample;

public class TestQueryExample {

	public static void main(String[] args) {
		AQueryExample ex = new AQueryExample();

//		List<Product> list = ex.getProductList();
//
//		for (Product product : list) {
//			System.out.println(product);

		// by name
//
//		List<Product> list = ex.getProductByNameQuery("cellphone") ;
//		
//		for (Product product2 : list) {
//			System.out.println(product2);
//
//		}

		// by price
		List<Product> list = ex.getProductByPrice(50d);

		for (Product product2 : list) {
			System.out.println(product2);

		}

	}

}
