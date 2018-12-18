import javax.swing.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.*; 

class testborderlayout extends JFrame implements ActionListener
{
	JTextField tf;
	String str="";
	String mystr="";
	String operator="";
	int n1,n2,ans;
	
	testborderlayout()
	{
		JFrame jf=new JFrame("Calculator");
		jf.setSize(400,400);
		jf.setVisible(true);
		jf.setLayout(new BorderLayout());
		
		tf=new JTextField(100);
		jf.add(tf,BorderLayout.NORTH);
		
		JPanel p2=new JPanel();
		p2.setLayout(new GridLayout(4,4));
		jf.add(p2,BorderLayout.CENTER);
		
		
		for(int i=1;i<=16;i++)
	    {
	      if(i==4)
	      {
	        JButton b=new JButton("CLEAR");
	        b.addActionListener(this);
	        p2.add(b);
	      }

	      else if(i==8)
	      {
	        JButton b=new JButton("+");
	        b.addActionListener(this);
	        p2.add(b);
	      }

	      else if(i==12)
	      {
	        JButton b=new JButton("-");
	        b.addActionListener(this);
	        p2.add(b);
	      }

	      else if(i==13)
	      {
	      JButton b=new JButton(Integer.toString(0));
	      b.addActionListener(this);
	      p2.add(b);
	      }

	      else if(i==14)
	      {
	          JButton b=new JButton("/");
	          b.addActionListener(this);
	          p2.add(b);
	      }

	      else if(i==15)
	      {
	          JButton b=new JButton("=");
	          b.addActionListener(this);
	          p2.add(b);
	      }

	      else if(i==16)
	      {
	        JButton b=new JButton("*");
	        b.addActionListener(this);
	        p2.add(b);
	      }

	    else
	    {
	      JButton b = new JButton();
	      if(i<=3)
	         b=new JButton(Integer.toString(i));
	      else if(i<=7)
	         b=new JButton(Integer.toString(i-1));
	      else if(i<=11)
	         b=new JButton(Integer.toString(i-2));

	      b.addActionListener(this);
	      p2.add(b);
	    }
	      
	    }	
	}
	
	public void actionPerformed(ActionEvent e)
	{
		str=e.getActionCommand();
		
		for(int j=0;j<=9;j++)
		{
			if(str.equals(Integer.toString(j)))
			{
				mystr=tf.getText()+str;
				tf.setText(mystr);
			}
		}
		
	    if(str.equals("+"))
	    {
	      String str2=mystr;
	      operator="+";
	      
	      mystr=tf.getText()+str;
	      tf.setText(mystr);
	      n1=Integer.parseInt(str2);
	    }
	    
	    if(str.equals("-"))
	    {
	      String str2=mystr;
	      operator="-";
	      
	      mystr=tf.getText()+str;
	      tf.setText(mystr);
	      n1=Integer.parseInt(str2);	
	    }
	    
	    if(str.equals("*"))
	    {
	      String str2=mystr;
	      operator="*";
	      
	      mystr=tf.getText()+str;
	      tf.setText(mystr);
	      n1=Integer.parseInt(str2);	
	    }
	    
	    if(str.equals("/"))
	    {
	      String str2=mystr;
	      operator="/";
	      
	      mystr=tf.getText()+str;
	      tf.setText(mystr);
	      n1=Integer.parseInt(str2);	
	    }
	    
	    if(str.equals("="))
	    {
	      int pos=mystr.indexOf(operator);
	      String str3=mystr.substring(pos+1,mystr.length());
	      n2=Integer.parseInt(str3);
	      
	      if(operator.equals("+"))
	      {
	    	  int ans=n1+n2;
	    	  tf.setText(Integer.toString(ans));
	    	  
	      }
	      if(operator.equals("-"))
	      {
	    	  int ans=n1-n2;
	    	  tf.setText(Integer.toString(ans));
	    	  
	      }
	      if(operator.equals("*"))
	      {
	    	  int ans=n1*n2;
	    	  tf.setText(Integer.toString(ans));
	    	  
	      }
	      if(operator.equals("/"))
	      {
	    	  int ans=n1/n2;
	    	  tf.setText(Integer.toString(ans));
	    	  
	      }
	    }
	      
		  if(str.equals("CLEAR"))
		  {
		   	tf.setText("");
		  }
	    
	}
}