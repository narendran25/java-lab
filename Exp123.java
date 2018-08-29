class Exp123 extends Thread{  
 public void run(){  
  System.out.println(Thread.currentThread().getName());  
 }  
 public static void main(String args[]){  
  Exp123 t1=new Exp123();  
  Exp123 t2=new Exp123();  
  
  t1.start();  
  t2.start();  
 }  
}  