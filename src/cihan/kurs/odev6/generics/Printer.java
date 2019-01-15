package cihan.kurs.odev6.generics;
import java.io.IOException;

class Printer
{
	
	public void printArray(Object[] array) {
			for(int i=0;i<array.length;i++)
			{ 
				System.out.println("i:" +i + " " + array[i]);
			}
	}
 
}
