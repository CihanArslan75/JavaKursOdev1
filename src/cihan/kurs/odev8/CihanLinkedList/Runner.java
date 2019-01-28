package cihan.kurs.odev8.CihanLinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Runner {
	public static void main(String[] args) {
		CihanLinkedList cl=new CihanLinkedList();
		LinkedList l=new LinkedList();
		cl.add(0);
		cl.add(1);
		cl.add(2);
		cl.add(3);
		cl.add(4);
		cl.add(5);
		cl.add(6);
		cl.remove(6);
		cl.add(7);
		System.out.println(cl.get(0));
		System.out.println(cl.get(1));
		System.out.println(cl.get(2));
		System.out.println(cl.get(3));
		System.out.println(cl.get(4));
		System.out.println(cl.get(5));
		System.out.println(cl.get(6));
	
			
		System.out.println("************************************");
		l.add(0);
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		l.add(6);
		l.remove(6);
		l.add(7);
		System.out.println(l.get(0));
		System.out.println(l.get(1));
		System.out.println(l.get(2));
		System.out.println(l.get(3));
		System.out.println(l.get(4));
		System.out.println(l.get(5));
		System.out.println(l.get(6));
	}
	

}
