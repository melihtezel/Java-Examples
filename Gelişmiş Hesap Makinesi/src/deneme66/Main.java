
package deneme66;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("yapacağınız işlemi seçiniz: ");
		System.out.println("1-Toplama/2-Çıkarta/3-Bölme/4-Çarpma/5-Faktoriyel Hesapla/6-Mod Alma/7-Üs Alma");
		int islem=scan.nextInt();
		switch(islem) {
		case 1:
			System.out.println("Sayıları Giriniz:");
			int sayi1=scan.nextInt();
			int sayi2=scan.nextInt();
			System.out.println("Sonuç: " + (sayi1+sayi2));
			break;
		
		case 2:
			System.out.println("Sayıları Giriniz:");
			 sayi1=scan.nextInt();
			 sayi2=scan.nextInt();
			System.out.println("Sonuç: " + (sayi1-sayi2));
			break;
		case 3:
			System.out.println("Sayıları Giriniz:");
			 sayi1=scan.nextInt();
			 sayi2=scan.nextInt();
			System.out.println("Sonuç: " + (sayi1/sayi2));
			break;
		case 4:
			System.out.println("Sayıları Giriniz:");
			 sayi1=scan.nextInt();
			 sayi2=scan.nextInt();
			System.out.println("Sonuç: " + (sayi1*sayi2));
			break;
		case 5:
			System.out.println("Sayıyı Giriniz:");
			 sayi1=scan.nextInt();
			 int faktoriyel=1;
			 for(int i=1;i<=sayi1;i++) {
			 faktoriyel*=i;
			 }
			 System.out.println("Sonuç: " + faktoriyel);
			break;
		case 6:
			System.out.println("2 Adet SayıGiriniz:");
			 sayi1=scan.nextInt();
			 sayi2=scan.nextInt();
			 int mod=sayi1%sayi2;
			System.out.println("Sonuç: " + mod);
			break;
		case 7:
			System.out.println("Tabanı Giriniz:");
			 sayi1=scan.nextInt();
			 System.out.println("Üs Giriniz:");
			 sayi2=scan.nextInt();
			 int toplam=1;
			 for(int i=0;i<sayi2;i++) {
				 toplam*=sayi1;
			 }
			System.out.println("Sonuç: " + toplam);
			break;
		}
		
		
		
		
		
		

	}

}
