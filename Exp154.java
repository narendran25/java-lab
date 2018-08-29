//	PrintStream class:
//		In this example, we are simply printing integer and string values.
	import java.io.*;  

public class Exp154 {
	 
	 public static void main(String args[])throws Exception{  
	  
	   FileOutputStream fout=new FileOutputStream("F://Java man exp//mfile.txt");  
	   PrintStream pout=new PrintStream(fout);  
	   pout.println(1900);  
	   pout.println("Hello Java");  
	   pout.println("Welcome to Java");  
	   pout.close();  
	   fout.close();  
	   System.out.println("sucess");
      
	  

}
}
