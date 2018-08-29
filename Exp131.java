public class Exp131{  
 public void finalize(){System.out.println("object is garbage collected");}  
 public static void main(String args[]){  
  Exp131 s1=new Exp131();  
  Exp131 s2=new Exp131();  
  s1=null;  
  s2=null;  
  System.gc();  
 }  
}  