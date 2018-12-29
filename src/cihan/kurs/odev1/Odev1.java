package cihan.kurs.odev1;
 //Odev1
public class Odev1 {
 
	public Odev1() {  
		toplama();
		cikartma();
		carpma();
		bolme();

	}

	private void toplama() {
		System.out.println("-------------------------------------------");
		int aToplama = 5; 
		int bToplama = 10;
		int cToplama;
		cToplama = aToplama + bToplama;
		System.out.println("Toplanan (a) = " + aToplama);
		System.out.println("Toplanan (b) = " + bToplama);
		System.out.println("Toplam   (c) = " + cToplama);
	}

	private void cikartma() {
		System.out.println("-------------------------------------------");
		int aCikartma = 50;
		int bCikartma = 10;
		int cCikartma;
		cCikartma = aCikartma - bCikartma;
		System.out.println("Eksilen  (a) = " + aCikartma);
		System.out.println("Çıkan    (b) = " + bCikartma);
		System.out.println("Fark     (c) = " + cCikartma);

	}

	private void carpma() {
		System.out.println("-------------------------------------------");
		int aCarpma = 5;
		int bCarpma = 10;
		int cCarpma;
		cCarpma = aCarpma * bCarpma;
		System.out.println("Çarpan   (a) = " + aCarpma);
		System.out.println("Çarpan   (b) = " + bCarpma);
		System.out.println("Çarpım   (c) = " + cCarpma);

	}

	private void bolme() {
		System.out.println("-------------------------------------------");
		int aBolme = 5;
		int bBolme = 10;
		int cBolme;
		cBolme = aBolme * bBolme;
		System.out.println("Bölünen  (a) = " + aBolme);
		System.out.println("Bölen    (b) = " + bBolme);
		System.out.println("Bölüm    (c) = " + cBolme);

	}

}
