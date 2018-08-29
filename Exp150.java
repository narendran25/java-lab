
	import java.io.CharArrayWriter;  

	import java.io.FileWriter;  
	
public class Exp150 {
	
	public  static void main(String args[])throws Exception{    
	          CharArrayWriter out=new CharArrayWriter();    
	          out.write("Sachin...Sachin...");    
	          FileWriter f1=new FileWriter("Exp150f1.txt");    
	          FileWriter f2=new FileWriter("Exp150f2.txt");    
	          FileWriter f3=new FileWriter("Exp150f3.txt");    
	          FileWriter f4=new FileWriter("Exp150f4.txt");    
	          out.writeTo(f1);    
	          out.writeTo(f2);    
	          out.writeTo(f3);    
	          out.writeTo(f4);    
	          f1.close();    
	          f2.close();    
	          f3.close();    
	          f4.close();    
	          System.out.println("Success...");    
	             
	        }   
}
