package cihan.kurs.odev6.List;

import java.util.List;

public class Runner {
	
	public static void main(String[] args) {
		List liste = new ListOther();
		
		liste.add(2);
		liste.add("String");
		liste.add(3);
		liste.add(null);
		System.out.println("index:"+liste.indexOf("3") );
		
		System.out.println("contains:"+liste.contains("string") );
		
		for(int i=0;i<liste.size();i++) {
			System.out.print(liste.get(i)+" ");
		}
	}

}
