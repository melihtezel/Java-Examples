import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[][]dizi= new int[2][2];
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.println("değerleri giriniz:");
				dizi[i][j]=scan.nextInt();
			}
		}
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(dizi[i][j]+" ");
				
			}
			System.out.println();
		}
		

	}

}
