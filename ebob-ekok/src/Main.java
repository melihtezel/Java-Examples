import java.util.Scanner;

public class Main {		

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("sayı1: ");
		int number1=scan.nextInt();
		System.out.print("sayı2: ");
		int number2=scan.nextInt();
		int ebob=0;
		int n=Math.min(number1, number2);
		for(int i=1;i<=n;i++) {
			if((number1%i==0)&&(number2%i==0)) {
				ebob=i;
			}
		}
		System.out.println("ebob: "+ ebob);
		int ekok=(number1*number2)/ebob;
		System.out.println("ekok: " + ekok);
		
	}
	}
		
		
		
		
		
			
			
			
			
			
			
		
		
		
	
	
	


