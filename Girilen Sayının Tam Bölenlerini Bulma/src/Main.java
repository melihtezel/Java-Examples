import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("sayı: ");
		int sayi=scan.nextInt();
		for(int i=1;i<sayi;i++) {
			if(sayi%i==0) {
				System.out.println("pozitif bölenler: " +i);
				
			}
		}

	}

}
