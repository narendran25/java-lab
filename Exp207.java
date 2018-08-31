import java.applet.Applet;  
import java.awt.Graphics;  
public  class Exp207 extends Applet {

	
	  
	public void paint(Graphics g){  
	String str=getParameter("msg");  
	g.drawString(str,50, 50);  
	}  
	public static void main(String args[]) {
		
	}
	  
	}  

