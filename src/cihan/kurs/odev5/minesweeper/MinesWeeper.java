package cihan.kurs.odev5.minesweeper;

import java.text.DecimalFormat;

import java.text.NumberFormat;
import java.util.Scanner;

public class MinesWeeper {
	
	public MinesWeeper() {
		
	}

/******************************************************/	
	public  void mwDraw(String[][] bSightArray) {
	
		for(int i=0;i<Runner.SIZE;i++) {
			for(int j =0;j<Runner.SIZE;j++) {
				System.out.printf("%5s",bSightArray[i][j]+" ");
			}
			System.out.println();
		}
		
	}

/*************************************************************/	
	
	public  void  playMW() {
		Scanner sc=new Scanner(System.in);
		int[]   ijBomb = new int[2]; 
		int row;
		int column;
		boolean playEnd=true;
		String selectFirst;
	  
		BombsArray b=new BombsArray();
		b.setBombsArray();
		int[][] bArray =b.getBombsArray();

		b.setSightBombsArray();
		String[][] bSightArray =b.getSightBombsArray();
		
		mwDraw(bSightArray);
				
		do{
			 System.out.println("Seçiminizi S ile Bombaları B ile Giriniz.Çıkmak için X tuşuna Basınız. !!");
			 String select = sc.next();
			 selectFirst=select.substring(0,1).toUpperCase( );
			 
			 if(select.equals("x") || select.equals("X")) 
			 {  
				System.out.println("Oyundan Çıktınız ! ");
				playEnd=false;	
			    break;
				 
			  }
			 
			 int selectInt=Integer.parseInt((select.substring(1,4)));
			 if(selectInt>=Runner.BSIZE) 
			 {
				 System.out.println("Seçiminiz Yanlış!");
				 continue;
			 }
			 
			 
		  	 ijBomb=Runner.findNumber(selectInt);
		  	 row=ijBomb[0];
			 column=ijBomb[1];
			 
		  	 b.setSightBombsArray(selectFirst,row,column);	
		  		  
		  			  	 
		  	 if(bArray[row][column]==Runner.BSIZE  &&  selectFirst.equals("S") ) 
		  	 {
		   		 System.out.println("Yandınız");
		   		 playEnd=false;
		   	 }
		   	 else
		   	 {   
		   		 mwDraw(bSightArray);
		   	 }
		}while(playEnd);
     	
		
	}
	
	/**************************************************************/
	public  void mwOpenBox(String box) {
		
		String[][] mtArray=new String[Runner.SIZE][Runner.SIZE]; 
		NumberFormat formatter = new DecimalFormat("000");
		
		int numberMW=0;
		//int boxValue= ;
		for(int i=0;i<Runner.SIZE;i++) {
			for(int j =0;j<Runner.SIZE;j++) {
				mtArray[i][j]="S"+formatter.format(numberMW);
				System.out.print(mtArray[i][j]+"  ");
				numberMW++;
			}
			System.out.println();
		}
			
	}
/*********************************************************************/	

}
