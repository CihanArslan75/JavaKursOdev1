package cihan.kurs.odev3.Kalitim;

public class Mantar extends MantarEnfekt{
	
	public void sonuc() {
		
		setBulasmaDurumu(true); 
		setBulasmaOrani(0.70f);
		setBulasmaTuru("Çevresel Yolla");
		setIlaciVarmi(true);;
		setUlkedeGorulmeSikligi(0.50f);
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
		
		getHastalikTuru("Mantar");
		
		System.out.println("Bulaşıcı mı: " + gBulasmaDurumu);
		System.out.println("Bulaşma Oranı : %" + gBulasmaOrani*100);
		System.out.println("Bulaşma Türü : " + gBulasmaTuru);
		System.out.println("İlacı Varmı : " +gIlaciVarmi );
		System.out.println("Ülkede Görülme Sıklığı Nedir : %" + gUlkedeGorulmeSikligi*100);
		System.out.println("Kalıtsal mı : " + gKalitsalmi);
		getTedaviMetodu() ;
		
	}
}
