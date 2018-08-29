import java.io.*;
public class append {

	   public static void main (String[] args) {

	      append a = new append();
	      a.appendToCheckbook();

	   } // end main

	   public void appendToCheckbook () {

	      BufferedWriter bw = null;

	      try {
	         // APPEND MODE SET HERE
	         bw = new BufferedWriter(new FileWriter("F://New Text Document.xls", true));
		 bw.write("400:08311998:Inprise Corporation:249.95\t");
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

	   } // end test()

	
}

