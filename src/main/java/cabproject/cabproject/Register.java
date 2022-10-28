package cabproject;
import java.io.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import javax.swing.*;
public class Register{
public Register(){
JFrame j2= new JFrame("Registration");
JLabel un=new JLabel("UserName");
JTextField un1=new JTextField();
un.setBounds(10,50,200,30);
un1.setBounds(150,50,200,30);
JPasswordField pwd=new JPasswordField();
JLabel p=new JLabel("Password");
pwd.setBounds(150,100,200,30);
p.setBounds(10,100,200,30);
JPasswordField pw=new JPasswordField();
JLabel pp=new JLabel("Re-enter password");
pw.setBounds(150,150,200,30);
pp.setBounds(10,150,200,30);
JLabel gender=new JLabel("Gender");
gender.setBounds(10,250,200,30);
JRadioButton r1=new JRadioButton("Male");
JRadioButton r2=new JRadioButton("Female");
r1.setBounds(150,250,100,30);
r2.setBounds(270,250,200,30);
//JTextField t1 = new JTextField();
JLabel tele = new JLabel("mobile no");
//JTextField t1 = new JTextField();
tele.setBounds(10,300,175,40);
JTextField t1 = new JTextField();
t1.setBounds(150,300,175,40);
JButton s1=new JButton("Register");
//JTextField t1 = new JTextField();
//t1.setBounds(150,300,175,40);
s1.setBounds(100,400,110,50);
j2.add(un);
j2.add(un1);
j2.add(p);
//j2.add(p);
j2.add(pw);
j2.add(pwd);
j2.add(pp);
j2.add(gender);
j2.add(r1);
j2.add(r2);
j2.add(tele);
j2.add(t1);
j2.add(s1);
j2.setSize(500,500);
j2.setLayout(null);
j2.setVisible(true);
s1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
char[] password=pwd.getPassword();
char[] cpassword=pw.getPassword();
if(!(Arrays.equals(password,cpassword)))

{
JOptionPane.showMessageDialog(j2,"password Not Same! ");
}
else
{
JOptionPane.showMessageDialog(j2,"Password okay");
Bookings b1=new Bookings();
}
Assign2 v=new Assign2(un1.getText(),pwd.getText(),gender.getText() ,tele.getText());
String x=un1.getText();
System.out.println(x);
}});
s1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e8){
Assign2 v=new Assign2(un1.getText(),pwd.getText(),gender.getText(),tele.getText());
try{
 FileOutputStream fileOut=new FileOutputStream("C:\\Users\\91912\\Desktop\\JAVA LAB\\details.txt");
ObjectOutputStream out=new ObjectOutputStream(fileOut);
out.writeObject(v);
out.close();
}
catch(IOException i)
{
i.printStackTrace();
}
String x=un1.getText();
System.out.println(x);
}});
}
}