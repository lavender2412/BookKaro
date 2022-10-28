package cabproject;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class Manage {
	public Manage() {		
		JFrame  j6=new JFrame("Manage");
		JButton ex=new JButton("Exit");
		ex.setBounds(0,0,300,250);
		JButton di=new JButton("Driver Info");
		di.setBounds(300,250,300,250);
		j6.add(ex);
		j6.add(di);
		j6.setSize(600,500);
		j6.setLayout(null);
		j6.setVisible(true);		
		di.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e7) {			
				Driver d2=new Driver();
			}
		});	
		ex.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e8) {
						
				JOptionPane.showMessageDialog(j6,"do you want to exit?");
				System.exit(0);    		
		    	}});
		
	}

}