package app;

import entities.Client;

public class Program {

	public static void main(String[] args) {
		
		
		Client c1 = new Client("Jose", "jose@gmail.com");
		Client c2 = new Client("Jose", "jose@gmail.com");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));	
		
		System.out.println();
		
		Client c3 = new Client("Maria", "maria@gmail.com");
		Client c4 = new Client("cleber", "cleber@gmail.com");
		
		System.out.println(c3.hashCode());
		System.out.println(c4.hashCode());
		System.out.println(c3.equals(c4));	
		
		
	}

}
