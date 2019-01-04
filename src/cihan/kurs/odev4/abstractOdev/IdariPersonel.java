package cihan.kurs.odev4.abstractOdev;

public class IdariPersonel extends Calisan{
	
	
	public IdariPersonel(String ad, String soyAd,String brutMuNetmi) {
		super(ad, soyAd,brutMuNetmi);
	}

	@Override
	public int maasHesapla(String brutMuNetmi) {
			return (Calisan.MAAS - Calisan.kesintiler);
					
	}

	@Override
	public String personelGorevi() {
		return "İdari Personel";
	}

	
}
