package cihan.kurs.odev4.tag;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	public static void main(String[] args){
			
		// "<(.+)>([^<]+)</\\1>
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		//final String regularExpression="[<,>,/]";
		String tagBas;
		String tagSon;
		Boolean tagSonVarmi=false;
		Boolean devam =false;
		while(testCases>0){
			String line = in.nextLine();
					
          	//Write your code here
           	do {			
				tagBas= line.substring(line.indexOf("<")+1,line.indexOf(">"));
				line=line.substring(line.indexOf(">")+1,line.length());
				tagSon= "</"+tagBas+">";
				if(line.indexOf(tagSon)>0) {
					tagSonVarmi =true ;
				} 
				System.out.println("line:" +line +" " +(line.length()-tagSon.length()));
				
				line=line.substring(0,(line.length()-tagSon.length())); 
				if(line.indexOf(">")>0) { 
					devam=true;
				}
				else
				{
					devam=false;
				}
				
           	}while(devam);
				
			if(tagSonVarmi) 
			{
				System.out.println(line);
			}
			else
			{
				System.out.println("None");
			}
			}
					
			testCases--;
		}
}

//1
//<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while<par>


