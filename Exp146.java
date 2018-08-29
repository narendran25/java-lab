import java.io.*;  
	
public class Exp146 {
	public static void main(String args[])throws Exception{    
	     FileOutputStream fout=new FileOutputStream("F:\\Java man exp\\Exp146.txt");    
	     BufferedOutputStream bout=new BufferedOutputStream(fout);    
	     String s="Sachin... Sachin...";    
	     byte b[]=s.getBytes();    
	     bout.write(b);    
	     bout.flush();    
	     bout.close();    
	     fout.close();    
	     System.out.println("success");    
	}    
	  
}
