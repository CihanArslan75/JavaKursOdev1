package cihan.kurs.odev6.generics;

import java.io.IOException;
import java.lang.reflect.Method;

public class Solution {

    public static void main( String args[] ) {
        Printer myPrinter = new Printer();
        
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        String[] stringArray1 = {"Cihan", "Arslan","Ankara","Çankaya"};
        
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        myPrinter.printArray(stringArray1);
        
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();
            if(name.equals("printArray"))
                count++;
        }

        if(count > 1) System.out.println("Method overloading is not allowed!");
      
    }
}