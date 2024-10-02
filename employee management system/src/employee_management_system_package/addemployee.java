package employee_management_system_package;
import javax.swing.*;

import java.awt.*;
//import java.awt.event.ActionEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.sql.ResultSet;
import java.util.Random;

public class addemployee extends JFrame  implements ActionListener
{
	private String name;
	private int size;
	Random ran=new Random();
	int number=ran.nextInt(999999);
	JTextField names,taddress,tphone,tsalary,tdesignation,temail,taadhar,tname,fname,tfname,tdob,tempid;
	JButton add,back;
	addemployee()
	{
		
		getContentPane().setBackground(new Color(163,255,188));
		//setSize(1120,630);
		
		JLabel heading=new JLabel("Add Employee details");
		heading.setBounds(320,30,500,50);
		heading.setFont(new Font(name="serial",Font.BOLD,size =25));
		add(heading);
		
		JLabel names =new JLabel("Name");
		names.setBounds(50,150,150,30);
		add(names);
		
		tname=new JTextField();
		tname.setBounds(200, 150, 150, 30);
		tname.setBackground(new Color(177,252,197));
		add(tname);
		

		JLabel fname =new JLabel(" Father Name");
		fname.setBounds(400,150,150,30);
		add(fname);
		
		tfname=new JTextField();
		tfname.setBounds(600, 150, 150, 30);
		tfname.setBackground(new Color(177,252,197));
		add(tfname);
		
		JLabel Dob =new JLabel(" Date of birth");
		Dob.setBounds(50,200,150,30);
		add(Dob);
		
		tdob=new JTextField();
		tdob.setBounds(200, 200, 150, 30);
		tdob.setBackground(new Color(177,252,197));
		add(tdob);
		

		JLabel salary =new JLabel(" Salary");
		salary.setBounds(400,200,150,30);
		add(salary);
		
		
		tsalary=new JTextField();
		tsalary.setBounds(600, 200, 150, 30);
		tsalary.setBackground(new Color(177,252,197));
		add(tsalary);
		

		JLabel address=new JLabel(" address");
		address.setBounds(50,250,150,30);
		add(address);
		
		taddress=new JTextField();
		taddress.setBounds(200, 250, 150, 30);
		taddress.setBackground(new Color(177,252,197));
		add(taddress);
		
		JLabel phoneno=new JLabel(" mobile no");
		phoneno.setBounds(400,250,150,30);
		add(phoneno);
		
		tphone=new JTextField();
		tphone.setBounds(600, 250, 150, 30);
		tphone.setBackground(new Color(177,252,197));
		add(tphone);
		
		JLabel email=new JLabel(" Email id");
		email.setBounds(50,300,150,30);
		add(email);
		
		temail=new JTextField();
		temail.setBounds(200, 300, 150, 30);
		temail.setBackground(new Color(177,252,197));
		add(temail);
		
		JLabel empid=new JLabel(" Employee id");
		empid.setBounds(50,400,150,30);
		add(empid);
		
		tempid=new JTextField(""+number);
		tempid.setBounds(200, 400, 150, 30);
		//tempid.setBackground(new Color(177,252,197));
		tempid.setFont(new Font(name="SAN_SARIF",Font.BOLD,size =20));
		tempid.setForeground(Color.RED);
		add(tempid);
		
		
		add =new JButton("Add");
		add.setBounds(450,550,150,40);
		add.setBackground(Color.black);
		add.setForeground(Color.WHITE);
		add.addActionListener(this);
		add(add);
		
		back =new JButton("Back");
		back.setBounds(250,550,150,40);
		back.setBackground(Color.black);
		back.setForeground(Color.WHITE);
		back.addActionListener(this);
		add(back);
		
		
		setSize(900,700);
		setLocation(300,50);
		setLayout(null);
		setVisible(true);
	}
	
@Override
	
	public void actionPerformed(ActionEvent e)
	{
	    if(e.getSource()==add);
	    {
	    	String names=tname.getText();
	    	String fname=tfname.getText();
	    	String Dob=tdob.getText();
	    	String phone=tphone.getText();
	    	String email=temail.getText();
	    	String salary=tsalary.getText();
	    	String address=taddress.getText();
	    	String empid=tempid.getText();
	    	try
	    	{
	    		conn c=new conn();
	    		String query="insert into employee values('"+names+"','"+fname+"','"+Dob+"','"+phone+"','"+email+"','"+salary+"','"+address+"','"+empid+"')";
	    		 //ResultSet resultSet=c.statement.executeUpdate(query);
	    		 c.statement.executeUpdate(query);
	    	   JOptionPane.showMessageDialog(null,"Details add successfully");
	    	   setVisible(false);
	    	   new main_class();
	    	   
	    	}
	    	catch(Exception E)
	    	{
	    		E.printStackTrace();
	    	}
	    }
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
         new addemployee();
	}

}
