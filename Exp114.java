class Exp114{  
 private int data=30;  
 class Inner{  
  void msg(){System.out.println("data is "+data);}  
 }  
 public static void main(String args[]){  
  Exp114 obj=new Exp114();  
  Exp114.Inner in=obj.new Inner();  
  in.msg();  
 }  
}  