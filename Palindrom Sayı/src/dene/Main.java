package dene;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("sayı: ");
		int sayı=scan.nextInt();
		String str=Integer.toString(sayı);
		String yeni="";
		for(int i=str.length()-1;i>=0;i--) {
			yeni+=str.charAt(i);
		}
		int deger=Integer.valueOf(yeni);
		if(deger==sayı) {
			System.out.println("palindrom sayıdır");
		}else {
			System.out.println("palindrom değildir");
		}
		
	}

}
