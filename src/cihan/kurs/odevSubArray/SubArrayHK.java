package cihan.kurs.odevSubArray;

import java.util.Scanner;

public class SubArrayHK {
	 public static void main(String[] args) {
	       Scanner scanner = new Scanner(System.in); 
	       int a ; 
	       int   n = scanner.nextInt();
	       int toplam=0;
	       int negatifSayisi=0;
	       int[] aa = new int[n];

	       for(int i=0 ;i<n ;i++) {
	           a=scanner.nextInt();
	           aa[i]=a;
	       }

	       for(int i=n;i>0;i--) {
	           for(int j=0 ;j<n;j++) {
	               for(int k=j ;k<i;k++) {
	                  toplam +=aa[k]; 
	               }
	              
	        if(toplam <0 ) negatifSayisi++;
	         toplam=0;
	           }
	       }
	        System.out.println(negatifSayisi);
	        scanner.close();
	    }


}
