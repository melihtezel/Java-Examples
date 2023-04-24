
public class Main {

	public static void main(String[] args) {
		int [][]dizi=new int[3][3];
		int value=0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				dizi[i][j]=value;
				value++;
			}
		}
		System.out.println("2 Boyutlu Dizi:");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(dizi[i][j]+" ");
			}
			System.out.println();
		}

	}

}
