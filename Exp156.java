//Compressing file using DeflaterOutputStream class
	//In this example, we are reading data of a file and compressing it into another file using DeflaterOutputStream class. You can compress any file, here we are compressing the Deflater.java file
	import java.io.*;  
	import java.util.zip.*;  
	
public class Exp156 {
	  
	public static void main(String args[]){  
		  
	try{  
	FileInputStream fin=new FileInputStream("F:\\Java man exp\\Exp155.java");  
		  
		FileOutputStream fout=new FileOutputStream("def.txt");  
		DeflaterOutputStream out=new DeflaterOutputStream(fout);  
		  
		int i;  
		while((i=fin.read())!=-1){  
		out.write((byte)i);  
		out.flush();  
		}  
		  
		fin.close();  
		out.close();  
		  
		}catch(Exception e){System.out.println(e);}  
		System.out.println("rest of the code");  
		}  
	 

}
