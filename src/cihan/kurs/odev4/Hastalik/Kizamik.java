package cihan.kurs.odev4.Hastalik;

public class Kizamik extends VirusEnfekt{
	
	public void sonuc() {
	
		setBulasmaDurumu(true); 
		setBulasmaOrani(0.85f);
		setBulasmaTuru("Çevresel Yolla");
		setIlaciVarmi(true);;
		setUlkedeGorulmeSikligi(0.10f);
		setKalitsalmi(false);
		
		String  gBulasmaDurumu        = "HAYIR";
			if(getBulasmaDurumu()==true) gBulasmaDurumu= "EVET" ; 
		float   gBulasmaOrani         = getBulasmaOrani();
		String  gBulasmaTuru   		  = getBulasmaTuru();
		String gIlaciVarmi    		  = "YOK"; 
			if(getIlaciVarmi()==true) gIlaciVarmi= "VAR" ; 
		float   gUlkedeGorulmeSikligi = getUlkedeGorulmeSikligi();
		String gKalitsalmi           =  "HAYIR";
			if(getKalitsalmi()==true) gKalitsalmi= "EVET" ; 
		
		getHastalikTuru("Kızamık");
		
		System.out.println("Bulaşıcı mı: " + gBulasmaDurumu);
		System.out.println("Bulaşma Oranı : %" + gBulasmaOrani*100);
		System.out.println("Bulaşma Türü : " + gBulasmaTuru);
		System.out.println("İlacı Varmı : " +gIlaciVarmi );
		System.out.println("Ülkede Görülme Sıklığı Nedir : %" + gUlkedeGorulmeSikligi*100);
		System.out.println("Kalıtsal mı : " + gKalitsalmi);
		getTedaviMetodu() ;
		
	}
	
	@Override
	public void getTedaviMetodu() {
		System.out.println("Tedavi Türü : Aşı Yapılmalıdır.");
	}
	
	

}
