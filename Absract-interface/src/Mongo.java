
public class Mongo implements IDatabase{

	@Override
	public void ekle() {
		System.out.println("Mongo eklendi");
		
	}

	@Override
	public void sil() {
		System.out.println("Mongo silindi");
		
	}

	@Override
	public void güncelle() {
		System.out.println("Mongo günceledi");
		
	}

}
