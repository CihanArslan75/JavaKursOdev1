package cihan.kurs.odevSubArray;

import java.util.Scanner;

public class SubArrayHK {
	 public static void main(String[] args) {
	       Scanner scanner = new Scanner(System.in); 
	       int  n = scanner.nextInt();
	       int toplam=0;
	       int negatifSayisi=0;
	 
	       int[] aa = new int[n];

	       for(int i=0 ;i<n ;i++) {
	           aa[i]=scanner.nextInt();
	       }

	       for(int i=0 ; i<n ; i++) {
	    	   toplam=0;
	    	   for(int j=i ;j<n ; j++) {
	    		   toplam += aa[j];
	    		   if(toplam<0) negatifSayisi++;
	    	   }
	       }
	        
	    	   
	        System.out.println(negatifSayisi);
	        scanner.close();
	    }


}
