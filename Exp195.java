import java.awt.*;  
	import javax.swing.*;  
	  
public class Exp195 extends Frame{
	
	
	 Button buttons[];  
	  
	 public Exp195  () {  
	   buttons = new Button [5];  
	    
	   for (int i = 0;i<5;i++) {  
	      buttons[i] = new Button ("Button " + (i + 1));  
	      add (buttons[i]);  
	    }  
	  
	setLayout (new BoxLayout (this, BoxLayout.Y_AXIS));  
	setSize(400,400);  
	setVisible(true);  
	}  
	  
	public static void main(String args[]){  
		Exp195  b=new Exp195 ();  
	}  
	
}
