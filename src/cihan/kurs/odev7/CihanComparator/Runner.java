package cihan.kurs.odev7.CihanComparator;

public class Runner {
	
	public static void main(String[] args) {
		CihanComparator[] temp1= {  new Insan("Cihan Arslan",44,1.55),
				        			new Insan("Atilla Arslan",50,1.75),
				        			new Insan("Edanur Arslan",16,1.65),
				        			new Insan("Eda Arslan",16,1.66),
				        			new Insan("Nur Arslan",16,1.64),
				        			new Insan("Bilge Arslan",12,1.50)};
		for(CihanComparator cc:temp1) {
			cc.toStringCihan();
		}
		
		System.out.println("---------------------------------------");
		
		sirala(temp1);
		for(CihanComparator cc:temp1) {
			cc.toStringCihan();
		}
		
	}
	
   public static void sirala(CihanComparator[] temp) {
		CihanComparator araDeger;
		for(int i=0;i<temp.length;i++) 
		{
			for(int j=i;j<temp.length;j++) 
			{
				if(temp[i].compareCihan(temp[i],temp[j])==-1) 
				{
					araDeger=temp[i];
					temp[i]=temp[j];
					temp[j]=araDeger;
				}
								
			}
		}
		
		
		
	
	}


	
			
}


