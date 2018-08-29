class Exp118 extends Thread{  
public void run(){  
System.out.println("thread is running...");  
}  
public static void main(String args[]){  
Exp118 t1=new Exp118();  
t1.start();  
 }  
} 