import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("dizi boyutunu giriniz:");
		int boyut=scan.nextInt();
		int[]dizi=new int[boyut];
		for(int i=0;i<boyut;i++) {
			System.out.print("dizi elemanlarını giriniz");
			dizi[i]=scan.nextInt();
		}
		System.out.println("Diziler: " + Arrays.toString(dizi));
		for(int i=2;i<=boyut+1;i++) {
			if(dizi[i]%i==0) {
				System.out.println("asal değil: "+ i);
			}
		}

	}

}
