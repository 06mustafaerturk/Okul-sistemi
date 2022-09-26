// model Package da sınıflarımızı oluşturyoruz.POJO
// nesnelerimiz yönetmek için ise Manager package yaptık.

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Singleton Design Pattern
// Bir sınıftan programın çalışması boyunca sadece 1 nesne
// üretilmesi yeterliyse
public class Menu {
	public static AnaMenu anaMenu;
	public static AltMenu altMenu;

	public static boolean chooseAnaMenu(String secim) {

		if (validateAnaMenuSecimi(secim)) {
			int secimSayisi = Integer.valueOf(secim);
			anaMenu = AnaMenu.values()[secimSayisi - 1];
			return true;
		}

		return false;
	}

	public static boolean chooseAltMenu(String secim) {

		if (validateAltMenuSecimi(secim)) {
			int secimSayisi = Integer.valueOf(secim);
			altMenu = AltMenu.values()[secimSayisi - 1];
			return true;
		}

		return false;
	}

	private static boolean validateAnaMenuSecimi(String secim) {

		int enumElemanSayisi = AnaMenu.values().length;
		Pattern desen = Pattern.compile(String.format("[1-%d]", enumElemanSayisi));
		Matcher eslestirici = desen.matcher(secim);

		return eslestirici.matches();
	}
	
	private static boolean validateAltMenuSecimi(String secim) {

		int enumElemanSayisi = AltMenu.values().length;
		Pattern desen = Pattern.compile(String.format("[1-%d]", enumElemanSayisi));
		Matcher eslestirici = desen.matcher(secim);

		return eslestirici.matches();
	}

	public static void showAnaMenu() {
//while(true) {

		System.out.println("***** ANA MENU ******");

		for (AnaMenu m : AnaMenu.values()) {
			System.out.printf("%d - %s Verileri \n", m.sira, m.menu);
		}

		System.out.print("Menu sayÄ±sÄ± girin: ");
//			
//		    menuSecim =	input.next().trim();
//		    
//		    Pattern desen = Pattern.compile("[1-3]");
//			Matcher eslestirici = desen.matcher(menuSecim);
//			
//			if(eslestirici.matches() == false) {
//				System.out.println("HatalÄ± menÃ¼ seÃ§imi. Tekrar deneyiniz.");
//				continue;
//			}
//			
//			break;
//		}

	}

	public static void showAltMenu() {
		System.out.println("***** ALT MENU ******");

		for (AltMenu m : AltMenu.values()) {
			System.out.printf("%d - %s Verileri \n", m.sira, m.altMenu);
		}

		System.out.print("Menu sayÄ±sÄ± girin: ");
	}
}

