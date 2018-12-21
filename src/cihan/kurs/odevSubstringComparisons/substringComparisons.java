package cihan.kurs.odevSubstringComparisons;

import java.util.Scanner;

public class substringComparisons {

	private Scanner scanner=new Scanner(System.in);
	
	public substringComparisons() {
		doSubstringComparisons();
	}
	
	private void doSubstringComparisons() {
		System.out.println("Kelime Giriniz: ");
		String s=scanner.next();
		System.out.println("Uzunluk Giriniz: ");
		int k=scanner.nextInt();
		
		int boyut =s.length()-k+1;
		String[] a = new String[s.length()-1];  
		String smallest = s.substring(0,k);
	    String largest =  s.substring(0,k);
		
	    
		for(int i=0;i<(boyut-k+1);i++) {
			a[i] = s.substring(i,(i+k));
			
			if(a[i].compareTo(largest)>=0){
	            largest=a[i];
	        }  
	        if(a[i].compareTo(smallest)<0  ){
	            smallest=a[i];
	        }
	        
			}
		System.out.println("smallest:" +smallest);
		System.out.println("largest:" +largest);
        scanner.close();
		
	}
}
