import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int sayı=scan.nextInt();
		int deger=sayı;
		String str=Integer.toString(sayı);
		System.out.println("a:"+str);
		int bolum=0,sonuc=0;
		for(int i=0;i<str.length();i++) {
			bolum=sayı%10;
			sonuc+=bolum*bolum*bolum;
			sayı=sayı/10;
			
			
		}
		if(sonuc==deger) {
			System.out.println(deger+ " Amstorng sayıdır");
		}else {
			System.out.println(deger+ " Amstorng sayı değildir");
		}

	}

}
