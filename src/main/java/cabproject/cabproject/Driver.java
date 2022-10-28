package cabproject;
//import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import javax.swing.*;
import javax.swing.JFrame;
public class Driver{
public Driver() {

JFrame j5=new JFrame("Driver Info");

Assign1 ar1=null;
try{
 FileInputStream fileIn=new FileInputStream("C:\\Users\\91912\\Desktop\\JAVA LAB\\details2.txt");
ObjectInputStream in=new ObjectInputStream(fileIn);

ar1=(Assign1 ) in.readObject();
in.close();
fileIn.close();
}
catch(IOException i){
i.printStackTrace();
return;
}catch(ClassNotFoundException c){
System.out.println("Assign2 class not  found");
c.printStackTrace();
return;
}
Driver2 d9=null;
try{
FileInputStream fileIn=new FileInputStream("C:\\Users\\91912\\Desktop\\JAVA LAB\\details5.txt");
ObjectInputStream in =new ObjectInputStream(fileIn);
d9=(Driver2) in.readObject();
in.close();
fileIn.close();
}
catch (IOException i){
i.printStackTrace();
return;
}catch(ClassNotFoundException c){
System.out.println("Driver2 class not found");
c.printStackTrace();
return;
}
JLabel cdn =new JLabel("Cab Driver Name");
cdn.setBounds(10,100,200,30);
JLabel cd2=new JLabel (d9.drivername);
cd2.setBounds(150,100,200,30);
JLabel cnp=new JLabel(d9.numplate);
JLabel cnp1  = new JLabel("Cab no");
cnp.setBounds(150,150,200,30);
cnp1.setBounds(10,150,200,30);
JLabel cn2= new JLabel ("CAB MODEL");
cn2.setBounds(10,200,100,30);
JLabel cn3=new JLabel();
cn3.setBounds(150,200,100,30);
JLabel tel =new JLabel("driver telephone ");
tel.setBounds(10,250,200,30);
JLabel tel1=new JLabel(d9.telno);
tel1.setBounds(150,250,150,30);
String y=ar1.vt;
JButton bc3=new JButton("Back");
bc3.setBounds(250,400,150,30);
j5.add(cdn); 
j5.add(cd2);
j5.add(cnp);
j5.add(cnp1);
j5.add(cn2);
j5.add(cn3);
j5.add(tel);
j5.add(tel1);
cn3.setText(y);
j5.add(bc3);
j5.setSize(600,500);
j5.setLayout(null);
j5.setVisible(true);
bc3.addActionListener(new ActionListener (){
public void actionPerformed(ActionEvent e6){
Manage m=new Manage();
}});
}
}