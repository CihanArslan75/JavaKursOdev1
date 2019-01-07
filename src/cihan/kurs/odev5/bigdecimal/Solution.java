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