package Employee;

import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;

 class login extends JFrame implements ActionListener {
	
	Container container=getContentPane();
	JLabel username=new JLabel("User name :");
	JLabel password=new JLabel("password :");
	JTextField username_text=new JTextField();
	JTextField password_text=new JTextField();
	JButton signup=new JButton("SIGN UP");
	JButton login=new JButton("LOGIN");
	
	login(){
	       container.setLayout(null);
	       username.setBounds(50,150,100,30);
	       password.setBounds(50,220,100,30);
	       username_text.setBounds(150,150,150,30);
	       password_text.setBounds(150,220,150,30);
	       signup.setBounds(50,300,100,30);
	       login.setBounds(200,300,100,30);
	     
	     container.add(username);
	  	 container.add(username_text);
	  	 container.add(password);
	  	 container.add(password_text);
	  	 container.add(signup);
	  	 container.add(login);
	  	
	  	 signup.addActionListener(this);
	  	 login.addActionListener(this);
	}
	
	 public void actionPerformed(ActionEvent e){
		
		String user= username_text.getText();
		String pass=password_text.getText();
			
			if(e.getSource()==signup) {
			
					try {
						String se9;
						int w=0;
						String [] words9=null;
						BufferedReader br9=new BufferedReader(new FileReader("D://java programs/signup.txt"));
						while((se9=br9.readLine()) != null)
						{
							words9=se9.split("\n");
							 
							for(String word1 :words9)
							{
								
								if(word1.equals(pass))
								{
								      w=1;
								}
							}
						}
						br9.close();
						
                       if(w!=1) {
						BufferedWriter f4 = new BufferedWriter(new FileWriter("D://java programs/signup.txt",true));
						f4.write(user);
						f4.write("\n");
						f4.write(pass);
						f4.write("\n");
						f4.close();
						JOptionPane.showMessageDialog(this,"signed up successfully");
						f4.close();
                       }
                       else {
                    	   JOptionPane.showMessageDialog(this,"the id is already there. choose another");
                       }
					} 
					catch (IOException e4) {
						try {
						BufferedWriter f4 = new BufferedWriter(new FileWriter("D://java programs/signup.txt",true));
						f4.write(user);
						f4.write("\n");
						f4.write(pass);
						f4.write("\n");
						f4.close();
						JOptionPane.showMessageDialog(this,"signed up successfully");
						f4.close();
						}
						catch(IOException e6)
						{
							System.out.println("exception e6");
						}
					}
					
				}
			
			if(e.getSource()==login) {
				
				try {
					
				BufferedReader br4=new BufferedReader(new FileReader("D://java programs/login.txt"));
				String se6;
				int x=0;
				String [] words3=null;
				while((se6=br4.readLine()) != null)
				{
					words3=se6.split("\n");
					 for(String word1 :words3)
					{
						if(word1.equals(pass))
						{
						      x=1;
						}
					}
				}
				br4.close();
				
				if(x!=1) {
				String se5;
				int y=0;
				String [] words2=null;
			
				BufferedReader br3=new BufferedReader(new FileReader("D://java programs/signup.txt"));
				while((se5=br3.readLine()) != null)
				{
					words2=se5.split("\n");
					 for(String word1 :words2)
					{
						if(word1.equals(pass))
						{
						      y=1;
						}
					}
				}
				br3.close();
			if(y==1) {
					
				String name;
				int id;
				int salary;
				String state;
				long number;
					Scanner sc=new Scanner(System.in);
					BufferedWriter f5 = new BufferedWriter(new FileWriter("D://java programs/login.txt",true));
					System.out.println("enter your name :");
					name=sc.nextLine();
					f5.write(name);
					f5.write("\n");
					
					System.out.println("enter your state :");
			        state=sc.nextLine();
					f5.write(state);
					f5.write("\n");
					
					System.out.println("enter your id :");
			        id=sc.nextInt();
			        String p1=String.valueOf(id);
					f5.write(p1);
					f5.write("\n");
				
					System.out.println("enter your salary :");
			        salary=sc.nextInt();
			        String p2=String.valueOf(salary);
					f5.write(p2);
					f5.write("\n");
					
					System.out.println("enter your number");
			       number=sc.nextLong();
			       String p3=String.valueOf(number);
					f5.write(p3);
					f5.write("\n");
					f5.close();
					JOptionPane.showMessageDialog(this,"logged in successfully");
					f5.close();
					}
			else
			{
				JOptionPane.showMessageDialog(this,"you are not signed in. ");
			}
			}
				else {
					JOptionPane.showMessageDialog(this,"the id is already there. choose another");
				}
					
				} catch (IOException e4) {
					try {
						String name;
						int id;
						int salary;
						String state;
						long number;
					Scanner sc=new Scanner(System.in);
					BufferedWriter f5 = new BufferedWriter(new FileWriter("D://java programs/login.txt",true));
					System.out.println("enter your name :");
					name=sc.nextLine();
					f5.write(name);
					f5.write("\n");
					
					System.out.println("enter your state :");
			        state=sc.nextLine();
					f5.write(state);
					f5.write("\n");
					
					System.out.println("enter your id :");
			        id=sc.nextInt();
			        String p1=String.valueOf(id);
					f5.write(p1);
					f5.write("\n");
				
					System.out.println("enter your salary :");
			        salary=sc.nextInt();
			        String p2=String.valueOf(salary);
					f5.write(p2);
					f5.write("\n");
					
					System.out.println("enter your number");
			       number=sc.nextLong();
			       String p3=String.valueOf(number);
					f5.write(p3);
					f5.write("\n");
					f5.close();
					JOptionPane.showMessageDialog(this,"logged in successfully");
					f5.close();
				}
					catch(IOException e8)
					{
						System.out.println("exception occured");
					}
					}}
					}		
 }
	
	
	public class management{
public static void main(String args[]) throws Exception  {
	String s,se1,se2;
	int n1;
	int c,i;
	int r;
	Scanner sc=new Scanner(System.in);
	System.out.println("        EMPLOYEE MANAGEMENT SYSTEM        ");
	System.out.println("enter you are a manager or employee :");
	s=sc.nextLine();
	if(s.equals("manager"))
	{
		BufferedReader br=new BufferedReader(new FileReader("D://java programs/login.txt"));
		System.out.println("1.search for particular person \n 2.all employee details\n");
		r=sc.nextInt();
		String [] words1=null;
		int j;
		if(r==1)
		{
			System.out.println("enter the name to be searched :");
			n1=sc.nextInt();
			String p7=String.valueOf(n1);
			
			BufferedReader br1=new BufferedReader(new FileReader("D://java programs/signup.txt"));
			c=0;
			while((se1=br1.readLine()) != null)
			{
				words1=se1.split("\n");
				 
				for(String word1 :words1)
				{
					c++;
					if(word1.equals(p7))
					{
					     j=c/2;
					     
					     int z=5*(j-1);
					    
					     for(i=0;i<z;i++)
					     {
					    	 br.readLine();
					     }
							for( i=z;i<=z+4;i++)
							{
								System.out.println(br.readLine());
							}
					}
				}	
			}
			 br1.close();		
		}
		else if(r==2)
		{
			int count=0;
		
			while((se2=br.readLine()) != null)
			{
				System.out.print(se2+"\t");
				count++;
				if(count==5)
				{
					System.out.println();
					count=0;
				}
			}
			
		}
		
		else
		{
			System.out.println("enter the correct choice");
		}
		br.close();
	}
	else if(s.equals("employee"))
	{
		login frame=new login();
		frame.setTitle("LOGIN FORM");
		frame.setVisible(true);
		frame.setBounds(10,10,370,600);
	
	}
	else
	{
		System.out.println("enter the correct input");
	}
	
}
}
 
