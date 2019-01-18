package cihan.kurs.odev6.cihanArrayList;

import java.util.ArrayList;
import java.util.List;


//2
//4
//Cihan
//Atilla
//BİLGE
public class Runner {
	
	public static void main(String[] args) {
		
		CihanArrayList<Object> c=new CihanArrayList<Object>();
		List l =new ArrayList();
		
		c.add(0,1);
		c.add(1,2);
		c.add(2,3);
		c.add(3,4);
		c.add(4,"Cihan");
		c.add(5,"Atilla");
		c.add(6,"EDA");
		c.add(7,"BİLGE");
		c.remove(2);
		c.remove(0); 
		c.remove(4);
		c.add(4,"sssssssssssssssss");
		c.add(5,"sssssssssssssssss");
		c.remove(0);
		c.remove(3);
		c.add(3, "aaaaaaaaaaaaaaaaa");
		c.add("wwwwwwww");
		c.remove(0);
		c.add(1);
		c.add(5);
		c.add(3);
		
		System.out.println(c.toStringCihan());
		System.out.println("****************************************************************************************");
		c.arraySort();
		System.out.println(c.toStringCihan());
		System.out.println("****************************************************************************************");
	
		c.arrayReverse();
		
		l.add(0,1);
		l.add(1,2);
		l.add(2,3);
		l.add(3,4);
		l.add(4,"Cihan");
		l.add(5,"Atilla");
		l.add(6,"EDA");
		l.add(7,"BİLGE");
		l.remove(2);
		l.remove(0);
		l.remove(4);
		l.add(4,"sssssssssssssssss");
		l.add(5,"sssssssssssssssss");
		l.remove(0);
		l.remove(3);
		l.add(3, "aaaaaaaaaaaaaaaaa");
		l.add("wwwwwwww");
		l.remove(0);
		l.add(1);
		l.add(5);
		l.add(3);
		
				
//		for(Integer i=0;i<c.getSize();i++) {
//			System.out.println(c.get(i));
//		}
		System.out.println(c.toStringCihan());
		System.out.println("****************************************************************************************");
		System.out.println(l);
		System.out.println("+++++***************************************************************************");
		System.out.println(l.toString());
		System.out.println("****************************************************************************************");
		System.out.println(c.toString());
	}

}
