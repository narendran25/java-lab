	//SequenceInputStream class
//	In this example, we are printing the data of two files f1.txt and f2.txt.

	import java.io.*;  
public class Exp144 {
	
	 public static void main(String args[])throws Exception{    
		   FileInputStream input1=new FileInputStream("F:\\Java man exp\\Exp144f1.txt.txt");    
		   FileInputStream input2=new FileInputStream("F:\\Java man exp\\Exp144f2.txt.txt");    
		   SequenceInputStream inst=new SequenceInputStream(input1, input2);    
		   int j;    
		   while((j=inst.read())!=-1){    
		    System.out.print((char)j);    
		   }    
		   inst.close();    
		   input1.close();    
		   input2.close();    
		  }    
	  

}
