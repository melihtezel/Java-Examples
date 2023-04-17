
public class DbManager {
public void add(IDatabase db) {
	db.ekle();
}
void update(IDatabase db) {
	db.güncelle();
}
void delete(IDatabase db) {
	db.sil();
}
}
