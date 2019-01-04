package cihan.kurs.odev4.abstractOdev;

public class Tezgahtar extends Calisan{

	public Tezgahtar(String ad, String soyAd,String brutMuNetmi) {
		super(ad, soyAd,brutMuNetmi);
	}

	private int satis;
	public void setSatis(int satis) {
		this.satis=satis;
	}
	
	@Override
	public int maasHesapla(String brutMuNetmi) {
		return this.satis/10;
	}

	@Override
	public String personelGorevi() {
		return "Tezgahtar";
	}

	
}
