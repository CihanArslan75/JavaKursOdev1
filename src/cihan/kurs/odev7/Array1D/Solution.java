package cihan.kurs.odev7.Array1D;

import java.util.Scanner;

public class Solution {

	 public static boolean canWin(int leap, int[] game) {
	        int sum = 0;
	              for(int i=0;i<game.length;i=i+leap) {
	            	 
	                  if(i+leap+1>=game.length) 
	                  {
	                   	return true;
	                  }
	                  if(game[i]==0) 
	                  {
	                	  sum++;
	                  }
	                  if(game[i+leap]==0) 
	                  {  
	                	  continue;
	                  }	
	                  else
	                  {
	                	  return false;
	                  }
	               }
	               if(sum==game.length) 
	               {  
	            	   return true;
	               }
	               return false;
	          
	    }
	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        int q = scan.nextInt();
	        while (q-- > 0) {
	            int n = scan.nextInt();
	            int leap = scan.nextInt();
	            
	            int[] game = new int[n];
	            for (int i = 0; i < n; i++) {
	                game[i] = scan.nextInt();
	            }

	            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
	        }
	        scan.close();
	    }

}
