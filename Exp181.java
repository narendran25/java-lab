import javax.swing.*;  
	  
public class Exp181 extends JFrame{
	
	
	  
	public Exp181() {  
	JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 50, 25);  
	JPanel panel=new JPanel();  
	panel.add(slider);  
	  
	add(panel);  
	}  
	  
	public static void main(String s[]) {  
		Exp181 frame=new Exp181();  
	frame.pack();  
	frame.setVisible(true);  
	}  
	 

}
