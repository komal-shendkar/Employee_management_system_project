package employee_management_system_package;
import javax.swing.*;
import java.sql.ResultSet;
//import java.awt.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.awt.event.ActionListener;
public class view_employee extends JFrame implements ActionListener
{
	 JTable table;
	Choice choiceEmp;
	JButton searchbtn,print,update,back;
	view_employee()
	{
		
		getContentPane().setBackground(new Color(255,131,122));
		
		JLabel search=new JLabel("Search by employee id");
		search.setBounds(20,20,150,20);
		//search.setFont(new Font(name="serial",Font.BOLD,size =25));
		add(search);
		
		choiceEmp=new Choice();
		choiceEmp.setBounds(180, 20, 150, 20);
		add(choiceEmp);
		
		try
		{
			conn c=new conn();
			ResultSet resultset=c.statement.executeQuery("select *from employee");
			while(resultset.next())
			{
				choiceEmp.add(resultset.getString("empid"));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		table=new JTable();
		try
		{
			conn c=new conn();
			ResultSet resultset=c.statement.executeQuery("select *from employee");
			//table.setModel(DbUtils.resultSetToTableModel(resultSet));
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		JScrollPane jp=new JScrollPane();
		jp.setBounds(0,100,900,600);
		add(jp);
		
		searchbtn =new JButton("search");
		searchbtn.setBounds(20,70,80,20);
		//search.setBackground(Color.black);
		//search.setForeground(Color.WHITE);
		searchbtn.addActionListener(this);
		add(searchbtn);
		
		print =new JButton("print");
		print.setBounds(120,70,80,20);
		print.addActionListener(this);
		add(print);
		
		update =new JButton("Update");
		update.setBounds(220,70,80,20);
		update.addActionListener(this);
		add(update);
		
		back =new JButton("Back");
		back.setBounds(320,70,80,20);
		back.addActionListener(this);
		add(back);
		
		
		
		
		setSize(900,700);
		setLocation(300,100);
		setLayout(null);
		setVisible(true);
	}

	
@Override
	
	public void actionPerformed(ActionEvent e)
	{
	
	 if(e.getSource()==searchbtn);
	 {
	  String query="select *from employee where empid='"+choiceEmp.getSelectedItem()+"'";
	  
	         try
	          {
		         conn c=new conn();
		         ResultSet resultset=c.statement.executeQuery(query);
		 // table.setModel(DbUtils.resultSetToTableModel(resultSet));
	          }
	         catch(Exception E)
	         {
		     E.printStackTrace();
	         }
	 }
	  if (e.getSource()==print)
		{
			try
			{
				table.print();
			}
			catch(Exception E)
			{
				E.printStackTrace();
			}
		}
	  else if(e.getSource()==update)
	  {
		  setVisible(false);
	  }
	  else
	  {
		  setVisible(false);
		  new main_class();
	  }
	 
 
	 
	
	}
	
	
	
	

	
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
     new view_employee();
	}

}
