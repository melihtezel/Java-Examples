import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Kelimenizi giriniz:");
		String kelime=scan.next();
		String yeni="";
		for(int i=kelime.length()-1;i>=0;i--) {
			yeni+=kelime.charAt(i);
		}
		
		if(kelime.equals(yeni)) {
			System.out.println(kelime + ", palindromdur");
		}else {
			System.out.println(kelime + ", palindrom değildir");
		}
		
	}

}
