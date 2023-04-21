import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("2 Adet Sayı Giriniz..");
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		boolean asal=true;
		int toplam=0;
		int büyük=sayi2;
		int kücük=sayi1;
		if(sayi1>sayi2) {
			büyük=sayi1;
		}
		if(sayi2<sayi1) {
			kücük=sayi2;
		}
		for(int i=kücük;i<büyük;i++) {
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					
				}
			}
		}

	}

}
