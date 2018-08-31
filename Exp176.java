	import java.awt.Color;  
	import javax.swing.*;  

public class Exp176 {
	  
	    JTextArea area;  
	    JFrame f;  
	    Exp176(){  
	    f=new JFrame();  
	          
	    area=new JTextArea(300,300);  
	    area.setBounds(10,30,300,300);  
	      
	    area.setBackground(Color.blue);  
	    area.setForeground(Color.pink);  
	          
	    f.add(area);  
	      
	    f.setSize(400,400);  
	    f.setLayout(null);  
	    f.setVisible(true);  
	}  
	    public static void main(String[] args) {  
	        new Exp176();  
	    }  
  

}
