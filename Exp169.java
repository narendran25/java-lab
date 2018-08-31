import java.awt.*;  
	
public class Exp169 extends Frame{
	 
	Exp169(){  
	Button b=new Button("click me");  
	b.setBounds(50,50,50,50);// setting button position  
	add(b);//adding button into frame  
	setSize(500,500);//frame size 300 width and 300 height  
	setLayout(null);//no layout manager  
	setVisible(true);//now frame will be visible, by default not visible  
	}  
	public static void main(String args[]){  
	Exp169 f=new Exp169();  
	}
}
