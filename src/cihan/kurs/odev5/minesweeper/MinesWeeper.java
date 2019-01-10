package cihan.kurs.odev5.minesweeper;

import java.text.DecimalFormat;

import java.text.NumberFormat;
import java.util.Scanner;

public class MinesWeeper {
	
	public MinesWeeper() {
		mwDraw();
	}

	public static int[][] bombsArray = new int[Runner.SIZE][Runner.SIZE]; 
	
	static {
		 int[]   bombs =  new int[Runner.BOMBCOUNT];
		 int[]   ijBomb = new int[2];  
		 bombs = getMwBomb();
		 NumberFormat formatter = new DecimalFormat("000");
         

 /************ bombaları yerleştir **********************/
         for(int i=0;i<Runner.BOMBCOUNT;i++) {
		  	 ijBomb=findNumber(bombs[i]);
		   	 bombsArray[ijBomb[0]][ijBomb[1]]=Runner.BSIZE;
		}
         
	 
   /************ komşulardaki bombaları say ,toplamları komşulara yerleştir***********************************/
		 
         int bombSum=0;
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
							 bombSum++;
						 }
					  }
				 }
					 bombsArray[i][j]=bombSum;
					 bombSum=0;
			 }
		 }	
		
		 for(int i =0 ;i<Runner.SIZE ;i++)
		  { 
			  for(int j=0 ; j<Runner.SIZE ;j++)
			  {	
				  System.out.print(formatter.format(bombsArray[i][j])+" ");
			  }
			  System.out.println();
		  }
	 }
	 public static  int[] getMwBomb() {
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
				//System.out.print(bombArray[i]+" ");
			}
			//System.out.println();
			return sortBomb(bombArray);
		}

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
			
			//System.out.print(bombArray[i]+" ");
		}
		
		return bombArray; 
	}
	
/*********************************************************************/		
	public static int[] findNumber(int a) {
        //Statik array için Gelen sayıya 1. ve 2. idisini bulur /
	  int[] ij =new int[2];	
	  ij[0]=a/Runner.SIZE;
	  ij[1]=a%Runner.SIZE;
	  return ij;
	}
/*********************************************************************/	
//	public  int[] findNumberArray(int a) {
//		// Gelen sayıya 1. ve 2. idisini bulur /
//		  int[] ij =new int[2];	
//		  ij[0]=a/Runner.SIZE;
//		  ij[1]=a%Runner.SIZE;
//		  return ij;
//		}
/*********************************************************************/	
	public  void mwDraw() {
		String[][] mtArray=new String[Runner.SIZE][Runner.SIZE]; 
		NumberFormat formatter = new DecimalFormat("000");
		int numberMW=0;
		for(int i=0;i<Runner.SIZE;i++) {
			for(int j =0;j<Runner.SIZE;j++) {
				mtArray[i][j]="S"+formatter.format(numberMW);
				System.out.print(mtArray[i][j]+"  ");
				numberMW++;
			}
			System.out.println();
		}
			
	}

/*************************************************************/	
	
	public  void  playMW() {
		
		Scanner sc=new Scanner(System.in);
		NumberFormat formatter = new DecimalFormat("000");
		int[]   ijBomb = new int[2];  		
		boolean playEnd=true;
	
//     	 for(int i =0 ;i<Runner.SIZE ;i++)
//		  { 
//			  for(int j=0 ; j<Runner.SIZE ;j++)
//			  {	
//				  System.out.print(formatter.format(bombsArray[i][j])+" ");
//			  }
//			  System.out.println();
//		  }
		do{
			 System.out.println("Seçiminizi Giriniz !!");
			 String a = sc.next();
		  	 ijBomb=findNumber(Integer.parseInt((a.substring(1,4))) );
		  	 System.out.println("AAA:"+bombsArray[ijBomb[0]][ijBomb[1]]);
		   	 
		  	 if(bombsArray[ijBomb[0]][ijBomb[1]]==Runner.BSIZE) {
		   		 System.out.println("Yandınız");
		   		 playEnd=false;
		   		  }
		   	 else
		   	 {
		   		 System.out.println("Seçime Devam Ediniz");
		   	 }
		}while(playEnd);
     	
//     	if(bombsArray[1][2]==Integer.parseInt(a.substring(1,3))) {
//     		
//     	}
		
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
