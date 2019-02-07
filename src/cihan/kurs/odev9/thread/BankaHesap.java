package cihan.kurs.odev9.thread;

public class BankaHesap {
	
	private double bakiye;
	
    public BankaHesap(double bakiye) {
    	this.bakiye=bakiye;
	}
    //synchronized metodun başına geldiğinde.
    //yalnızca önce giren thread çalısır gelen bekletilir.
    //metot tamamlandıktan sonra yeni thread metoda ulaşır.
    synchronized
    public void paraCek(String kim,double tutar) {
    	if(tutar>this.bakiye) {
    		  System.out.print(kim+" hesapta istenilen miktarda para yok ");
              System.out.print("Çekilmek İstenilen Para Miktarı " + tutar);
              System.out.println(" Bakiye "+this.bakiye);    
    	}else {
    	      bakiye-=tutar;
    	      System.out.println(kim+" "+tutar+" Para Çekti Kalan Bakiye " + this.bakiye);
    	}
    }

}
