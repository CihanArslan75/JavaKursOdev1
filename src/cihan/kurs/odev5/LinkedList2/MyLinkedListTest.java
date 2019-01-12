package cihan.kurs.odev5.LinkedList2;

public class MyLinkedListTest {
	Node head;
	Node tail;
	public void add(Node node) {
		if(head==null) {
			head=node;
			tail=node;
		}
		else {
			tail.nextNode=node;
			tail=node;
		}
	}
	
	public void print() {
		Node d = head ;
		while(d!=null) {
			System.out.println(d.data);
			d=d.nextNode;
		}
	}
}
