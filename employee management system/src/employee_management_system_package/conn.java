package employee_management_system_package;
import java.sql.*;

public class conn {
	
	
          Connection connection;
           
           Statement statement;
       	
       	public conn()
       	{
       		try 
       		{
       			  Class.forName("com.mysql.cj.jdbc.Driver");
       			   connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeemanagement","root","Root@80");
       			   
       			   statement =connection.createStatement();
       			   

       			/*if(connection.isClosed())
       			{
       				System.out.println("connection is closed");
       			}else
       			{
       				System.out.println("connection is created");
       			}*/

       		}
       		catch(Exception e)
       		{
       			e.printStackTrace();
       		}
       	}	
       	
	public static void main(String[] args) 
	{
	          new conn();
    		//System.out.println("hi");

	}

}
