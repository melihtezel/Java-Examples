import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("sayı: ");
		int basamak=0;
		int sayi=scan.nextInt(); 
		while(sayi>0) {
			sayi/=10;
			basamak++;
		}
		System.out.println(basamak+" basamaklıdır");

	}

}
