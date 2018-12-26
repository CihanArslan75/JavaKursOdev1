package cihan.kurs.odev3.Kalitim;

public class Hastalik {       
	
	private boolean bulasmaDurumu;
	private float   bulasmaOrani ;
	private String  bulasmaTuru;
	private boolean ilaciVarmi;
	private float   ulkedeGorulmeSikligi;
	private boolean kalitsalmi;
	
	
	public boolean getBulasmaDurumu() {
		return bulasmaDurumu;
	}
	public void setBulasmaDurumu(boolean bulasmaDurumu) {
		this.bulasmaDurumu = bulasmaDurumu;
	}
	public float getBulasmaOrani() {
		return bulasmaOrani;
	}
	public void setBulasmaOrani(float bulasmaOrani) {
		this.bulasmaOrani = bulasmaOrani;
	}
	public String getBulasmaTuru() {
		return bulasmaTuru;
	}
	public void setBulasmaTuru(String bulasmaTuru) {
		this.bulasmaTuru = bulasmaTuru;
	}
	public boolean getIlaciVarmi() {
		return ilaciVarmi;
	}
	public void setIlaciVarmi(boolean ilaciVarmi) {
		this.ilaciVarmi = ilaciVarmi;
	}
	public float getUlkedeGorulmeSikligi() {
		return ulkedeGorulmeSikligi;
	}
	public void setUlkedeGorulmeSikligi(float ulkedeGorulmeSikligi) {
		this.ulkedeGorulmeSikligi = ulkedeGorulmeSikligi;
	}
	public boolean getKalitsalmi() {
		return kalitsalmi;
	}
	public void setKalitsalmi(boolean kalitsalmi) {
		this.kalitsalmi = kalitsalmi;
	}
	
	public void getTedaviMetodu() {
		 System.out.println("Tedavi Türü : İlaçla Tedavi Edilebilir .");
	}
	
}
