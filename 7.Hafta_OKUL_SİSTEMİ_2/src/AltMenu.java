

public enum AltMenu{
	ARA("Ara", 1),
	EKLE("Ekle",2),
	GUNCELLE("Güncelle",3),
	SIL("Sil",4);
	
	public String altMenu;
	public int sira;
	
	AltMenu(String altMenu, int sira){
		this.altMenu = altMenu;
		this.sira = sira;
	}
}