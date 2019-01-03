package cihan.kurs.odev4.stringtokens;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    	//final String regularExpression="[A-Za-z !,?._'@]";
    	final String regularExpression="[!,?._'@]";
    	int k=0;
    	String[] ssArray = null;
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
       	String ss= s.replaceAll(regularExpression," ");
        ssArray = ss.split(" ");
       	for(int i=0 ; i < ssArray.length; i++){
       		if(!ssArray[i].equals("")) 
       		{	//System.out.println(ssArray[i]);
       			k++;
       		}
       	}
        System.out.println(k);
        
        for(int i=0 ; i < ssArray.length; i++){
       		if(!ssArray[i].equals("")) 
       		{	System.out.println(ssArray[i]);
       		
       		}
       	}
       	scan.close();
    }
    

}
