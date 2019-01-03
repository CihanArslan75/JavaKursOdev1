package cihan.kurs.odev4.anagrams;

import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
    	 int harfSayisi1 = 0;
         int[] harfSayisiArray1= new int[26];
         int harfSayisi2 = 0;
         int[] harfSayisiArray2= new int[26];
         char[] englishAlp= { 'a', 'b' ,'c' ,'d' ,'e' ,'f' ,
         					  'g', 'h', 'i' ,'j' ,'k', 'l', 
         					  'm', 'n', 'o', 'p', 'q', 'r', 's',
         					  't', 'u', 'v', 'w', 'x', 'y', 'z'};
         
         if(a.length()!=b.length()) return false;
         
         a=a.toLowerCase();
         b=b.toLowerCase();
         for(int i=0 ;i<26 ;i++) {
         	//----------- İlk kelimenin harf sayısı ----------- 
         	for(int j=0 ; j<a.length();j++) {
 	        	
 	        	if(((a.substring(j,j+1)).charAt(0))==englishAlp[i])
 	        	{  
 	        		harfSayisi1++;
 	        	}
 	        }
 	        harfSayisiArray1[i]=harfSayisi1 ;
 	        harfSayisi1=0;
 	      //----------- İkinci kelimenin harf sayısı ----------- 
 	        for(int jj=0 ; jj<b.length();jj++) {
 	        	
 	        	if(((b.substring(jj,jj+1)).charAt(0))==englishAlp[i])
 	        	{  
 	        		harfSayisi2++;
 	        	}
 	        }
 	        harfSayisiArray2[i]=harfSayisi2 ;
 	        harfSayisi2=0;
 	       
 	        
 	        if(harfSayisiArray1[i]!=harfSayisiArray2[i]) {
         		return false;
         		//System.out.println(i + " :" +ret);
         	}
         }
        
         return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
              
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

  }