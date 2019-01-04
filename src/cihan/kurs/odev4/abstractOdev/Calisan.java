package cihan.kurs.odev4.abstractOdev;

public abstract class Calisan {
	private String ad;
	private String soyAd;
	private String brutMuNetmi;
	public String gorevYeri[] = { "Merkez Şube" , "Beypazarı Şube"} ;
	public static int kesintiler ;
	public static final int MAAS=1200;
	public static final int FAZLAMESAI=120;  //Aylık net 120 tl
	
	public Calisan(String ad,String soyAd,String brutMuNetmi) {
		this.ad=ad;
		this.soyAd=soyAd;
		this.brutMuNetmi=brutMuNetmi;
	}
	public String getAd() {
		return ad;
	}
	public String getSoyAd() {
		return soyAd;
	}
	public String getBrutMuNetMi() {
		return brutMuNetmi;
	}
	
	public String getGorevYeri() {
		if(this.brutMuNetmi=="N")
			return this.gorevYeri[0];
		else
			return this.gorevYeri[1];
		
	}
	
	public abstract int maasHesapla(String brutMuNetmi);
		
	public String getBilgi(){
		return this.getGorevYeri() +" 'de Görev Yapan  " +this.personelGorevi() + ": " + this.ad + " " + this.soyAd +
				", bu ay " + this.maasHesapla(this.brutMuNetmi) + " YTL alacaktır.";
	
	}
	
	public abstract String personelGorevi() ;
	
	public static int kesintiHesapla() {
		 return kesintiler=200;
	}	
	
}
