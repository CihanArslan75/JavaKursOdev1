package cihan.kurs.odev8.CihanQueue;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

public class Runner {


	public static void main(String[] args) {
	CihanQueue<String> c= new CihanArrayDeque<String>();	
	c.add("Merve");
	c.add("Damla");
	c.add("Aykut");
	c.add("Fırat");
	c.add("Ceyda");  
	c.add("Görkem");
	c.add("Tuğçe");
	System.out.println(c.peek()); 
	System.out.println("*********************************");
	System.out.println(c.element());
	System.out.println("*********************************");
	System.out.println(c.toStringCihan());
	System.out.println(c.remove());
	System.out.println(c.toStringCihan());
	System.out.println("*********************************");
	System.out.println(c.peek());
	System.out.println("*********************************");
	System.out.println(c.element());
	System.out.println("*********************************");
	
//	Queue<String> kuyruk = new ArrayDeque<String>();
//		kuyruk.offer("Merve");
//		kuyruk.offer("Damla");
//		kuyruk.offer("Aykut");
//		kuyruk.offer("Fırat");
//		kuyruk.offer("Ceyda");
//		kuyruk.offer("Görkem");
//		kuyruk.offer("Tuğçe");
//		System.out.println(kuyruk);
//		
//		Iterator it= kuyruk.iterator();	
//		System.out.println(kuyruk.size());
//		
//		while(it.hasNext()) {
//			
//			String iv=(String) it.next();
//			System.out.println(iv);
//			
//		}
//		System.out.println(kuyruk.peek());
//		System.out.println(kuyruk.poll());
//		System.out.println(kuyruk.size());
//		System.out.println(kuyruk.remove());
//	
	}

}
