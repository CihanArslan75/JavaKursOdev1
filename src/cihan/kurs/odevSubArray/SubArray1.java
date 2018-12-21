package cihan.kurs.odevSubArray;

import java.util.Scanner;

public class SubArray1 {
  
	private Scanner scanner = new Scanner(System.in);
	public SubArray1() {
		toplamBul1();
	}
	private int toplamBul1() {
		
		
		System.out.println("Eleman Sayısını Giriniz : ");
		int   n = scanner.nextInt();
		int  a; 
		int[] aa = new int[n];
		int toplam = 0;
		int negatifSayisi =0;
		System.out.println("Dizinin elemanlarını arada boşluk olacak şekilde yanyana Giriniz.");
		for (int i=0 ;i<n;i++) {
			a = scanner.nextInt();	
			aa[i] = a;		
		}
		
		for (int i =n ;i>0 ;i--) {
			for(int j = 0 ; j<n ;j++) {
				for(int k=j ;k<i ; k++) {
					toplam +=aa[k];
				}
				if(toplam<0) negatifSayisi++;
				toplam=0;
			}
			
		}
		
		scanner.close();
		System.out.println("negatifSayisi : " +negatifSayisi);
		return negatifSayisi;
	}

}
