package cihan.kurs.odevStringReverse;

import java.util.Scanner;

public class StringReverse {

	private Scanner scanner = new Scanner(System.in);
	public StringReverse() {
		//doReverse();
		doReverseYari();
	}
	
	private void doReverse() {
	    
		System.out.println("Kelime Giriniz: ");
		String a=scanner.nextLine();
		int n =a.length();
		String[] aa= new String[n];
		String aReverse = "";
		String sonuc;
		
		for(int i=0 ; i<n; i++) {
			aa[i]=a.substring(i,i+1);
		}
		for(int i=n-1 ; i>=0;i--) {
			aReverse =aReverse+aa[i] ;
		}
		
		
		if(a.equals(aReverse)) 
			 System.out.println("Yes");
		else 
			 System.out.println("No");
		scanner.close();
	}

	private void doReverseYari() {
	    
		System.out.println("Kelime Giriniz: ");
	    String s= scanner.nextLine()	;
		int n =s.length();
		int yari = (n/2) ;
		String sYari;
		String sTersYari="";
	    String[] ss = new String[n];
	    
	    sYari=s.substring(0,yari);
	    
	  //  System.out.println("yari : " + yari);
	    for(int i =0 ; i<n ; i++) {
	    	ss[i] = s.substring(i,i+1);
	    }
	    
	    if(n % 2 == 0 ) yari = yari - 1;

	    for(int i =n-1 ; i>yari ; i--) {
	    	//System.out.println("i : "+ i);
	    	//System.out.println("ss:" + ss[i]);
	    	sTersYari = sTersYari + ss[i];
	    }
	    
	    //System.out.println("syari : " +sYari );
	    //System.out.println("sTersYari : " +sTersYari );
		if(sYari.equals(sTersYari)) 
			 System.out.println("Yes");
		else 
			 System.out.println("No");
		scanner.close();
	}
	
}
