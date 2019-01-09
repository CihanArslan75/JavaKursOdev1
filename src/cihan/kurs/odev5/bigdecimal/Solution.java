package cihan.kurs.odev5.bigdecimal;

import java.math.BigDecimal;
import java.util.*;
	
 class Solution{
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String [] s=new String[n+2];
    	BigDecimal[] ss =new BigDecimal[n];
        
        for(int i=0;i<n;i++){
            s[i]=sc.next();
            ss[i]=new BigDecimal(s[i]);
        }
      	sc.close();
      	
      	
      	BigDecimal sayi = new BigDecimal(s[0]);
      	BigDecimal temp;
      	for(int i =0 ; i<n;i++) { 
      		for(int j=i ;j<n;j++ ) {
      			if(sayi.compareTo(ss[j])<0) {
      				temp = sayi;
      				ss[i]=ss[j];
      				ss[j]=temp;
      			}
      			sayi=ss[i];
      		}
      	    s[i]=ss[i].toString();
      	}
      	
     
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}
 
// 0. adım: başlangıç adımı i=0 olarak ata.
// 1. adım: dizideki i. sırasından sonraki en küçük sayının yerini bul. Bu dizideki en küçük sayı 1’dir ve 5. sıradadır.
// 2. adım dizinin i. sırasındaki sayıyı bu en küçük sayı ile yer değiştir: 1,7,2,9,6,5,3,7
// 3. adım : i’yi bir arttır ve 1. adıma git.