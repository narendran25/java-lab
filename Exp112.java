class Exp112{  
  void m(){  
    int data=50/0;  
  }  
  void n(){  
    m();  
  }  
  void p(){  
   try{  
    n();  
   }catch(Exception e){System.out.println("exception handled");}  
  }  
  public static void main(String args[]){  
   Exp112 obj=new Exp112();  
   obj.p();  
   System.out.println("normal flow...");  
  }  
}  