class Exp121 extends Thread{  
 public void run(){  
  for(int i=1;i<=5;i++){  
   try{  
    Thread.sleep(500);  
   }catch(Exception e){System.out.println(e);}  
  System.out.println(i);  
  }  
 }  
public static void main(String args[]){  
 Exp121 t1=new Exp121();  
 Exp121 t2=new Exp121();  
 Exp121 t3=new Exp121();  
 t1.start();  
 try{  
  t1.join();  
 }catch(Exception e){System.out.println(e);}  
  
 t2.start();  
 t3.start();  
 }  
}  