package cihan.kurs.odev3.Soyagaci;

public class Insan {
	 private String adi;
	 private String soyAdi;
	 private String DogumYeri;
	 private String DogumTarihi;
	 public Insan  anne;
	 public Insan  baba;
	
	public Insan() {
		
	}
	
	public String getAdi() {
		return adi;
	}
	public void setAdi(String adi) {
		this.adi = adi;
	}
	
	public String getSoyAdi() {
		return soyAdi;
	}
	public void setSoyAdi(String soyAdi) {
		this.soyAdi = soyAdi;
	}
	
	public String getDogumYeri() {
		return DogumYeri;
	}
	public void setDogumYeri(String dogumYeri) {
		DogumYeri = dogumYeri;
	}
	
	public String getDogumTarihi() {
		return DogumTarihi;
	}
	public void setDogumTarihi(String dogumTarihi) {
		DogumTarihi = dogumTarihi;
	}
	
	public Insan getAnne() {
		return anne;
	}
	public void setAnne(Insan anne) {
		this.anne = anne;
	}
	
	public Insan getBaba() {
		return baba;
	}
	public void setBaba(Insan baba) {
		this.baba = baba;
	}

}
