package cihan.kurs.odev7.sort;

import java.util.Comparator;

public class Checker  implements Comparator<Student>{

	
	public int compare(Student o1, Student o2) {
		if(o1.getCgpa()==o2.getCgpa()) return o1.getFname().compareTo(o2.getFname());
		else if( o1.getFname().equals(o2.getFname()))  return o1.getId()- o2.getId();
		
		if (o1.getCgpa() < o2.getCgpa()) return 1;
        if (o1.getCgpa() > o2.getCgpa()) return -1;
        return 0;
		}

}
