package cihan.kurs.odevSubstringComparisons;

import java.util.Scanner;

public class substringComparisonsHK {

	 public static String getSmallestAndLargest(String s, int k) {
	        String smallest = "";
	        String largest = "";
	        int boyut =s.length()-k+1;
	        String[] ss=new String[boyut];
	        
	        largest=s.substring(0,k);
	        smallest=s.substring(0,k);
	        for(int i=0;i<boyut;i++)
	        {
	          ss[i]=s.substring(i,(k+i));
	       
	        if(ss[i].compareTo(largest)>=0){
	            largest=ss[i];
	        }  
	        if(ss[i].compareTo(smallest)<0  ){
	            smallest=ss[i];
	        }
	        
	        }
	         
	      
	    
	        // Complete the function
	        // 'smallest' must be the lexicographically smallest substring of length 'k'
	        // 'largest' must be the lexicographically largest substring of length 'k'
	        
	        return smallest + "\n" + largest;
	    }
	
	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
	        String s = scan.next();
	        int k = scan.nextInt();
	        scan.close();

	}

}
