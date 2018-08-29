import java.net.*;  

	import java.io.*; 
	
public class chatclie {
	 public static void filer(String str1,String str3) {
		 BufferedWriter bw = null;
		 try {
	         // APPEND MODE SET HERE
	         bw = new BufferedWriter(new FileWriter("F://New Text Document.xls", true));
		 bw.write(str1+"\t"+str3);
		 bw.newLine();
		 bw.flush();
	      } catch (IOException ioe) {
		 ioe.printStackTrace();
	      } finally {                       // always close the file
		 if (bw != null) try {
		    bw.close();
		 } catch (IOException ioe2) {
		    // just ignore it
		 }
	      } // end try/catch/finally

	 }
	  
	public static void main(String args[])throws Exception{  
			Socket s=new Socket("localhost",3333);  
			DataInputStream din=new DataInputStream(s.getInputStream());  
			DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
			  
			String str="",str2="";  
			while(!str.equals("stop")){  
		str=br.readLine();  
			dout.writeUTF(str);  
			dout.flush();  
			str2=din.readUTF();  
			System.out.println("Server says: "+str2);  
			filer(str,str2);
			}  
			  
			dout.close();  
		s.close();  
			}
 
}
