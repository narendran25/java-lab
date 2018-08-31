	import java.awt.*;  
	import javax.swing.*;  
	  
public class Exp196 extends Frame {

	  
	 Button buttons[];  
	  
	 public Exp196() {  
	   buttons = new Button [5];  
	    
	   for (int i = 0;i<5;i++) {  
	      buttons[i] = new Button ("Button " + (i + 1));  
	      add (buttons[i]);  
	    }  
	  
	setLayout (new BoxLayout(this, BoxLayout.X_AXIS));  
	setSize(400,400);  
	setVisible(true);  
	}  
	  
	public static void main(String args[]){  
		Exp196 b=new Exp196();  
	}  
	
}
