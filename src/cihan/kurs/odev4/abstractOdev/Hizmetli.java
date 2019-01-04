package cihan.kurs.odev4.abstractOdev;

public class Hizmetli extends Calisan {
	private static final int SAAT_UCRETI=10;
	private int mesaiSaati;

	public Hizmetli(String ad, String soyAd,String brutMuNetmi) {
		super(ad, soyAd,brutMuNetmi);
	}
	public void setMesaiSaati(int mesaiSaati) {
		this.mesaiSaati=mesaiSaati;
	}
	public int maasHesapla(String brutMuNetmi) {
		return this.mesaiSaati*Hizmetli.SAAT_UCRETI;
	}
	public String personelGorevi() {
		return "Hizmetli";
	}
		

}
