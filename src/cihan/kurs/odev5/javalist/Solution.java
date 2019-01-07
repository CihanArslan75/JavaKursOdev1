package cihan.kurs.odev5.javalist;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//5
//12 0 1 78 12
//2
//Insert
//5 23   //5.indexe 23 ekle
//Delete
//0     //0.index sil

public class Solution {
	 public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
	       int n = sc.nextInt() ; //arrayın boyutu
	       //int[] sayi= new int[n];
	       List<Integer> sayi = new ArrayList<>();
	       for(int i =0 ;i<n;i++) {
	    	   sayi.add( sc.nextInt());  
	       }
	       
	       int tekrarSayisi=sc.nextInt();
	     //  int insertIndex;
	      // int insertValue;
	      // int deleteindex;
	       String insertDelete;
	       while(tekrarSayisi>0) {
	    	  // System.out.println("burdayım");
	    	   insertDelete=sc.next() ;  	   
	    	   if(insertDelete.equals("Insert"))
	    	   {
			       tekrarSayisi--;
			       sayi.add( sc.nextInt(),sc.nextInt());
			       //insertIndex=sc.nextInt();
			       //insertValue=sc.nextInt();
	    	   }
	    	   else if(insertDelete.equals("Delete"))
	    	   {   tekrarSayisi--;
	    		   //deleteindex=sc.nextInt();
	    	   	sayi.remove(sc.nextInt());
	    	   }
	    	   else
	    	   {
	    		   System.out.println("Insert yada Delete Giriniz;");
	    	       break;
	    	   }
	       }
	       
	       Iterator<Integer> iterator = sayi.iterator();
	       iterator = sayi.iterator();
			while(iterator.hasNext()){
				int x = (int) iterator.next(); //ConcurrentModificationException here
				System.out.print(x+" ");
			}
           	    
	        //System.out.println(sayi);
	        sc.close();
	    }
}


//List<String> letters = new ArrayList<String>();
//letters.add("A");
//letters.add("B");
//letters.add("C");
//letters.add(0, "s");
//letters.remove(3);
//
////convert list to array
//String[] strArray = new String[letters.size()];
//strArray = letters.toArray(strArray);
//System.out.println(Arrays.toString(strArray));

