package cabproject;
//import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
//import java.util.Arrays;

import javax.swing.*;
public class Bookings {
	public Bookings() {	
		JFrame j3=new JFrame("Bookings");
		JLabel pl=new JLabel("pickup location");
		JTextField pl1=new JTextField();
		pl.setBounds(10,50,200,30);
		pl1.setBounds(150,50,200,30);		
		JTextField dl1=new JTextField();
		JLabel dl=new JLabel("drop location");
		dl1.setBounds(150,100,200,30);
		dl.setBounds(10,100,200,30);
		
		Integer passengers[]= {1,2,3,4,5,6};
		JComboBox np1=new JComboBox(passengers);
		JLabel np=new JLabel("no of passengers");
		np1.setBounds(150,150,200,30);
		np.setBounds(10,150,200,30);
		JLabel vt=new JLabel("vehicle type");
		vt.setBounds(10,250,200,30);
		String models[]= {"Mini","sedan","Maxi","Micro","Prime"};
		JComboBox m=new JComboBox(models);
		m.setBounds(150,250,150,30);
		
		
		/**JLabel pt=new JLabel("payment type");
		  *pt.setBounds{10,350,200,30);
		 * String pay[]-{"online","cash","paytm"};
		 * JComboBox p1=new JComboBox(pay);
		 * p1.setBounds(150,350,150,30);
		 * */
		
		JButton cn=new JButton("confirm");
		cn.setBounds(100,400,110,50);
		
		JButton ca=new JButton("cancel");
		ca.setBounds(300,400,110,50);
		
		
		
		j3.add(pl);
		j3.add(pl1);
		j3.add(dl);
		j3.add(dl1);
		j3.add(np);
		j3.add(np1);
		j3.add(vt);
		j3.add(m);
		
		j3.add(cn);
		j3.add(ca);
		j3.setSize(600,500);
		j3.setLayout(null);
		j3.setVisible(true);
		
		
		
		
		cn.addActionListener(new ActionListener() {
			
			
			@Override
			public void actionPerformed(ActionEvent e2) {
				
				Assign1 ar=new Assign1(pl1.getText(),dl.getText(),np1.getSelectedItem().toString(),m.getSelectedItem().toString());
				try {
					FileOutputStream fileOut=new FileOutputStream("C:\\Users\\91912\\Desktop\\JAVA LAB\\details2.txt");
					ObjectOutputStream out=new ObjectOutputStream(fileOut);
					out.writeObject(ar);
					out.close();
				}catch(IOException i)
				{
					i.printStackTrace();
				}
				String x=pl1.getText();
				System.out.println(x);
				
				
				
				
				JOptionPane.showMessageDialog(j3,"checking for nearby cabs"+" please wait!");
				
				Cabinfo ci=new Cabinfo();
				
				
			}});
			
			
			ca.addActionListener(new ActionListener() {
				
				
				@Override
				public void actionPerformed(ActionEvent e5) {				
					JOptionPane.showMessageDialog(j3,"do you want to exit?");
					System.exit(0);
	
					
				}});
				
}
}