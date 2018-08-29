class Exp117{  
  static int data=30;  
  static class Inner{  
   void msg(){System.out.println("data is "+data);}  
  }  
  public static void main(String args[]){  
  Exp117.Inner obj=new Exp117.Inner();  
  obj.msg();  
  }  
}  