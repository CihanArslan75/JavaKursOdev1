package cihan.kurs.odev5.Array2D;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

	 private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	    	int boyut=6;//matrixin boyutu değişitirlebilir
		    int donusSayisi=(boyut-3+1)*(boyut-3+1);
		    int boyutx=boyut-3+1;
	        int[][] arr = new int[boyut][boyut];
	      
	        for (int i = 0; i < boyut; i++) {
	            String[] arrRowItems = scanner.nextLine().split(" ");
	            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
                   for (int j = 0; j < boyut; j++) {
	                int arrItem = Integer.parseInt(arrRowItems[j]);
	                arr[i][j] = arrItem;
	               // System.out.print(arrItem);
	            }
	        }
	        // System.out.print("\n");
	        scanner.close();
	       // 3 3 matrisleri oluşturur  
	        int[][][] arrSayi = new int[donusSayisi][boyut][boyut];
	        int sayi = 0;
	        int sayi1 = 0;
	        int jj=0;
	        while(sayi<donusSayisi) 
	        { 
	        	for(int i=sayi1 ; i<3+sayi1;i++) {
		        	for(int j =jj ;j<3+jj ;j++) {
		        		arrSayi[sayi][i-sayi1][j-jj] =arr[i][j];
		        }
		        }
	      
	        if((sayi1+1)%boyutx==0) 
	        {   
	        	sayi1=0;
	        	jj++;
	        }
	        else
	        {
	        	sayi1++;
	        }
	        sayi++;	
	        } 
	        // oluşturulan 3 3 lük matrisleri kumsaatine çevirip herbir matrisin elemanlarını toplar ve max toplamı bulur
	        int[] toplam=new int[donusSayisi];
	        int max=0;
	        for(int sayi11=0 ; sayi11<donusSayisi ;sayi11++) {
	          for(int i=0 ; i<3;i++) {
	        	 for(int j =0 ;j<3 ;j++) {
	        		if(i==1 && j==0) arrSayi[sayi11][i][j]=0;
	        		if(i==1 && j==2) arrSayi[sayi11][i][j]=0;
	        		toplam[sayi11]=toplam[sayi11]+arrSayi[sayi11][i][j];
	        	 }
	        	
	           }
	        if(sayi11==0) max=toplam[0];
	             if(max<toplam[sayi11])
		        {
		        	max=toplam[sayi11];
		        }
		     }
	        
	        System.out.println(max );
	       
	    }
}