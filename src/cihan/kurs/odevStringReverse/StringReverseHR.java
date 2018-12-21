package cihan.kurs.odevStringReverse;

import java.util.Scanner;

public class StringReverseHR {
	     
		 public static void main(String[] args) {
			    Scanner scanner=new Scanner(System.in);
				String a=scanner.nextLine();
				int n =a.length();
				String[] aa= new String[n];
				String aReverse = "";
				String sonuc;
				
				for(int i=0 ; i<n; i++) {
					aa[i]=a.substring(i,i+1);
				}
				for(int i=n-1 ; i>=0;i--) {
					aReverse =aReverse+aa[i] ;
				}
				
				
				if(a.equals(aReverse)) 
					 System.out.println("Yes");
				else 
					 System.out.println("No");
			scanner.close();	        
		    }
	
}
	


