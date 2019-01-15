package cihan.kurs.odev6.reflection2;

public class Reflection {
	
	public final static int NO=1;
	private String name;
	private int age;
	
	public Reflection() {
		this("John",30);
	}
	
	public Reflection(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public static  void printNo() {
		System.out.println("No :" +NO);
	}
	public String toString() {
		return name +","+age;
	}
	public void incrementAge() {
		++age;
	}
	

}
