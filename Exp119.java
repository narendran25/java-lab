class Exp119 implements Runnable{  
public void run(){  
System.out.println("thread is running...");  
}  
  
public static void main(String args[]){  
Exp119 m1=new Exp119();  
Thread t1 =new Thread(m1);  
t1.start();  
 }  
}  