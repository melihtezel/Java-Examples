
public class Oracle extends Abstract implements IDatabase {

	@Override
	public void ekle() {
		System.out.println("oracle eklendi");
		
	}

	@Override
	public void sil() {
		System.out.println("oracle silindi");
		
	}

	@Override
	public void güncelle() {
		System.out.println("oracle günceledi");
		
	}

	@Override
	void düzelt() {
		System.out.println("oracle düzeltildi ");
		
	}

}
