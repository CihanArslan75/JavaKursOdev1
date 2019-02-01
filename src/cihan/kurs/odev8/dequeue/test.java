package cihan.kurs.odev8.dequeue;

import java.util.*;
public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<Integer>();
        int n = in.nextInt();
        int m = in.nextInt();
        int nn=n-m+1;
        int mm=m;
        int enbuyuk=0;
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
        }
        
        Object[] obj=new Object[n];
        obj=deque.toArray();
          
        for(int i=0;i<=nn;i++) {
            HashMap<Integer, Integer> obj1 = new HashMap<Integer, Integer>();
           for(int j=i;j<mm;j++) {
        	   obj1.put((Integer)(obj[j]),(Integer)(obj[j])); 
           }
           if(enbuyuk<obj1.size())  enbuyuk=obj1.size();
           mm++;
           if(enbuyuk==m) break;
           if(mm==n+1) break;
           } 
        
      
        System.out.println(enbuyuk);
        
           
   }
}

