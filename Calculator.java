/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dhruti
 */
import java.awt.*;
import java.awt.event.*;

public class Calculator extends Frame implements ActionListener {

    String str1 = new String("");
    String str2 = new String("");
    String str3 = new String("");
    TextField t;
    int b = 0;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18;

    Calculator() {
        t = new TextField();
        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");
        b6 = new Button("6");
        b7 = new Button("7");
        b8 = new Button("8");
        b9 = new Button("9");
        b10 = new Button("0");
        b11 = new Button(".");
        b12 = new Button("+");
        b13 = new Button("-");
        b14 = new Button("*");
        b15 = new Button("/");
        b16 = new Button("=");
        b17 = new Button("Clear");
        b18 = new Button("Close");
        add(t);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(b10);
        add(b11);
        add(b12);
        add(b13);
        add(b14);
        add(b15);
        add(b16);
        add(b17);
        add(b18);
        setLayout(null);
        t.setBounds(10, 40, 190, 30);
        b1.setBounds(10, 120, 35, 28);
        b2.setBounds(50, 120, 35, 28);
        b3.setBounds(90, 120, 35, 28);
        b4.setBounds(130, 120, 35, 28);
        b5.setBounds(10, 153, 35, 28);
        b6.setBounds(50, 153, 35, 28);
        b7.setBounds(90, 153, 35, 28);
        b8.setBounds(130, 153, 35, 28);
        b9.setBounds(10, 186, 35, 28);
        b10.setBounds(50, 186, 35, 28);
        b11.setBounds(90, 186, 35, 28);
        b12.setBounds(130, 186, 35, 28);
        b13.setBounds(10, 219, 35, 28);
        b14.setBounds(50, 219, 35, 28);
        b15.setBounds(90, 219, 35, 28);
        b16.setBounds(130, 219, 35, 28);
        b17.setBounds(165, 70, 35, 28);
        b18.setBounds(165, 265, 35, 28);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        b17.addActionListener(this);
        b18.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand() == "+") {
            str2 = ae.getActionCommand();
            t.setText(str2);
            b = 1;
        } else if (ae.getActionCommand() == "-") {
            str2 = ae.getActionCommand();
            t.setText(str2);
        }
            else if(ae.getActionCommand()=="*") 
{ 
str2=ae.getActionCommand(); 
t.setText(str2); 
b=1; 
} 
else if(ae.getActionCommand()=="/") 
{ 
str2=ae.getActionCommand();
t.setText(str2); 
b=1; 
} 
else if(ae.getActionCommand()=="=") 
{ 
int n1=Integer.parseInt(str1); 
int n2=Integer.parseInt(str3); 
int ans=0; 
if(str2=="+") 
ans=n1+n2; 
else if(str2=="-") 
ans=n1-n2; 
else if(str2=="*") 
ans=n1*n2; 
else if(str2=="/") 
ans=n1/n2; 
t.setText(""+ans); 
b=0; 
str1=""; 
str3=""; 
} 
else if(ae.getActionCommand()=="Clear") 
{ 
t.setText(null);
b=0; 
str1=""; 
str3=""; 
} 
else if(ae.getActionCommand()=="Close") 
{ 
System.exit(0); 
} 
else if(b==0) 
{ 
str1=str1+ae.getActionCommand(); 
t.setText(str1); 
} 
else if(b==1) 
{ 
str3=str3+ae.getActionCommand(); 
t.setText(str3); 
}
        } 


    public static void main(String args[]) {
        Calculator oc = new Calculator();
        oc.setBackground(Color.pink);
        oc.setTitle("MyCalculator");
        oc.setBounds(140, 140, 210, 300);
        oc.setVisible(true);
    }
}
