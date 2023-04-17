package çalışma;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Customers> customers=new ArrayList<Customers>();
		customers.add(new Customers(1,"melih","tezel"));
		customers.add(new Customers(2,"emirhan","tezel"));
		
		for(Customers c:customers) {
			System.out.println(c.ad);
			System.out.println("---------");
			System.out.println(c.soyad);
		}
	}

}
