import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("faktoriyel ? ");
		int sayi=scan.nextInt();
		int faktoriyel=1;
		
		for(int i=1;i<=sayi;i++) {//12345
			faktoriyel*=i;
		}
		System.out.println("faktoriyel: " + faktoriyel);

	}

}
