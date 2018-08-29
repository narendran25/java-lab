import java.io.*;    
	
public class Exp145 {
	  public static void main(String args[])throws Exception{    
	   FileInputStream fin1=new FileInputStream("F:\\Java man exp\\Exp144f1.txt.txt");    
	   FileInputStream fin2=new FileInputStream("F:\\Java man exp\\Exp144f2.txt.txt");    
	   FileOutputStream fout=new FileOutputStream("F:\\\\Java man exp\\\\Exp145.txt");      
	   SequenceInputStream sis=new SequenceInputStream(fin1,fin2);    
	   int i;    
	   while((i=sis.read())!=-1)    
	   {    
	     fout.write(i);        
	   }    
	   sis.close();    
	   fout.close();      
	   fin1.close();      
	   fin2.close();       
	   System.out.println("Success..");  
	  }    
	    
}
