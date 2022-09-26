
public class Veli extends Kisi {

	public Veli(Ogrenci ogrencisi,String ad, String soyad, String TCKimlikNo) {
		super(ad, soyad, TCKimlikNo);
		if(ogrencisi == null) {
			throw new NullPointerException("Öğrencisi olmayan Veli olamaz.");
		}
		
		this.ogrencisi = ogrencisi;
	}
	
	private Ogrenci ogrencisi;

	public Ogrenci getOgrencisi() {
		return ogrencisi;
	}
	
	

}
