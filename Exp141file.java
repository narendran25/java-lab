//Java FileOutputStream class
import java.io.*; 

import java.io.FileOutputStream;  
public class Exp141file { 
	  

	    public static void main(String args[]){    
	           try{    
	             FileOutputStream fout=new FileOutputStream("F:\\Java man exp\\Exp141.txt");    
	             String s="Message is....";    
	             byte b[]=s.getBytes();//converting string into byte array    
	             fout.write(b);    
	             fout.close();    
	             System.out.println("success...");    
	            }catch(Exception e){System.out.println(e);}    
	      }    
  


}
