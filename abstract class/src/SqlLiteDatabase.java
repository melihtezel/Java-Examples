
public class SqlLiteDatabase extends AbstractDatabase{

	@Override
	void update() {
		System.out.println("SqliteDatabase güncellendi");
		
	}

	@Override
	void get() {
		System.out.println("SqliteDatabase elde edildi");
		
	}

}
