package application;

import java.util.Date;

import entities.Department;

public class Program {

	public static void main(String[] args) {
		
		Department department = new Department(1, "Books");
		Seller seller = new Seller(21 , "Bob", "bob@gmail.com", new Date(), 2000.0, department);
		
		System.out.println(seller);
		
		
	}

}
