package com.tnsif.entityclass;

public class CustomerDemo {

	public static void main(String[] args) {
		
		Customer c1 = new Customer();
		Customer c2 = new Customer();
		 
		c1.setName("Sidh");
		c1.setCity("VPM");
		c1.setId(4204087);
		
		c2.setCity("TVM");
		c2.setId(42040144);
		c2.setName("Sharan");
		
		System.out.println(c1);
		
		
		
	}
}
