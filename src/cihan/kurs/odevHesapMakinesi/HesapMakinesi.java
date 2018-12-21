package cihan.kurs.odevHesapMakinesi;

import java.util.Scanner;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class HesapMakinesi {


	private Scanner scanner = new Scanner(System.in);
	//https://stackoverflow.com/questions/25130788/java-string-calculator
	public HesapMakinesi()  {
		//hesaplaExpression();
		hesaplaScan();
	}
	
    public void hesaplaExpression()  {
    	boolean cikis =true;
    	String x="a";
    	String islem="";
    	 ScriptEngine engine = new ScriptEngineManager().getEngineByExtension("js");
    	  
    	do{
    		
				System.out.println("Hesaplamak için sayı ve işlem giriniz !!! (Örnek  1*2-4= ) ");
				islem = scanner.next();
				
				islem=islem.substring(0, islem.length()-1);
				
				 try {
			            // Evaluate the expression
			            Object result = engine.eval(islem);
			            System.out.println("İslemSonucu : " +result);
			        }
			        catch (ScriptException e) {
			            // Something went wrong
			            e.printStackTrace();
			        }
				 
				System.out.println("Çıkış için  'X' Tuşuna Basınız !!!!");
				x=scanner.next();
				if(x.equals("x")  || x.equals("X"))
					{
						cikis=false;
						System.out.println("Program Bitti !!!!");
					}
    	}while(cikis);
    	
    }
    
    
    
	public void hesaplaScan() {
		boolean cikis = true;
		String islem="";
		Double islemSonucu=0d;
		String[] islemArray =new String[100];
		boolean islemSonu = true;
		int i=0;
		String x="a";
	
					
		do{
			System.out.println("Hesaplamak için sayı boşluk  işlem  boşluk giriniz !!! (Örnek  1 * 2 - 4 = ) ");
			 i= 0;
			 islemSonucu=0d;
			 islemSonu=true;
			 cikis=true;
		   do {
			   	islem = scanner.next();
				islemArray[i]=islem;
				//System.out.println(islemArray[i]);
				if(islem.equals("="))  { 
					islemSonu=false;
				} 
				i++;    
				//System.out.println(islemArray[i]);
			}while(islemSonu);
		 
		   //System.out.println("i = " + i);
		   islemSonucu =Double.parseDouble(islemArray[0]); 	
			   
		   for(int j=1 ;j <= (i-3) ;j=j+2)	{
				//System.out.println("j"+ j);
				islemSonucu = islemYap(islemSonucu,islemArray[j],Double.parseDouble(islemArray[j+1]));
			} 
		    //1 - 3 + 4 / 2 * 3 = 
			System.out.println("İslemSonucu : " +islemSonucu);
			System.out.println("Çıkış için  'X' Tuşuna Basınız !!!!");
			x=scanner.next();
			if(x.equals("x")  || x.equals("X")) {
				cikis=false;
				System.out.println("Program Bitti !!!!");
			}
			 
		}while(cikis);
		
   }
	 private double  islemYap(double islemSonucu,String operator,double sayi) {
		 if(operator.equals("+")) islemSonucu += sayi;
		 else if(operator.equals("-")) islemSonucu -= sayi;
		 else if(operator.equals("*")) islemSonucu *= sayi;
		 else if(operator.equals("/")) islemSonucu /= sayi;
		 else islemSonucu=0;
		 return islemSonucu;
		 
	 }

	
}
