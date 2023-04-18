
public class Bank {
private double bakiye;

public void paraCekme(double miktar) throws Exception {
	if(bakiye >=miktar) {
		bakiye -=miktar;
	}else {
		throw new Exception("Bakiye yetersiz..");
	}
	
}
public void paraYatırma(double miktar) {
	bakiye +=miktar;
}

public double getBakiye() {
	return bakiye;
}


}
