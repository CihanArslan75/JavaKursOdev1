package cihan.kurs.odev8.dequeue;

import java.util.*;
import java.util.function.Consumer;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;
public class test {
	   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       Deque<Integer> deque = new ArrayDeque<Integer>();
       int n = in.nextInt();
       int m = in.nextInt();
       int enbuyuk=0;
       int sayi=0;
       Deque<Integer> deque1 = new ArrayDeque<Integer>();
	      for (int i = 1; i <= n; i++) {
	           int num = in.nextInt();
	           deque.add(num);
	          	   for(int aa : deque) {
	        		  sayi++;
	        		  if(sayi<=m) {
		        		  System.out.println("sayi:"+sayi);
		        	      deque1.add(aa);
		        	      System.out.println("deque1:"+deque1);
	        		  }
	        		  else if(sayi>m) 
	        		  {
	        			  sayi=0;
	        			  deque1.removeFirst();
	        		  }
	        	   }
	               int a = new HashSet<Integer>(deque1).size();
	               
	        	  
	               if(deque.size()>enbuyuk) enbuyuk=a;
	              // if(enbuyuk==m) break;
	              
	           //}
	       
	        deque.removeFirst();
	       
	        }
	       
	        System.out.println(enbuyuk);  
	      }
       
             
   
}

