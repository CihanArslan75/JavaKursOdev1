package cihan.kurs.odev3.Override2;

public class MotorCycle extends BiCycle{
	String define_me() {
		return "a cycle with an engine";
	}
	
	MotorCycle() {
		System.out.println("Hello I am a motorcycle, I am "+ define_me());

		String temp=super.define_me(); //Fix this line

		System.out.println("My ancestor is a cycle who is "+ temp );
	}

}


//Hello I am a motorcycle, I am a cycle with an engine.
//My ancestor is a cycle who is a vehicle with pedals.