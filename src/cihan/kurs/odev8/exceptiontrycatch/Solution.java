package cihan.kurs.odev8.exceptiontrycatch;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        
        try {
	        int x=sc.nextInt();
	        int y=sc.nextInt();
	        int z=x/y;
	        System.out.println(z);
        } catch(ArithmeticException e) {
        	System.out.println(e);
        } catch(Exception e) {
        	System.out.println(e.getClass().getName());
        }
        
    }
    
 
}