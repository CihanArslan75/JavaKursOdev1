package cihan.kurs.odev5.primalityTest;

import java.math.BigInteger;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		final Scanner scanner = new Scanner(System.in);
		  String n = scanner.nextLine();
		  BigInteger nn = new BigInteger(n);
		
		  boolean prime=true;
		  //System.out.println(nn.isProbablePrime(100) ? "prime" : "not prime");
		  BigInteger i=BigInteger.valueOf(2) ;
		  
	         if(BigInteger.valueOf(1).equals(nn)) {
	        	 prime =false;
	         }
	         else
	         {
		       while(i.compareTo(nn)<0) {  
		    	   //System.out.println("a");
				 	if(i.equals(nn) )
				 	{
				 		continue;
				 	}
					else
					{
						BigInteger modResult= nn.mod(i);
						if(modResult== BigInteger.valueOf(0)) 
						{	
							prime =false;
							break;
						}
						 
					} 
				 i=i.add(BigInteger.valueOf(1));	
				 //System.out.println(i);
			   }
	         }
			  if(prime==true ) System.out.println("prime");
			  else  System.out.println("not prime");
				  
			  scanner.close();
	
	}


}

//BigInteger nn = new BigInteger("4901971054862853523"); 
