package cihan.kurs.odev8.finally_NO;

import java.io.DataInputStream;

public class Runner {
	
//	The only times finally won't be called are:
//
//	If you invoke System.exit();
//	If the JVM crashes first;
//	If the JVM reaches an infinite loop (or some other non-interruptable, non-terminating statement) in the try or catch block;
//	If the OS forcibly terminates the JVM process; e.g. "kill -9 " on UNIX.
//	If the host system dies; e.g. power failure, hardware error, OS panic, etcetera.
//	If finally block is going to be executed by daemon thread and all other non daemon threads exit before finally is called.
//	If the JVM exits while the try or catch code is being executed, then the finally block may not execute. Likewise, if the thread executing the try or catch code is interrupted or killed, the finally block may not execute even though the application as a whole continues.

	
	//finally will not execute in below cases:

//case 1 :
//When you are executing System.exit().
//case 2 :
//When your JVM / Thread crashes.
//case 3 :
//When your execution is stopped in between manually.

	public static String  hesapla(int sayi1,int sayi2) throws Exception{
		try {  
		    int a=sayi2/sayi1;
		    System.out.println("1");
		    return "SUCCESS";  
		}  
		catch (Exception e) {  
			//e.printStackTrace();
			System.out.println("2");
			System.exit(0);
		    return "dddddddddddddddd";  
		}  
		finally {  
			System.out.println("3");
		    System.out.println("i don't know if this will get printed out.");
		}
	}

	public static int getMonthsInYear() { //In addition to the other responses, it is important to point out that 'finally' has the right to override any exception/returned value by the try..catch block. For example, the following code returns 12:
	    try {
	    	System.out.println("1");
	        return 10;
	    }
	    finally {
	    	System.out.println("2");
	        return 12;
	    }
	}
	
	public static int getMonthsInYear1() {  // the following method does not throw an exception:
	    try {
	        throw new RuntimeException();
	    }
	    finally {
	        return 12;
	    }
	}
	
	public static int getMonthsInYear2() { //While the following method does throw it:
	    try {
	        return 12;          
	    }
	    finally {
	        throw new RuntimeException();
	    }
	}
	
	public static int test() {
	    int i = 0;
	    try {
	        i = 2;
	        return i;
	    } finally {
	        i = 12;
	        System.out.println("finally trumps return.");
	    }
	}
	
	public static int test1() {
	    int i = 0;
	    try {
	        return i;
	    } finally {
	        i = 12;
	        System.out.println("finally trumps return.");
	        return i;
	    }
	}
	
	public static void main(String[] args) throws Exception {
//		System.out.println(getMonthsInYear());
//		System.out.println(getMonthsInYear1());
//		System.out.println(getMonthsInYear2());
//		  System.out.println(test());
//		System.out.println("111");
//		System.out.println(hesapla(0,3));
//		System.out.println("22222");
		  System.out.println(test1());
//		  DataInputStream c = new DataInputStream(System.in);
//	        try{
//	            int i=Integer.parseInt(c.readLine());
//	        }catch(ArithmeticException e){
//	        }catch(Exception e){
//	           System.exit(0);//Program terminates before executing finally block
//	        }finally{
//	            System.out.println("Won't be executed");
//	            System.out.println("No error");
//	        }
//	    
	}

}
