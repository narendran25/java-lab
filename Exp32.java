//super is used to invoke parent class constructor.
	class Bike5{  
	  Bike5(){System.out.println("Vehicle is created");}  
	}  
	  
	class Exp32 extends Bike5{  
	  Exp32(){  
	   super();//will invoke parent class constructor  
	   System.out.println("Bike is created");  
	  }  
	  public static void main(String args[]){  
	   Exp32 b=new Exp32();  
	        
	}  
	}  
