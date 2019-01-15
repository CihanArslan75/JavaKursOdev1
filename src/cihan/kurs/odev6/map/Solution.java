package cihan.kurs.odev6.map;

//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;


class Solution{
	public static void main(String []argh)
	{
		 Scanner in = new Scanner(System.in);
	      int n=in.nextInt();
	      in.nextLine();
	      HashMap<String, Integer> hm = new HashMap<String, Integer>();
	      
	      for(int i=0;i<n;i++)
	      {
	         String name=in.nextLine();
	         int phone=in.nextInt();
	         hm.put(name, phone);         
	         in.nextLine();
	      }
	      while(in.hasNext())
	      {
	         String s=in.nextLine();
	         try{
	            int temp = hm.get(s);
	            System.out.println(s+"="+temp);
	         }catch(NullPointerException e){
	            System.out.println("Not found");
	         }    
	      }
		in.close();
		
	}
}


//3
//uncle sam
//99912222
//tom
//11122222
//harry
//12299933
//uncle sam
//uncle tom
//harry
//
//uncle sam=99912222
//Not found
//harry=12299933