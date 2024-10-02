package employee_management_system_package;

import javax.swing.*;
import java.sql.ResultSet;
//import java.awt.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class remove_employee extends JFrame implements ActionListener {
	
	private String name;
	private int size;
    Choice choiceempid;
    JButton delete,back;
	remove_employee()
	{
		JLabel label=new JLabel(" employee id");
		label.setBounds(50,50,100,30);
		
		label.setFont(new Font(name="Tahoma",Font.BOLD,size =15));
		add(label);
		
		choiceempid=new Choice();
		choiceempid.setBounds(200, 50, 150, 30);
		add(choiceempid);
		
		try
		{
			conn c=new conn();
			ResultSet resultset=c.statement.executeQuery("select *from employee");
			while(resultset.next())
			{
				choiceempid.add(resultset.getString("empid"));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		JLabel labelname =new JLabel("Name");
		labelname.setBounds(50,100,100,30);
		add(labelname);
		
		JLabel textname=new JLabel();
		textname.setBounds(200, 100, 100, 30);
		//tname.setBackground(new Color(177,252,197));
		add(textname);
		
		JLabel labelemailid =new JLabel("email id");
		labelemailid.setBounds(50,150,100,30);
		add(labelemailid);
		
		JLabel textemailid=new JLabel();
		textemailid.setBounds(200, 150, 100, 30);
		//tname.setBackground(new Color(177,252,197));
		add(textemailid);
		
		    	try
		    	{
		    		conn c=new conn();
		    		ResultSet resultset=c.statement.executeQuery("select *from employee where empid='"+choiceempid.getSelectedItem()+"'");
		    	   while(resultset.next())
					{
						textname.setText(resultset.getString("names"));
						textemailid.setText(resultset.getString("email"));
					}
		    	  /* String names=tname.getText();
			    	String fname=tfname.getText();
			    	String Dob=tdob.getText();
		    	   setVisible(false);
		    	   new main_class();*/
		    	   
		    	}
		    	catch(Exception E)
		    	{
		    		E.printStackTrace();
		    	}
		    	
		    	
		    	choiceempid.addItemListener(new ItemListener() 
		    	{

				@Override
				public void itemStateChanged(ItemEvent e) 
				{
					try
					{
						conn c=new conn();
			    		ResultSet resultset=c.statement.executeQuery("select *from employee where empid='"+choiceempid.getSelectedItem()+"'");
			    	   while(resultset.next())
						{
							textname.setText(resultset.getString("names"));
							textemailid.setText(resultset.getString("email"));
						}
					}
					catch(Exception E)
					{
						E.printStackTrace();
					}
		    	}
				});
		
		    	delete =new JButton("Delete");
				delete.setBounds(80,300,100,30);
				delete.addActionListener(this);
				add(delete);
				
				back =new JButton("Back");
				back.setBounds(220,300,100,30);
				back.addActionListener(this);
				add(back);
				
				ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource(name="delete.png.png"));
				Image i2=i1.getImage().getScaledInstance(  200, 200,Image.SCALE_DEFAULT);
				ImageIcon i3= new ImageIcon(i2);
				JLabel image=new JLabel(i3);
				image.setBounds(700, 80, 200, 200);
				add(image);
				
				ImageIcon i11 =new ImageIcon(ClassLoader.getSystemResource(name="rback.png.png"));
				Image i22=i11.getImage().getScaledInstance(  1120, 630,Image.SCALE_DEFAULT);
				ImageIcon i33= new ImageIcon(i22);
				JLabel image1=new JLabel(i33);
				image1.setBounds(0, 0, 1120, 630);
				add(image1);
				
		
		setSize(1000,400);
		setLocation(300,150);
		setLayout(null);
		setVisible(true);
	
	}
	
	 @Override
		
		public void actionPerformed(ActionEvent e)
		{
		   if(e.getSource()==delete)
		   {
			   try
			   {
				   conn c=new conn();
				   String query="delete from employee where empid='"+choiceempid.getSelectedItem()+"'";
				   c.statement.executeUpdate(query);
				   JOptionPane.showMessageDialog(null,"Deleted add successfully");
				   setVisible(false);
				   new main_class();
			   }
			   catch(Exception E)
			   {
				  E.printStackTrace(); 
			   }
		   }else
		   {
			   setVisible(false);
		   }
		}

	public static void main(String[] args)
	{
		new remove_employee();

	}

}
