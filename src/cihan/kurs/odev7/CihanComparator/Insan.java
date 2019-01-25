package cihan.kurs.odev7.CihanComparator;
import cihan.kurs.odev7.CihanComparator.CihanComparator;

public class Insan implements CihanComparator {
	private String adSoyad;
	private int yas;
	private double boy;
	
	static int bosluk1=0;

	
	public Insan (String adSoyad,int yas,double boy) {
		this.adSoyad=adSoyad;
		this.yas=yas;
		this.boy=boy;
		
		if(bosluk1<adSoyad.length()) bosluk1=adSoyad.length();
		
	}
	
	public String getAdSoyad() {
		return adSoyad;
	}
	public void setAdSoyad(String adSoyad) {
		this.adSoyad = adSoyad;
	}
	public int getYas() {
		return yas;
	}
	public void setYas(int yas) {
		this.yas = yas;
	}
	public double getBoy() {
		return boy;
	}
	public void setBoy(int boy) {
		this.boy = boy;
	}

	
	@Override
	public int compareCihan(Object o1, Object o2) {
		Insan ob1= (Insan)o1;
		Insan ob2= (Insan)o2;

		if(ob1.yas<ob2.yas) return -1;
		else if(ob1.yas>ob2.yas) return 1;
		else if(ob1.equalsCihan(ob2)) 
		{
			if(ob1.boy<ob2.boy) return -1;
			else if(ob1.boy>ob2.boy) return 1;
		}
		return 0;
	}

	@Override
	public boolean equalsCihan(Object o1) {
		Insan ob1=(Insan) o1;
		if(this.yas== ob1.yas) return true;
		return false;
	}
	
	public void toStringCihan() {
		System.out.print(getAdSoyad());
		for(int i=0;i<(bosluk1-getAdSoyad().length())+5;i++) {
			System.out.print(" ");
		}
		System.out.print(getYas());
		for(int i=0;i<bosluk1;i++) {
			System.out.print(" ");
		}
		System.out.print(getBoy());
	    System.out.println();  
	}
		

}
