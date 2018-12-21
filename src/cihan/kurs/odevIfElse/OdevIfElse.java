package cihan.kurs.odevIfElse;

import java.util.*;
 
public class OdevIfElse {  	     
	private static final Scanner scanner = new Scanner(System.in);
	 
	public static void main(String args[]) {
	   
//		Task 
//		Given an integer, , perform the following conditional actions:
//
//		If  is odd, print Weird
//		If  is even and in the inclusive range of 2 to 5 , print Not Weird
//		If  is even and in the inclusive range of 6 to 20, print Weird
//		If  is even and greater than 20, print Not Weird
//		Complete the stub code provided in your editor to print whether or not  is weird.
//		
		int a = scanner.nextInt();
		//int a=7;
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		int kalan=a%2;
		if(kalan==1) {
			System.out.println("Odd Weird");	
		} 
		else {
			if(a>=2 && a<=5) {
				System.out.println("Even Not Weird");	
			}
			else if(a>=6 && a<=20) {
				System.out.println("Even Weird");	
			}
			else if( a>20) {
				System.out.println("Even Not Weird");	
			}
		}
		scanner.close();
		
	}
	

}
