import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("cümleyi giriniz:");
		String cümle=scan.nextLine();
		
		int adet=0;
		for(int i=0;i<cümle.length();i++) {
			if(cümle.charAt(i)=='m' ||cümle.charAt(i)=='M') {
				adet++;
				
			}
		}System.out.println(adet+ " adet bulundu");
	}

}
