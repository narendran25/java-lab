import java.io.FileWriter;  
	
public class Exp148 {
	    public static void main(String args[]){    
	         try{    
	           FileWriter fw=new FileWriter("F:\\Java man exp\\Exp148.txt");    
	           fw.write("File is written successfully");    
	           fw.close();    
	          }catch(Exception e){System.out.println(e);}    
	          System.out.println("Success...");    
	     }    
	  
}
