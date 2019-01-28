package cihan.kurs.odev8.CihanLinkedList;

public class CihanLinkedList<E> {
	private int size;
    private Node<E> first;
    private Node<E> last;
    

    
    
    /*public void add (E e) {
    	if(first==null) addFirst ( e);
    	else  add1( e);
    }
    
    
    public void addFirst (E e) {
    	 final Node<E> f = first;
         final Node<E> newNode = new Node<>(null, e, f);
         first = newNode;
         if (f == null)
             last = newNode;
         else
             f.prevNode = newNode;
       	size++;
    }
    
    
    public void add1(E e) {
       	 final Node<E> l = last;
         final Node<E> newNode = new Node<>(l, e, null);
         last = newNode;
         if (l == null)
             first = newNode;
         else
             l.nextNode = newNode;
    	size++;
    	 
    }

    public void remove(int index) {
    	checkElementIndex(index);
    	if(index==size-1) {
    		last=last.prevNode;
    	}
    	else  
    	if(index==0) {
    		first=first.nextNode;
    	}
    	else
    	{ 
    		Node x=first;
    		for(int i=0;i<size-1;i++) {
    		  if(i<index) {
    			x.data=x.data;
    			}
    		  else if(i==index)
    		  { 
    			  x.data=x.nextNode.data; 
    		  }
    		  else
    		  {     
    			 x.data=x.nextNode.data;
    			 
    		  }
    		  x=x.nextNode;
    	 } 	
    		
    	 }
	    
    	size--;
    }
    
        
    public E get(int index) {
    	checkElementIndex(index);
      	return node(index).data;
    	
    }
    
    Node<E> node(int index) {
    	Node<E> x=first;
    	for(int i=0;i<index;i++) {
    		x=x.nextNode;
    	}
		return x;
    }
    
    private void checkElementIndex(int index) {
    	if(!isElementIndex(index) )
    		throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
    }
    private boolean isElementIndex(int index) {
    	return index>=0 && index<size;
    }
    private String outOfBoundsMsg(int index) {
    	return "Index : " +index + " , Size : "+size ;
    }
  */  
    
}
