//Java Runtime Polymorphism
	class Test3{  
	int getRateOfInterest(){return 0;}  
	}  
	  
	class SBI extends Test3{  
	int getRateOfInterest(){return 8;}  
	}  
	  
	class ICICI extends Test3{  
	int getRateOfInterest(){return 7;}  
	}  
	class AXIS extends Test3{  
	int getRateOfInterest(){return 9;}  
	}  
	  
	class Exp39{  
	public static void main(String args[]){  
        Test3 b1=new SBI();  
	Test3 b2=new ICICI();  
	Test3 b3=new AXIS();  
	System.out.println("SBI Rate of Interest: "+b1.getRateOfInterest());  
	System.out.println("ICICI Rate of Interest: "+b2.getRateOfInterest());  
	System.out.println("AXIS Rate of Interest: "+b3.getRateOfInterest());  
	}  
	}  
