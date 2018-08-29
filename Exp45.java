abstract class Bike{  
  abstract void run();  
}  
class Exp45 extends Bike{  
void run(){System.out.println("running safely..");}  
public static void main(String args[]){  
 Bike obj = new Exp45();  
 obj.run();  
}  
}  