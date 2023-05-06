import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Dizi uzunluğu:");
		int uzun=scan.nextInt();
		int[]dizi=new int[uzun];
		int toplam=0;
		for(int i=0;i<uzun;i++) {
			System.out.print("dizinin "+(i+1)+".elemanı: ");
			dizi[i]=scan.nextInt();
			toplam+=dizi[i];
		}
		int ortalama=toplam/uzun;
		System.out.println("ortalama: "+ortalama);
		

	}

}
