package cihan.kurs.odev7.ArrayList;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

    	Scanner sc= new Scanner(System.in);
    	int n =sc.nextInt();

	    	ArrayList<Integer>[] list=new ArrayList[n];

		    for(int i=0;i<n;i++) {
		       list[i] = new ArrayList<Integer>();
		       int n1=sc.nextInt();
			    for(int ii=0;ii<n1;ii++) {
			    	list[i].add(sc.nextInt());
			    }
		    }
		   
		    int n2 =sc.nextInt();
		    
		    for(int i=0;i<n2;i++) {
		    	try{
		    	 int n3 =sc.nextInt();
		    	 int n4 =sc.nextInt();
		       	 System.out.println(list[n3-1].get(n4-1));
		    	}
		    	catch (Exception e){
		    		System.out.println("ERROR!");
		    	}
		    }
		    
		 sc.close();   	
    }
}