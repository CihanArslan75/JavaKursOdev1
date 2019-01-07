package cihan.kurs.odev5.bigdecimal;


import java.math.BigDecimal;
import java.util.*;
	
 class SolutionHR{
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String [] s=new String[n+2];
    	  
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
      	sc.close();
      	
      	
      	BigDecimal sayi = new BigDecimal(s[0]);
      	String temp;
      	for(int i =0 ; i<n;i++) { 
      		for(int j=i ;j<n;j++ ) {
      			if(sayi.compareTo(new BigDecimal(s[j]))<0) {
      				temp = s[i];
      				s[i]=s[j];
      				s[j]=temp;
      			}
      			sayi=new BigDecimal(s[i]);
      		}
      	}
      	
      	
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}