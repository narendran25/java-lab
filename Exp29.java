//Example of method overriding
	class Vehicle{  
	void run(){System.out.println("Vehicle is running");}  
	}  
	class Exp29 extends Vehicle{  
	void run(){System.out.println("Bike is running safely");}  
	  
	public static void main(String args[]){  
	Exp29 obj = new Exp29();  
	obj.run();  
	}  
}