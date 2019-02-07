package cihan.kurs.odev9.thread;

public class ParaCek {

	public static void main(String[] args) {
		BankaHesap hesap=new BankaHesap(1000);
		
		Thread p1=new ParaCekThread(hesap, "thread 1", 600);
		Thread p2=new ParaCekThread(hesap, "thread 2", 600);
		Thread p3=new ParaCekThread(hesap, "thread 3", 100);
		Thread p4=new ParaCekThread(hesap, "thread 4", 50);
		Thread p5=new ParaCekThread(hesap, "thread 5", 10);
		Thread p6=new ParaCekThread(hesap, "thread 6", 10);
		
		p1.start();
		p2.start();
		p3.start();
		p4.start();
		p5.start();
		p6.start();
		

	}

}
