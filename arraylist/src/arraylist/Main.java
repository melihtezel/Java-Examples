package arraylist;

import java.util.ArrayList;

public class Main {
	public static void main(String[]args) {
		ArrayList<Customers> customers = new ArrayList<>();
		customers.add(new Customers(0,"melih","tezel"));
		customers.add(new Customers(1,"emirhan","tezel"));
		
	for(Customers a:customers) {
		System.out.println(a.ad);
	}	
	}
}
