
public class Main {

	public static void main(String[] args) {
		int[] sayi=new int[] {1,2,3};
		
		
		try 
		{
			System.out.println(sayi[6]);
		}
		catch(Exception e) {
			System.out.println("hata: " + e);
		}
		finally {
			System.out.println("ben her türlü çalışırım");
		}

	}

}
