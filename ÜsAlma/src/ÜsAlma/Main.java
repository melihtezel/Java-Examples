package ÜsAlma;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("taban: ");
		int taban=scan.nextInt();
		System.out.println("üs: ");
		int üs=scan.nextInt();
		int sonuc=1;
		for(int i=0;i<üs;i++) {
			sonuc*=taban;
		}
		System.out.println("sonuç: " +sonuc);
	}

}
