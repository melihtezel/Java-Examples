
public class Main {

	public static void main(String[] args) {
		DbManager dbm=new DbManager();
		dbm.update(new Mongo());
		dbm.delete(new Oracle());
		dbm.add(new Mongo());
		
		Abstract abs=new Oracle();
		abs.düzelt();
		abs.karıştır();
	}

}
