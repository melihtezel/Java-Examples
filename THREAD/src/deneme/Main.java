package deneme;

public class Main {

	public static void main(String[] args) {
		
		Islemler i1=new Islemler("melih");
		Islemler i2=new Islemler("emirhan");
		Islemler i3=new Islemler("tezel");

		Thread t1=new Thread(i1);
		Thread t2=new Thread(i2);
		Thread t3=new Thread(i3);
		
		t1.setPriority(Thread.MIN_PRIORITY);  
		t2.setPriority(Thread.MAX_PRIORITY);  // ÖNCELİĞİ YÜKSEK DEMEK
		
		t3.setPriority(Thread.MIN_PRIORITY);

		t1.start();
		t2.start();
		t3.start();
		
		
		
	}

}
