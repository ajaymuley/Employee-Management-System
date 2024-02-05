package employee.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.awt.print.*;

public class Print extends JFrame implements ActionListener{
    
    
    
    
    
    
    JComboBox cbgender;
    JLabel lblempid;
    JButton  back, print;
    String empid;
    
    Print(String empid){
      
        
        this.empid = empid;
       // getContentPane().setBackground(Color.WHITE);
      //  setLayout(null);
       
        
        
        
         
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/print.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1150, 770, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1150, 770);
        add(image);

        
//heading
        JLabel heading = new JLabel("Employee Detail");
        heading.setBounds(275, 30, 500, 50);
        heading.setFont(new Font("ALGERIAN", Font.BOLD, 25));
        image.add(heading);
        
        JLabel labelempid = new JLabel("Emp ID  :");
        labelempid.setBounds(310, 90, 150, 30);
        labelempid.setFont(new Font("SERIF", Font.PLAIN, 22));
        image.add(labelempid);
        
        lblempid = new JLabel();
        lblempid.setBounds(470, 90, 150, 30);
        lblempid.setFont(new Font ("Serif", Font.PLAIN, 20));
        image.add(lblempid);
        
//name
        JLabel labelname = new JLabel("Name  :");
        labelname.setBounds(90, 150, 150, 30);
        labelname.setFont(new Font("SERIF", Font.PLAIN, 20));
        image.add(labelname);
        
         JLabel lblname = new JLabel();
        lblname.setBounds(210, 150, 150, 30);
        image.add(lblname);
        

//father name
        JLabel labelfname = new JLabel("Father's Name :");
        labelfname.setBounds(420, 150, 150, 30);
        labelfname.setFont(new Font("SERIF", Font.PLAIN, 20));
        image.add(labelfname);
        
         JLabel lblfname = new JLabel();
        lblfname.setBounds(600, 150, 150, 30);
        image.add(lblfname);
        

//dob
        JLabel labeldob = new JLabel("Date Of Birth :");
        labeldob.setBounds(90, 200, 150, 30);
        labeldob.setFont(new Font("SERIF", Font.PLAIN, 20));
        image.add(labeldob);
        
        JLabel lbldob = new JLabel();
        lbldob.setBounds(210, 200, 150, 30);
        image.add(lbldob);
        

//AGE
        JLabel labelage = new JLabel("Age  :");
        labelage.setBounds(420, 200, 150, 30);
        labelage.setFont(new Font("SERIF", Font.PLAIN, 20));
        image.add(labelage);
        
        JLabel lblage = new JLabel();
        lblage.setBounds(600, 200, 150, 30);
        image.add(lblage);
        
       
        
        

//address
        JLabel labeladdress = new JLabel("Address  :");
        labeladdress.setBounds(90, 350, 150, 30);
        labeladdress.setFont(new Font("SERIF", Font.PLAIN, 20));
        image.add(labeladdress);
        
        JLabel lbladdress = new JLabel();
        lbladdress.setBounds(210, 350, 150, 30);
        image.add(lbladdress);
        

//aadhar
        JLabel labelaadhar = new JLabel("Aadhar No  :");
        labelaadhar.setBounds(420, 350, 150, 30);
        labelaadhar.setFont(new Font("SERIF", Font.PLAIN, 20));
        image.add(labelaadhar);
        
        JLabel lblaadhar = new JLabel();
        lblaadhar.setBounds(600, 350, 150, 30);
        image.add(lblaadhar);
        
//SALARY      
        JLabel labelsalary = new JLabel("Salary  :");
        labelsalary.setBounds(420, 400, 150, 30);
        labelsalary.setFont(new Font("SERIF", Font.PLAIN, 20));
        image.add(labelsalary);
        
        JLabel lblsalary = new JLabel();
        lblsalary.setBounds(600, 400, 150, 30);
        image.add(lblsalary);
        
//email
        JLabel labelemail = new JLabel("E-Mail  :");
        labelemail.setBounds(90, 300, 150, 30);
        labelemail.setFont(new Font("SERIF", Font.PLAIN, 20));
        image.add(labelemail);
        
        JLabel lblemail = new JLabel();
        lblemail.setBounds(210, 300, 150, 30);
        image.add(lblemail);
        
        
//education
        JLabel labeleducation = new JLabel("Education  :");
        labeleducation.setBounds(420, 300, 150, 30);
        labeleducation.setFont(new Font("SERIF", Font.PLAIN, 20));
        image.add(labeleducation);
        
        JLabel lbleducation = new JLabel();
      //ceducation.setBackground(Color.WHITE);
        lbleducation.setBounds(600, 300, 150, 30);
        image.add(lbleducation);



//designation
        JLabel labeldesignation = new JLabel("Designation  :");
        labeldesignation.setBounds(90, 400, 150, 30);
        labeldesignation.setFont(new Font("SERIF", Font.PLAIN, 20));
        image.add(labeldesignation);
        
        JLabel lbldesignation = new JLabel();
        lbldesignation.setBounds(210, 400, 150, 30);
        image.add(lbldesignation);
        

//mobile
        JLabel labelphone = new JLabel("Mobile No  :");
        labelphone.setBounds(420, 250, 150, 30);
        labelphone.setFont(new Font("SERIF", Font.PLAIN, 20));
        image.add(labelphone);
        
        JLabel lblphone = new JLabel();
        lblphone.setBounds(600, 250, 150, 30);
        image.add(lblphone);
        
  //GENDER      
        JLabel labelgender = new JLabel("Gender  :");
        labelgender.setBounds(90, 250, 150, 30);
        labelgender.setFont(new Font("SERIF", Font.PLAIN, 20));
        image.add(labelgender);
        
       
        JLabel lblgender = new JLabel();
      //ceducation.setBackground(Color.WHITE);
        lblgender.setBounds(210, 250, 150, 30);
        image.add(lblgender);
        
        
        
        try{
            Conn c = new Conn();
            String query = "select * from employee where empid = '"+empid+"'";
            c.s.executeQuery(query);
            ResultSet rs = c.s.executeQuery(query);
            while (rs.next()){
                lblname.setText(rs.getString("name"));
                lblfname.setText(rs.getString("fname"));
                lbldob.setText(rs.getString("dob"));
                lbladdress.setText(rs.getString("address"));
                lblsalary.setText(rs.getString("salary"));
                lblphone.setText(rs.getString("phone"));
                lblemail.setText(rs.getString("email"));
                lbleducation.setText(rs.getString("education"));
                lbldesignation.setText(rs.getString("designation"));
                lblaadhar.setText(rs.getString("aadhar"));
                lblempid.setText(rs.getString("empid"));
                lblage.setText(rs.getString("age"));
                lblgender.setText(rs.getString("gender"));
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        
       
        
        back = new JButton("Back");
        back.setBounds(430, 600, 150, 40);
        back.addActionListener(this);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        image.add(back);
        
        print = new JButton("Print");
       print.setBounds(200, 600, 150, 40);
       print.addActionListener(this);
       print.setBackground(Color.BLACK);
       print.setForeground(Color.WHITE);
       image.add(print);
       
        
        
        
        
        
        
        setSize(800, 700);
        setLocation(285, 30);
        setVisible(true);
    
    
        
        
        
    }
    public void actionPerformed(ActionEvent ae){
      
         PrinterJob printer = PrinterJob.getPrinterJob();
         PageFormat pFormat = printer.defaultPage();
         printer.printDialog();
         
        if  (ae.getSource() == printer){
            
            
            try {
            printer.print();
            } catch (Exception PrintException) {
            }
        }
        else {
            setVisible(false);
            new ViewEmployee();
        }
    }

public static void main (String[] args) {
    new Print("");
    
   
    
         
}    
}
