
public enum AnaMenu{
	OGRETMEN("Öğretmen",1),
	OGRENCI("Öğrenci",2),
	VELI("Veli",3);
	//GOREVLI("Görevli");
	
	public String menu;
	public int sira;
	
	AnaMenu(String menu, int sira){
		this.menu = menu;
		this.sira = sira;
	}
}