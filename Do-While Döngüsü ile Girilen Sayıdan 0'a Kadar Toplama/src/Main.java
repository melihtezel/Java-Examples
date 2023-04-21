import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("sayı: ");
		int sayı=scan.nextInt();
		int toplam=0;
		do {
			toplam+=sayı;
			sayı--;
		}while(sayı>0);
			System.out.println("toplam: " + toplam);
		

	}

}
