import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test2 extends JPanel implements ActionListener{

	TextField tf;
	TextField tf1; 
	Test2(){  
	  
	//create components  
	tf=new TextField();
	tf1=new TextField();
	tf.setBounds(60,150,70,120); 

	tf1.setBounds(60,200,70,120); 
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

  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.getContentPane().add(new Test2());

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(200,200);
    frame.setVisible(true);
  }

@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	
}
}
