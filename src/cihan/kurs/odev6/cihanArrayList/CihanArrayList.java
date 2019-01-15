package cihan.kurs.odev6.cihanArrayList;

public class CihanArrayList<T> {
	
	private Integer size=0;
	private  Object[] dataArray= new Object[size];
		
	public CihanArrayList() {
		dataArray= new Object[size];
	}
	
	public void  setSize() {
		size++;
	}
	public Integer getSize() {
		return this.size;
	}
	
	public void add(T data) {
		setSize() ;
		Object[] tempArray= new Object[size];
		
		for(int i=0 ; i<size-1;i++) {
			tempArray[i]=dataArray[i];
		}
				
		dataArray = tempArray;
		dataArray[size-1]=data;
		
	}
	
	public void add(Integer indis,T data) {
		setSize() ;
		Object[] tempArray= new Object[size];
		
		for(int i=0 ; i<size-1;i++) {
			tempArray[i]=dataArray[i];
		}
		
		if(tempArray[indis]==null) {
			tempArray[indis]=data;
		}else {			
			for(int i=indis;i<size-1;i++) {
				tempArray[i+1]=dataArray[i];
			  }
			tempArray[indis]=data;
		}
		
		dataArray = tempArray;
			
	}
	
	
	public T get(Integer indis) {
		return (T) dataArray[indis];
	}
	
	public void remove(Integer indis) {
		Integer j=0;
		for(Integer i=0;i<size;i++) {
			if(i.equals(indis))
			{
				j--;
			}
			else {
				dataArray[j]=dataArray[i];
				
			}
			j++;
		}
		size--;
	}
	
	  	   
	public String toStringCihan() {
		String temp="[";
		for(int  i=0; i< size;i++) {
			if(i<size-1) temp = temp  + dataArray[i] +", ";
			if(i==size-1) temp = temp  + dataArray[i] ;
		}
		 temp=temp+"]";
		return temp;
	}
	
	public T[] arrayReverse() {
		T temp;
		for(int i=0;i<size/2;i++) {
			temp=(T)dataArray[i];
			dataArray[i]=dataArray[size-i-1];
			dataArray[size-i-1]=temp;
		}
		
		return (T[])dataArray;
	}
	
	public T[] arraySort() {
		
		T temp=(T)dataArray[0];
		
		for(int i=0;i<size;i++) {
			for(int j=i;j<size;j++) {
				if(dataArray[j].toString().compareTo(temp.toString())<0)
				{ 
					dataArray[i]=dataArray[j];
					dataArray[j]=temp;
				}
				temp=(T) dataArray[i];
			}
		}
		
		return (T[])dataArray;
	}
	


}
