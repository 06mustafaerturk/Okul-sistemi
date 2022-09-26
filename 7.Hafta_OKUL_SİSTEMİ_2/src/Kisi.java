

public abstract class Kisi { // Immutable, set metodları yok
	
	private String ad; // field
	private String soyad;
	private String TCKimlikNo;
	
	public Kisi(String ad, String soyad, String TCKimlikNo) {
		this.ad = ad;
		this.soyad = soyad;
		this.TCKimlikNo = TCKimlikNo;
	}
	
	public String getAd() {
		return ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public String getTCKimlikNo() {
		return TCKimlikNo;
	}
	
}

