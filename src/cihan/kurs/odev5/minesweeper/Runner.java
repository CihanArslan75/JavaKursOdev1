package cihan.kurs.odev5.minesweeper;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Runner {

	public static final int SIZE=10;
	public static final int BSIZE=SIZE*SIZE;
	public static final int BOMBCOUNT=2*SIZE;
	
	
	public static void main(String[] args) {
		MinesWeeper mw=new  MinesWeeper() ;
		mw.playMW();
	
	}
	
}
