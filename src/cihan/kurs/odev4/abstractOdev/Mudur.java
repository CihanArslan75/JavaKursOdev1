package cihan.kurs.odev4.abstractOdev;

public class Mudur extends Calisan{
	
	private static final int CIPLAK_MAAS = 2000;
	private static final int PRIM_LIMITI = 20000; 
	private int satis;
	
	public Mudur(String ad, String soyAd,String brutMuNetmi) {
		super(ad, soyAd,brutMuNetmi);
	}
	
	public void setToplamSatis(int satis) {
		this.satis=satis;
	}
	
	public int maasHesapla(String brutMuNetmi) {
		   if(this.satis>Mudur.PRIM_LIMITI) {
				return (CIPLAK_MAAS + (this.satis-Mudur.PRIM_LIMITI)/10 ) - Calisan.kesintiler;
				}
			return CIPLAK_MAAS -Calisan.kesintiler;
	}
	@Override
	public String personelGorevi() {
		return "Müdür";
	}

	
	@Override
	public String getGorevYeri() {
		return super.gorevYeri[0] ;
			
	}
	
	public static int kesintiHesapla() {
		 return kesintiler=1000;
	}	
	
	
	}
