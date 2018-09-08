import java.awt.*;  
	import java.awt.event.*;  
	import java.awt.Color;
	import java.awt.Dimension;
	import java.awt.Font;
	import java.awt.Graphics;

	import javax.swing.JFrame;
	import javax.swing.JPanel;	
public class Test extends Frame implements ActionListener {
	
	TextField tf,tf1; 
	Test(){  
	  
	//create components  
	tf=new TextField();
	tf1=new TextField();
	tf.setBounds(120,50,170,20); 

	tf1.setBounds(60,50,170,20); 
	Button b=new Button("add");  
	b.setBounds(100,120,80,30);  
	  
	//register listener  
	b.addActionListener(this);//passing current instance  
	  
	//add components and set size, layout and visibility  
	add(b);add(tf);  
	setSize(300,300);  
	setLayout(null);  
	setVisible(true);  
	
	}  
	public void actionPerformed(ActionEvent e){  
	tf.setText("Welcome");  
	}
	public static void main(String args[]){  
		JFrame o1=new JFrame();
	o1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}  
	  
}
