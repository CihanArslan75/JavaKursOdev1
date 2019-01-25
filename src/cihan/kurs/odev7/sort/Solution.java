package cihan.kurs.odev7.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int testCases =Integer.parseInt(in.nextLine());
				
		List<Student> studentList = new ArrayList<Student>();
		Checker c=new Checker();	
		
		while(testCases>0) {
			int id=in.nextInt();
			String fname=in.next();
			double cgpa=in.nextDouble();
			
			Student st= new Student(id,fname,cgpa);
			studentList.add(st);
			
			testCases--;
		}

		Collections.sort(studentList,c);
		
		for(Student st: studentList){
			System.out.println(st.getFname());
		}
		
		
	}


	

}
//
//5
//33 Rumpa 3,68
//85 Ashis 3,85
//56 Samiha 3,75
//19 Samara 3,75
//22 Fahim 3,76

//Ashis
//Fahim
//Samara
//Samiha
//Rumpa
