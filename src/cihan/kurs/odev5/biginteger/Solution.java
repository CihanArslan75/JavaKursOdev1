package cihan.kurs.odev5.biginteger;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	String nsayi1=scanner.nextLine();
    	String nsayi2=scanner.nextLine();
        BigInteger sayi1=new BigInteger(nsayi1);
        BigInteger sayi2=new BigInteger(nsayi2);
        BigInteger toplam;
        BigInteger carpim;
        toplam = sayi1.add(sayi2);
        carpim = sayi1.multiply(sayi2);
        System.out.println("toplam :" + toplam);
        System.out.println("çarpim :" + carpim);
        scanner.close();
    }
}
