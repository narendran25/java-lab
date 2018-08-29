//Problem without super keyword
	class Bike1{  
	  int speed=50;  
	}  
	class Exp30 extends Bike1{  
	  int speed=100;  
	  void display(){  
   System.out.println(speed);//will print speed of Bike   
	  }  
	  public static void main(String args[]){  
	   Exp30 b=new Exp30();  
	   b.display();  
	}  
	}  
