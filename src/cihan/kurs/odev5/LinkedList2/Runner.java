package cihan.kurs.odev5.LinkedList2;


public class Runner {
	public static void main(String[] args) {
		MyLinkedListTest linkedListTest= new MyLinkedListTest();
		linkedListTest.add(new Node(5));
		linkedListTest.add(new Node(32));
		linkedListTest.add(new Node(20));
		linkedListTest.add(new Node(20));
		linkedListTest.add(new Node(20));
		linkedListTest.add(new Node(20));
		linkedListTest.add(new Node(23));
		linkedListTest.print();
	}
}
