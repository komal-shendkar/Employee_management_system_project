package employee_management_system_package;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.*;

public class login extends JFrame implements ActionListener
{
	JTextField tusername;
	
	JPasswordField tpassword;
	
	JButton login, back;
	private String name;

	login()
	{
		JLabel username =new JLabel("Username");
		username.setBounds(40,20,100,30);
		add(username);
		tusername=new JTextField();
		tusername.setBounds(150,20,150,30);
		add(tusername);
		
		JLabel password =new JLabel("Password");
		password.setBounds(40,70,100,30);
		add(password);
		tpassword=new JPasswordField();
		tpassword.setBounds(150,70,150,30);
		add(tpassword);
		
		login =new JButton("LOGIN");
		login.setBounds(150,140,150,30);
		login.setBackground(Color.black);
		login.setForeground(Color.WHITE);
		login.addActionListener(this);
		add(login);
		
		back =new JButton("BACK");
		back.setBounds(150,180,150,30);
		back.setBackground(Color.black);
		back.setForeground(Color.WHITE);
		back.addActionListener(this);
		add(back);
		
		ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource(name="loginb.jpg.jpg"));
		Image i2=i1.getImage().getScaledInstance(  600,300,Image.SCALE_DEFAULT);
		ImageIcon i3= new ImageIcon(i2);
		JLabel ing=new JLabel(i3);
		ing.setBounds(0, 0, 600, 300);
		add(ing);
		
		
		setSize(600,300);
		setLocation(450,200);
		setLayout(null);
		setVisible(true);
	}
	@Override
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==login)
		{
			try 
			{
				String username= tusername.getText();

				//@SuppressWarnings("deprecation")
				String password= tpassword.getText();
				
				conn conn=new conn();
				
				String query="select *from login where username ='"+username +"' and password= '"+password+"'";
				
				 ResultSet resultSet=conn.statement.executeQuery(query);
				
				if(resultSet.next())
				{
					setVisible(false);
					new main_class();
				}
				else
				{
					JOptionPane.showMessageDialog(null,"invalid username");
				}
				
			}
			catch(Exception E)
			{
				E.printStackTrace();
			}
		}else if(e.getSource()==back)
		{
			System.exit(90);
		}
	}
	
	public static void main(String[] args) 
	{
	new login();

	}
	/*@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}*/

}
