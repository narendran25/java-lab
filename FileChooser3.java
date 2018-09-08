
import java.awt.event.ActionEvent;
import java.io.File;
import java.util.Arrays;
import java.awt.event.*;  
import javax.swing.*;    
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileSystemView;

public class FileChooser3 {

	public static void main(String[] args) {
		
		 JFrame f=new JFrame("File Choose");  
		   
		    JButton b=new JButton("Browse");  
		    b.setBounds(50,100,95,30);  
		    JLabel l1;  
		    l1=new JLabel("First Label.");  
		    l1.setBounds(50,50, 500,30);  
		    b.addActionListener(new ActionListener(){  
		public void actionPerformed(ActionEvent e){
			
			JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
			jfc.setDialogTitle("Multiple file and directory selection:");
			jfc.setMultiSelectionEnabled(true);
			jfc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

			int returnValue = jfc.showOpenDialog(null);
			if (returnValue == JFileChooser.APPROVE_OPTION) {
				File[] files = jfc.getSelectedFiles();
				
				Arrays.asList(files).forEach(x -> {
					
						l1.setText(x.getName());

					
				});
				
			}
		              
		        }  
		    });  
		    f.add(b);f.add(l1);
		    f.setSize(400,400);  
		    f.setLayout(null);  
		    f.setVisible(true);  



	}

}