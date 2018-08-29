class Exp95{  
 int rollno;  
 String name;  
 String city;  
  
 Exp95(int rollno, String name, String city){  
 this.rollno=rollno;  
 this.name=name;  
 this.city=city;  
 }  
  
 public static void main(String args[]){  
   Exp95 s1=new Exp95(101,"Raj","lucknow");  
   Exp95 s2=new Exp95(102,"Vijay","ghaziabad");  
     
   System.out.println(s1);//compiler writes here s1.toString()  
   System.out.println(s2);//compiler writes here s2.toString()  
 }  
}  