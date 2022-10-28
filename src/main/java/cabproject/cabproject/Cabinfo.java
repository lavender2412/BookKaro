package cabproject;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;
public class Cabinfo {
public Cabinfo() {
	Assign1 ar=null;
	
	Driver2 s1=new Driver2("driver1","TS12AB1234","6589234170");
	Driver2 s2=new Driver2("driver2","TS12AB1235","6589234171");
	Driver2 s3=new Driver2("driver3","TS12AB1236","6589234172");
	Driver2 s4=new Driver2("driver4","TS12AB1237","6589234173");
	Driver2 s5=new Driver2("driver5","TS12AB1238","6589234174");
	Driver2 s6=new Driver2("driver6","TS12AB1239","6589234175");
	ArrayList<Driver2> list=new ArrayList<Driver2>();
	list.add(s1);
	list.add(s2);
	list.add(s3);
	list.add(s4);
	list.add(s5);
	list.add(s6);
	int s=list.size();
	Random r=new Random();
	int p=r.nextInt(s);
	
    try {
		FileInputStream fileIn=new FileInputStream("C:\\Users\\91912\\Desktop\\JAVA LAB\\details2.txt");
		ObjectInputStream in=new ObjectInputStream(fileIn);
		ar=(Assign1) in.readObject();
		
		in.close();
		fileIn.close();
    }
    catch(IOException i) {
    	i.printStackTrace();
    	return;
    }catch(ClassNotFoundException c) {
    	System.out.println("Assign2 class not found");
    	c.printStackTrace();
    	return;
    }
    
    
    
    
    
    JFrame j4=new JFrame("CabInfo");
    
    String x=ar.p;
    String y=ar.vt;
    
    JLabel pl=new JLabel("pickup location");
    //JTextField pl1=new JTextField(x);
    JLabel pl1=new JLabel();
    pl.setBounds(10,50,200,30);
    pl1.setBounds(150,50,200,30);
    
    JLabel cd=new JLabel(" Cab Driver name");
    cd.setBounds(10,100,200,30);
    
    JLabel cd1=new JLabel();
    cd1.setBounds(150,100,200,30);
    
    
    JLabel cnll=new JLabel();
    JLabel cnl=new JLabel("Cab no: ");
    cnll.setBounds(150,150,200,30);
    cnl.setBounds(10,150,200,30);
    
    JLabel cm=new JLabel("Car Model");
    cm.setBounds(10,200,100,30);
    JLabel cm1=new JLabel();
    cm1.setBounds(150,200,100,30);
    
    /**JLabel tel=new JLabel("Driver telephone:");
     * te.setBounds(10,250,200,30);
     * JTextField tel1=new JTextField();
     * tell.setBounds(150,250,150,30);**/
    
    JButton cn2=new JButton("confirm");
    
    cn2.setBounds(100,400,110,50);
    
    JButton ed=new JButton("Edit");
    ed.setBounds(350,400,110,50);
    
    
    
    j4.add(pl);
    j4.add(pl1);
    j4.add(cd);
    j4.add(cd1);
    j4.add(cnll);
    j4.add(cnl);
    j4.add(cm);
    j4.add(cm1);
    
    j4.add(cn2);
    j4.add(ed);
    j4.setSize(600,500);;
    j4.setLayout(null);
    j4.setVisible(true);
    pl1.setText(x);
    cnll.setText(list.get(p).numplate);
    cd1.setText(list.get(p).drivername);
    //cm.setText(list.get(p).telno);
    cm1.setText(y);
    
    
    cn2.addActionListener(new ActionListener() {
    	
    	
    	@Override
    	public void actionPerformed(ActionEvent e3) {
    		
    		
    		JOptionPane.showMessageDialog(j4, "your cab will arrive shortly!"+"   "+"please wait....");
    		
    		//System.exit(0);
    		Manage m1=new Manage();
    		
    		Driver2 d8=new Driver2(list.get(p).drivername,list.get(p).numplate,list.get(p).telno);
    		try {
    			FileOutputStream fileOut=new FileOutputStream("C:\\Users\\91912\\Desktop\\JAVA LAB\\details5.txt");
    			ObjectOutputStream out=new ObjectOutputStream(fileOut);
    			out.writeObject(d8);
    			out.close();
    		}catch(IOException i)
    		{
    			i.printStackTrace();
    		}
    		
    	}});
    
    ed.addActionListener(new ActionListener() {
    	
    		
    	@Override
    	public void actionPerformed(ActionEvent e4) {
    		
    		
        Bookings b3=new Bookings();
    		
    		
    		
    		
    	}});
}

    	}