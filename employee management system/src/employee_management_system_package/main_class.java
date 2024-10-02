package employee_management_system_package;
import java.awt.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import com.sun.tools.javac.Main;
import javax.swing.*;
public class main_class extends JFrame implements ActionListener
{
	//private static final Object view = null;
	private String name;
	private int size;
	//private Object view;
	//private Object rem;
	//private ActionListener ActionListener;
	main_class()/*(java.awt.event.ActionListener nullActionListener)*/
	{
		
		ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource(name ="home.jpg.jpg"));
		Image i2=i1.getImage().getScaledInstance(  1120,630,Image.SCALE_DEFAULT);
		ImageIcon i3= new ImageIcon(i2);
		JLabel img=new JLabel(i3);
		img.setBounds(0, 0,1120,630);
		add(img);
		
		JLabel heading= new JLabel("Employee management system");
		heading.setBounds(340,155,400,40);
		heading.setFont(new Font(name= "Raleway",Font.BOLD,size =25));
		img.add(heading);
		
		JButton add =new JButton("Add employee");
		add.setBounds(335,270,150,40);
		add.setBackground(Color.black);
		add.setForeground(Color.WHITE);
		add.addActionListener(this);
		img.add(add);
		
		
		
		JButton view =new JButton("view employee");
		view.setBounds(565,270,150,40);
		view.setBackground(Color.black);
		view.setForeground(Color.WHITE);
		view.addActionListener(this);
		img.add(view);
	
		
		JButton rem =new JButton("Remove employee");
		rem.setBounds(440,370,150,40);
		rem.setBackground(Color.black);
		rem.setForeground(Color.WHITE);
		rem.addActionListener(this);
		img.add(rem);
		
		setSize(1120,630);
		setLocation(250,100);
		setLayout(null);
		setVisible(true);
	}
	//@Override
     @Override
	
	public void actionPerformed(ActionEvent e)
	{
    	 if(e.getSource()==add);
    	 {
	    new addemployee();
		setVisible(false);
		}
    	 if(e.getSource()==view);{
		
		 new view_employee();
			setVisible(false);}
    	 if(e.getSource()==rem)	{
		new remove_employee();}	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       new main_class();
	}

}
