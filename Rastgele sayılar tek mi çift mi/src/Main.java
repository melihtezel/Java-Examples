import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random rnd=new Random();
		int sayi=0;
		for(int i=0;i<10;i++) {
			sayi = rnd.nextInt(10);
			if(sayi%2==0) {
				System.out.println("çift sayıdır-> "+sayi);
			}else {
				System.out.println("tek sayıdır-> " +sayi);
			}
			;
		}

	}

}
