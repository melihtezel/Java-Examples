
public class Main {
	public static void main(String[] args) {
		AbstractDatabase absdb1=new SqlLiteDatabase();
		AbstractDatabase absdb2=new MongoDatabase();
		absdb1.add();
		absdb2.add();
		absdb1.get();
		absdb2.update();
	}
}
