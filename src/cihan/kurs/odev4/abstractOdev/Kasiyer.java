package cihan.kurs.odev4.abstractOdev;

public class Kasiyer extends Calisan{
	
	public Kasiyer(String ad, String soyAd, String brutMuNetmi) {
		super(ad, soyAd, brutMuNetmi);
	}

	@Override
	public int maasHesapla(String brutMuNetmi) {
			return (IdariPersonel.MAAS + Calisan.FAZLAMESAI - Calisan.kesintiler);		
		
	}

	@Override
	public String personelGorevi() {
		return "Kasiyer";
	}

}
