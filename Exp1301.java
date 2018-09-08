
public class Exp1301 implements Runnable{

		public void run(){  
		System.out.println("task one");  
		}  
		  
		public static void main(String args[]){  
		Thread t1 =new Thread(new Exp1301());//passing annonymous object of TestMultitasking2 class  
		Thread t2 =new Thread(new Exp1301());  
		  
		t1.start();  
		t2.start();  
		  
		 }  
  

}
