import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("sayıyı giriniz:");
		int sayı=scan.nextInt();
		boolean asal=true;
		for(int i=2;i<sayı;i++) {
			if(sayı%i==0) {
				asal=false;
			}
		}
		if(asal==true) {
			System.out.println(sayı+" asaldır");
		}else {
			System.out.println(sayı+" asal değildir");
		}
	}

}
