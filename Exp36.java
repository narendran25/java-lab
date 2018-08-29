//Java final method
	 class Honda{  
	  final void run1(){System.out.println("running");}  
	}  
	     
	public class Exp36 extends Honda{  
	   void run1(){System.out.println("running safely with 100kmph");}  
	     
	   public static void main(String args[]){  
	   Exp36 honda= new Exp36();  
	   honda.run1();  
	   }  
	}  
