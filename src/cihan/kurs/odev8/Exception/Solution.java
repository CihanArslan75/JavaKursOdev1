package cihan.kurs.odev8.Exception;

import java.util.Scanner;

class MyCalculator {
    /*
    * Create the method long power(int, int) here.
    */
	public int power(int a,int b) throws Exception {
		 if(a==0 && b==0) 
    		 throw new java.lang.Exception("n and p should not be zero.");
    	 if(a<0 || b<0) 
    		 throw new java.lang.Exception("n or p should not be negative.");
		int aa=0;
		int bb=1;
		while(aa<b ) {
			bb=bb*a;
			aa++;
		}
		return bb;
	}
	
    
}

public class Solution {
    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
    	 while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();
             try {
            	System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
