class Exp120 extends Thread{  
 public void run(){  
  for(int i=1;i<5;i++){  
    try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}  
    System.out.println(i);  
  }  
 }  
 public static void main(String args[]){  
  Exp120 t1=new Exp120();  
  Exp120 t2=new Exp120();  
   
  t1.start();  
  t2.start();  
 }  
}  