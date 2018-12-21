package cihan.kurs.odevSubArray;

import java.util.Scanner;

public class SubArray {
	
	private Scanner scanner = new Scanner(System.in); 

	public SubArray() {
		toplamBul();
	}
	
	private int toplamBul() {
		//5
		//1 -2 4 -5 1
		//9
		System.out.println("Eleman Sayısını Giriniz : ");
		int   n = scanner.nextInt();
		int   a;
		int[] aa 	   = new int[n];
		int   toplam   = 0; 
		int k,i,j;
		int negatifSayisi = 0;
		System.out.println("Dizinin elemanlarını arada boşluk olacak şekilde yanyana Giriniz.");
		
		for(i=0 ; i<n ; i++) {
			a = scanner.nextInt();
			aa[i] = a;
			
		}
		
         for( i = n ; i>0 ; i--) { 
        	 System.out.println("i: "+i  );
        	 
        	 for( j = 0 ; j<n ; j++) {
        		 System.out.println("j: " +j ); 
        		   
				for(toplam=0,k=j ; k <i; k++) {
	        	    toplam += aa[k];
					System.out.println("k: " +k  );  
				 }
          		 System.out.println("toplam: " + toplam );
        		 if( toplam < 0  ) negatifSayisi ++;
        		 	 
     	      }
        	
         }
        
		System.out.println("negatifSayisi : " + negatifSayisi);
		scanner.close();
		return toplam;
	}

}
