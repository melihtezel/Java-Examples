package deneme;

public class Islemler implements Runnable{

	String name;
	
	public Islemler(String name) {
		this.name=name;
		
	}
	
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(this.name + "-" + i );
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	}

	
	}
	

