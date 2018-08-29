interface Printable{  
void print();  
}  
interface Showable{  
void print();  
}  
  
class Exp48 implements Printable, Showable{  
public void print(){System.out.println("Hello");}  
public static void main(String args[]){  
Exp48 obj = new Exp48();  
obj.print();  
 }  
}  