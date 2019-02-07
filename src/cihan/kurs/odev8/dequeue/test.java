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
  
          int sum=0;
   
          for (int i = 0; i < n; i++) {
              int num = in.nextInt();
             
              if(i==0) {
                deque.add(num);
                sum++;
              }
              else
              {
            	  if(deque.size()==m) {
            		  deque.removeFirst();
            	  }
            	  if(!deque.contains(num) && sum<m) {
            		  sum++;
            	  }
            	  deque.addLast(num);
            		
              }
             
             }
              
        System.out.println(sum);
                     
   }
}

