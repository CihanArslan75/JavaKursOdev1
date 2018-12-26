package cihan.kurs.odev3.Kalitim;

import java.util.Scanner;

public class Runner {
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		boolean myVar=true;
		do{	
			System.out.println("Hastalıklar için Sayı Değerlerini Giriniz : ");
			System.out.println("Grip     (1)  ");
			System.out.println("Kızamık  (2)  ");
			System.out.println("Faranjit (3)  ");
			System.out.println("Mantar   (4)  ");
			System.out.println("Menenjit (5)  ");
			int i=scanner.nextInt();
	
			switch(i) {
			case 1:
				Grip grip= new	Grip();
				grip.sonuc();
				break;
			case 2:
				Kizamik kizamik= new Kizamik();
				kizamik.sonuc();
				break;
			case 3:
				Faranjit faranjit= new	Faranjit();
				faranjit.sonuc();
				break;
			case 4:
				Mantar mantar= new Mantar();
				mantar.sonuc();
				break;
			case 5:
				Menenjit menenjit= new Menenjit();
				menenjit.sonuc();
				break;
			default :
				System.out.println("Menüden Hastalik Seçmediniz !");
		}
			System.out.println("Çıkmak için x tuşuna Basınız ! ");
			String x=scanner.next();
			if( x.equals("X") || x.equals("x"))  {  
				myVar=false;
				System.out.println("İşlem Bitti !!!!");
			}
		}while(myVar);
		scanner.close();
	}
}
