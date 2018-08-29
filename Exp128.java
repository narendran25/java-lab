class Exp128 extends Thread{  
 public void run(){  
   System.out.println("task one");  
 }  
 public static void main(String args[]){  
  Exp128 t1=new Exp128();  
  Exp128 t2=new Exp128();  
  Exp128 t3=new Exp128();  
  
  t1.start();  
  t2.start();  
  t3.start();  
 }  
}  