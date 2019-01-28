package cihan.kurs.odev8.HashSet;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
       
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        Set<String> pair= new   HashSet<String>();
        int a=0;
        for (int i = 0; i < t; i++) {
        	//System.out.println("a:"+pair_left[i]+" "+pair_right[i]);
        	//System.out.println("b:"+pair.contains(pair_left[i]+" "+pair_right[i]));
            if(pair.contains(pair_left[i]+" "+pair_right[i])) 
            {  System.out.println("a");
            	System.out.println(a);
            }
            else
            {System.out.println("b");
            	System.out.println(++a);
            }
            pair.add( pair_left[i]+" "+pair_right[i]);
         
        }
        

    }
}

//5
//john tom
//john mary
//john tom
//mary anna
//mary anna
//
//1
//2
//2
//3
//3