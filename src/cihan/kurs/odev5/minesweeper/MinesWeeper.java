package cihan.kurs.odev5.minesweeper;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class MinesWeeper {

	public MinesWeeper() {
		mwDraw();
	}
/*********************************************************************/	
	public int[] mwDraw() {
		String[][] mtArray=new String[Runner.SIZE][Runner.SIZE]; 
		NumberFormat formatter = new DecimalFormat("000");
		int numberMW=0;
		int[] numberMWArray=new int[Runner.SIZE*Runner.SIZE];
		for(int i=0;i<Runner.SIZE;i++) {
			for(int j =0;j<Runner.SIZE;j++) {
				mtArray[i][j]="S"+formatter.format(numberMW);
				System.out.print(mtArray[i][j]+"  ");
				numberMWArray[numberMW]=numberMW;
				numberMW++;
			}
		}
			
		System.out.println("Seçiminizi Giriniz !!");
		return numberMWArray;
	}
	
/*********************************************************************/		
	public int[] getMwBomb() {
		int bomb;
		int bombCount=2*Runner.SIZE;
		int[]  bombArray = new  int[bombCount];
		for(int i =0 ;i<bombCount ;i++)
		{
			bomb= getRandomNumber();
			for(int ii =0 ;ii<bombCount ;ii++)
			{
				while(bomb==bombArray[ii]) {
					bomb= getRandomNumber();
				}
				
			}
			bombArray[i]=bomb;
			System.out.print(bombArray[i]+" ");
		}
		System.out.println();
		return sortBomb(bombArray);
	}
/*********************************************************************/		
	public int[][] setGhostMv() {
		 int[][] bombsArray= new int[Runner.SIZE][Runner.SIZE]; 
		 int[] bombs = getMwBomb();
		 int[] numberGMW = new int[Runner.SIZE*Runner.SIZE];
		 int number=0;
         int bombnumber=0;
         NumberFormat formatter = new DecimalFormat("000");        
		 System.out.println();
		/************ bombaları yerleştir **********************/
		 while(bombnumber<Runner.BOMBCOUNT) {
		  for(int i =0 ;i<Runner.SIZE ;i++)
		  { 
			  for(int j=0 ; j<Runner.SIZE ;j++)
			  {	
				 if(bombs[bombnumber]==number) 
				 {	 
					 bombsArray[i][j]=Runner.SIZE*Runner.SIZE;
					
					 number++;
					 break;
				 } 
				 number++;
			 }
			}
		
		    bombnumber++;
		    number=0;
		 }
		 
		 for(int i =0 ;i<Runner.SIZE ;i++)
		  { 
			  for(int j=0 ; j<Runner.SIZE ;j++)
			  {	
				  System.out.print(formatter.format(bombsArray[i][j])+" ");
			  }
			  System.out.println();
		  }
		 System.out.println();
   /************ bomba say ***********************************/
		 int toplam=0;
         int iFirst;
         int jFirst;
         int iLast;
         int jLast;
		 for(int i=0;i<Runner.SIZE;i++) {
			 for(int j=0;j<Runner.SIZE;j++) {
				
				 if(bombsArray[i][j]==Runner.SIZE*Runner.SIZE)
				 {
					continue;
				 }
				 if(i==0) iFirst=i; else iFirst=i-1;
				 if(j==0) jFirst=j; else jFirst=j-1;
				 
				 if(i==Runner.SIZE-1) iLast=i; else iLast=i+1;
				 if(j==Runner.SIZE-1) jLast=j; else jLast=j+1;
				 
				 for(int ii=iFirst;ii<=iLast;ii++) {
					 for(int jj=jFirst;jj<=jLast;jj++) {
						 
						 if(bombsArray[ii][jj]==Runner.SIZE*Runner.SIZE) 
						 {
							toplam++;
						 }
					  }
				 }
//				 if(bombsArray[i][j]!=Runner.SIZE*Runner.SIZE) 
//				 {
					 bombsArray[i][j]=toplam;
//				 }
				 toplam=0;
			 }
		 }	
		 		
	
   /************ arrayi göster ***********************************/
		 for(int i =0 ;i<Runner.SIZE ;i++)
		  { 
			  for(int j=0 ; j<Runner.SIZE ;j++)
			  {	
				  System.out.print(formatter.format(bombsArray[i][j])+" ");
			  }
			  System.out.println();
		  }
		 return bombsArray;
		
	}
	
/*********************************************************************/		
	
 	

/*********************************************************************/		
	public static int getRandomNumber(){
	    int x =(int)(Math.random() *((Runner.SIZE*Runner.SIZE)-1)+1);
	    return x;
	}
/*********************************************************************/		
	public static int[] sortBomb(int[] bombArray ) {
		int temp;
		int bombArrayNumber=bombArray[0];
		
		for(int i=0 ; i<Runner.BOMBCOUNT;i++) {
			for(int j=i;j<Runner.BOMBCOUNT;j++) {
				if(bombArray[j]<bombArrayNumber) 
				{
					temp=bombArrayNumber;
					bombArray[i]=bombArray[j];
					bombArray[j]=temp;
				}
				bombArrayNumber=bombArray[i];
			 }
			
			System.out.print(bombArray[i]+" ");
		}
		
		return bombArray; 
	}

}
