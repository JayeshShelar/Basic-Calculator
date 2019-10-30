import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.awt.Label;
public class Test1 extends Applet implements ActionListener
{
  TextField t1,t2,t3,t4;
   Label l1,l2,l3,l4,title;
   Button button ,clear;
  public void init()
  {
   title=new Label("Average Of Test Marks");
   title.setBounds(80,10,140,20);
   add(title);
   title.setAlignment(title.CENTER);

   l1=new Label("Enter Test1 Marks:");
   l1.setBounds(20,50,100,20);
   add(l1);
   t1=new TextField(8);
   t1.setBounds(150,50,100,20);
   add(t1);

   l2=new Label("Enter Test2 Marks:");
   l2.setBounds(20,90,100,20);
   add(l2);
   t2=new TextField(8);
   t2.setBounds(150,130,100,20);
   add(t2);

   l3=new Label("Enter Test3 Marks:");
   l3.setBounds(20,130,100,20);
   add(l3);
   t3=new TextField(8);
   t3.setBounds(150,210,100,20);
    add(t3);

   l4=new Label("Avg Marks:");
   l4.setBounds(20,50,100,20);
   add(l4);
   t4=new TextField(5);
   t4.setBounds(150,270,100,20);
   add(t4);

   button=new Button("Avg Marks: ");
   button.setBounds(150,170,100,20);
   add(button);
   
   clear=new Button("Clear: ");
   clear.setBounds(280,170,100,20);
   add(clear);
   
   button.addActionListener(this);
   clear.addActionListener(this);
  }
  public void actionPerformed(ActionEvent ae)
  {
   int a=0,b=0,c=0,d=0;
   String s1,s2,s3,s;
   try
   {
    s1=t1.getText();
    a=Integer.parseInt(s1);
    s2=t2.getText();
    b=Integer.parseInt(s2);
    s3=t3.getText();
    c=Integer.parseInt(s3);
   }
   catch(Exception ex) {}
   d=(a+b+c)/3;
   t4.setText(Integer.toString(d));
   if(ae.getSource()==clear)
   {
    t1.setText("");
    t2.setText("");
    t3.setText("");
    t4.setText("");
    t1.requestFocus();
   }
  }
}    