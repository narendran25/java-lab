class Exp129 implements Runnable{  
public void run(){  
System.out.println("task one");  
}  
  
public static void main(String args[]){  
Thread t1 =new Thread(new Exp129());//passing annonymous object of Exp129 class  
Thread t2 =new Thread(new Exp129());  
  
t1.start();  
t2.start();  
  
 }  
}  