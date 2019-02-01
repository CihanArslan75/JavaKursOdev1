package cihan.kurs.odev8.CihanQueue;

public class CihanArrayDeque<E> implements CihanQueue<E> {
    public int size=0;
    public 
    Object[] dataArray=new Object[size]; 
    
	public CihanArrayDeque() {
		dataArray= new Object[size];
	}
	
	public void  setSize() {
		size++;
	}
	public Integer getSize() {
		return this.size;
	}
	

	@Override
	public boolean add(E e) {
		if (e==null)
			 throw new NullPointerException();
		
		setSize() ;
		Object[] tempArray= new Object[size];
		
		for(int i=0 ; i<size-1;i++) {
			tempArray[i]=dataArray[i];
		}
				
		dataArray = tempArray;
		dataArray[size-1]=e;
		return true;
	}
 
	@Override
	public boolean offer(E e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E remove() {
		E a=(E) dataArray[0];
		for(int i=0;i<size-1;i++) {
			dataArray[i]=dataArray[i+1];
		}
		size--;
		return (E) a;
	}
	

	@Override
	public E pool() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E element() {
		return (E) dataArray[0];
	}

	@Override
	public E peek() {
		return (E) dataArray[0];
	}
	@Override
	public String toStringCihan() {
		String temp="[";
		for(int  i=0; i< size;i++) {
			if(i<size-1) temp = temp  + dataArray[i] +", ";
			if(i==size-1) temp = temp  + dataArray[i] ;
		}
		 temp=temp+"]";
		return temp;
	}
	@Override
	public E get(Integer indis) {
		return (E) dataArray[indis];
	}
}
