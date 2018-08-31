import javax.swing.*;  
public class Exp182 extends JFrame {
	
	  

	  
	public Exp182() {  
	  
	JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 50, 25);  
	slider.setMinorTickSpacing(2);  
	slider.setMajorTickSpacing(10);  
	  
	slider.setPaintTicks(true);  
	slider.setPaintLabels(true);  
	  
	JPanel panel=new JPanel();  
	panel.add(slider);  
	add(panel);  
	}  
	  
	public static void main(String s[]) {  
		Exp182 frame=new Exp182();  
	frame.pack();  
	frame.setVisible(true);  
	  
	}  
	

}
