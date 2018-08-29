class Exp122 extends Thread{  
  public void run(){  
   System.out.println("running...");  
  }  
 public static void main(String args[]){  
  Exp122 t1=new Exp122();  
  Exp122 t2=new Exp122();  
  System.out.println("Name of t1:"+t1.getName());  
  System.out.println("Name of t2:"+t2.getName());  
   
  t1.start();  
  t2.start();  
  
  t1.setName("Devaganesh");  
  System.out.println("After changing name of t1:"+t1.getName());  
 }  
}  