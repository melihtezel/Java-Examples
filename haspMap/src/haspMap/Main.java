package haspMap;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		HashMap<String,String> sozluk = new HashMap<>();
		sozluk.put("car","araba");
		sozluk.put("table","masa");
		sozluk.put("computer","bilgisayar");
		sozluk.put("key","anahtar");
		
		sozluk.remove("table");
		
		for(String item:sozluk.keySet()) {
		System.out.println(sozluk);
		}

	}

}
