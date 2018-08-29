//	ByteArrayOutputStream Example
	//Let's see a simple example of java ByteArrayOutputStream class to write data into 2 files.
	import java.io.*;  

public class Exp143 {  
	 public static void main(String args[])throws Exception{  
	  FileOutputStream fout1=new FileOutputStream("F:\\Java man exp\\Exp142f1.txt");  
	  FileOutputStream fout2=new FileOutputStream("F:\\Java man exp\\Exp142f2.txt");  
	  
	  ByteArrayOutputStream bout=new ByteArrayOutputStream();  
	  bout.write(139);  
	  bout.writeTo(fout1);  
	  bout.writeTo(fout2);  
	  
	  bout.flush();  
	  bout.close();//has no effect  
	  System.out.println("success...");  
	 }  
	

}
