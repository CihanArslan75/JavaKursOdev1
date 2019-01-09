package cihan.kurs.odev5.minesweeper;


public class Runner {

	public static final int SIZE=10;
	public static final int BOMBCOUNT=2*SIZE;
	
	public static void main(String[] args) {
		MinesWeeper mw=new  MinesWeeper() ;
		mw.setGhostMv();
	}
	
}
