package cihan.kurs.odevScanner;

import java.util.Scanner;
 
public class ScanOdev {


	private Scanner scanner = new Scanner(System.in);
	private boolean myVar=true;
	
	public ScanOdev() {
		donguScan();
	}

	private void donguScan() {
		do {
			System.out.println("Bir Sayı Giriniz :");
			int a = scanner.nextInt();
			System.out.println("Bir Sayı Daha Giriniz :");
			int b =scanner.nextInt();
			System.out.println("İşlem Giriniz: ");
			System.out.println(" + ile Toplama  yapabilirsiniz!");
			System.out.println(" - ile Çıkartma yapabilirsiniz!");
			System.out.println(" * ile Çarpma   yapabilirsiniz!");
			System.out.println(" / ile Bölme    yapabilirsiniz!");
			String islem=scanner.next();
	
			int sonuc = islemYap(a,b,islem);
			System.out.println("Sonuç : " +sonuc);
			System.out.println("Çıkış için  'X' Tuşuna Basınız !!!!");
			String x =scanner.next();
				if( x.equals("X") || x.equals("x"))  {  
					myVar=false;
					System.out.println("İşlem Bitti !!!!");
				}
			
		} while(myVar);
		
		scanner.close();
	}

	private int islemYap(int a, int b, String islem) {
		System.out.println("----------------------------- ");
		int sonuc;
		//sonuc = a+islem+b;
		if(islem.equals("+"))          sonuc = a+b;
			else if(islem.equals("-")) sonuc = a-b;
			else if(islem.equals("*")) sonuc = a*b;
			else if(islem.equals("/")) sonuc = a/b;
			else {
				System.out.println("Geçerli Bir İşlem Girmediniz !");
				sonuc=0;
			} 
		return sonuc;
	}

	

}
