	import java.io.*;  

public class Exp161 extends Serializable{
	int id;
	 String name;
	 public Exp161(int id, String name) {
	  this.id = id;
	  this.name = name;
	 }

	 public static void main(String args[])throws Exception{  
	    
	  ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));  
	  Exp161 s=(Exp161)in.readObject();  
	  System.out.println(s.id+" "+s.name);  
	  
	  in.close();  
	 }  
  
}
