package cihan.kurs.odev8.CihanQueue;

import java.util.Queue;

public interface  CihanQueue<E>  {

	public boolean add(E e) ;
	public boolean offer(E e);
	public E remove();
	public E pool();
	public E element();
	public E peek();
	public String toStringCihan() ;
	public E get(Integer indis) ;
	
}	
	
//	  boolean add(E e); // @return {@code true} if the element was added to this queue, else {@code false}
//	  boolean offer(E e);//@return the head of this queue
//	  E remove(); // *Retrieves and removes the head of this queue,
//	  E poll(); //Retrieves, but does not remove, the head of this queue.  This method
//	  			//* differs from {@link #peek peek} only in that it throws an exception
//	            //* if this queue is empty.
//	  E element();
//	  E peek();
	  


