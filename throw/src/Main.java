

public class Main {

	public static void main(String[] args) {
		Bank bank=new Bank();
		System.out.println("bakiye: " + bank.getBakiye());
		bank.paraYatırma(100);
		try {
			bank.paraCekme(300);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("bakiye: " + bank.getBakiye());
	}

}
