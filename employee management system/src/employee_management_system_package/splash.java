package employee_management_system_package;
import java.awt.*;

import javax.swing.*;
public class splash extends JFrame{
	
	private int width;
	private int height;
	private String name;

	splash()
	{
		ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource(name="front.gif.gif"));
		Image i2=i1.getImage().getScaledInstance(  1170, 650,Image.SCALE_DEFAULT);
		ImageIcon i3= new ImageIcon(i2);
		JLabel image=new JLabel(i3);
		image.setBounds(0, 0, 1170, 650);
		add(image);
		
		
		
	    setSize(1170,650);
		setLocation(200,50);
		setLayout(null);
		setVisible(true);
		
		try {
			Thread.sleep(5000);
			setVisible(false);
			new login();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) 
	{
		new splash();
		//System.out.println("komal");

	}

}
