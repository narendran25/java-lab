import javax.swing.*;      
	
public class Exp173 {
	Exp173(){    
	JFrame f=new JFrame("Button Example");            
	    
	  ImageIcon img  = new ImageIcon("reg.PNG");
	  JButton b=new JButton(img);
	  
	b.setBounds(100,100,100, 40);    
	f.add(b);    
	f.setSize(300,400);    
	f.setLayout(null);    
	f.setVisible(true);    
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
	    }         
	public static void main(String[] args) {    
	    new Exp173();    
	}    
	
}
