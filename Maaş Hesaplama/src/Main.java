import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int workHours,hireYear=0,today=2023,year;
		double tax=0.18,salary=5000;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("çalışma saati giriniz:");
		workHours=scan.nextInt();
		System.out.println("İşe giriş Yılı");
		hireYear=scan.nextInt();
		year=today-hireYear;
		if(year>10){
			salary+=1500;
		}
		if(workHours<=40){
			
		}else if(workHours>41) {
			salary+=1000;
			salary=salary*(1-tax);
		}
		System.out.println("salary: " +salary);
	}

}
