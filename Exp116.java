public class Exp116{  
 private int data=30;//instance variable  
 void display(){  
  class Local{  
   void msg(){System.out.println(data);}  
  }  
  Local l=new Local();  
  l.msg();  
 }  
 public static void main(String args[]){  
  Exp116 obj=new Exp116();  
  obj.display();  
 }  
}  