package cihan.kurs.odev9.thread;

public class ParaCekThread extends Thread{
	
	private BankaHesap hesap;
	private String isim;
	private double tutar;
	public ParaCekThread(BankaHesap hesap,String isim,double tutar) {
		this.hesap=hesap;
		this.isim=isim;
		this.tutar=tutar;
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		hesap.paraCek(isim, this.tutar);
	}

}
