package employee.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;


public class UpdateEmployee extends JFrame implements ActionListener{
    
    
    JTextField tfeducation, tffname, tfaddress, tfphone, tfage, tfaadhar, tfemail, tfsalary, tfdesignation;
    JComboBox cbgender;
    JLabel lblempid;
    JButton update, back;
    String empid;
    
    UpdateEmployee(String empid){
        this.empid = empid;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/update.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1150, 770, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1150, 770);
        add(image);

        
//heading
        JLabel heading = new JLabel("Update Employee Detail");
        heading.setBounds(270, 30, 500, 50);
        heading.setFont(new Font("ALGERIAN", Font.BOLD, 25));
        image.add(heading);
        
        JLabel labelempid = new JLabel("Emp ID  :");
        labelempid.setBounds(350, 90, 150, 30);
        labelempid.setFont(new Font("SERIF", Font.PLAIN, 22));
        image.add(labelempid);
        
        lblempid = new JLabel();
        lblempid.setBounds(470, 90, 150, 30);
        lblempid.setFont(new Font ("Serif", Font.PLAIN, 20));
        image.add(lblempid);
        
//name
        JLabel labelname = new JLabel("Name  :");
        labelname.setBounds(50, 150, 150, 30);
        labelname.setFont(new Font("SERIF", Font.PLAIN, 20));
        image.add(labelname);
        
         JLabel lblname = new JLabel();
        lblname.setBounds(200, 150, 150, 30);
        image.add(lblname);
        

//father name
        JLabel labelfname = new JLabel("Father's Name  :");
        labelfname.setBounds(400, 150, 150, 30);
        labelfname.setFont(new Font("SERIF", Font.PLAIN, 20));
        image.add(labelfname);
        
         tffname = new JTextField();
        tffname.setBounds(600, 150, 150, 30);
        image.add(tffname);
        

//dob
        JLabel labeldob = new JLabel("Date Of Birth :");
        labeldob.setBounds(50, 200, 150, 30);
        labeldob.setFont(new Font("SERIF", Font.PLAIN, 20));
        image.add(labeldob);
        
        JLabel lbldob = new JLabel();
        lbldob.setBounds(200, 200, 150, 30);
        image.add(lbldob);
        

//AGE
        JLabel labelage = new JLabel("Age  :");
        labelage.setBounds(400, 200, 150, 30);
        labelage.setFont(new Font("SERIF", Font.PLAIN, 20));
        image.add(labelage);
        
        tfage = new JTextField();
        tfage.setBounds(600, 200, 150, 30);
        image.add(tfage);
        
       
        
        

//address
        JLabel labeladdress = new JLabel("Address  :");
        labeladdress.setBounds(50, 350, 150, 30);
        labeladdress.setFont(new Font("SERIF", Font.PLAIN, 20));
        image.add(labeladdress);
        
         tfaddress = new JTextField();
        tfaddress.setBounds(200, 350, 150, 30);
        image.add(tfaddress);
        

//aadhar
        JLabel labelaadhar = new JLabel("Aadhar No  :");
        labelaadhar.setBounds(400, 350, 150, 30);
        labelaadhar.setFont(new Font("SERIF", Font.PLAIN, 20));
        image.add(labelaadhar);
        
        JLabel lblaadhar = new JLabel();
        lblaadhar.setBounds(600, 350, 150, 30);
        image.add(lblaadhar);
        
//SALARY      
        JLabel labelsalary = new JLabel("Salary  :");
        labelsalary.setBounds(400, 400, 150, 30);
        labelsalary.setFont(new Font("SERIF", Font.PLAIN, 20));
        image.add(labelsalary);
        
        tfsalary = new JTextField();
        tfsalary.setBounds(600, 400, 150, 30);
        image.add(tfsalary);
        
//email
        JLabel labelemail = new JLabel("E-Mail  :");
        labelemail.setBounds(50, 300, 150, 30);
        labelemail.setFont(new Font("SERIF", Font.PLAIN, 20));
        image.add(labelemail);
        
         tfemail = new JTextField();
        tfemail.setBounds(200, 300, 150, 30);
        image.add(tfemail);
        
        
//education
        JLabel labeleducation = new JLabel("Education  :");
        labeleducation.setBounds(400, 300, 150, 30);
        labeleducation.setFont(new Font("SERIF", Font.PLAIN, 20));
        image.add(labeleducation);
        
        tfeducation = new JTextField();
      //ceducation.setBackground(Color.WHITE);
        tfeducation.setBounds(600, 300, 150, 30);
        image.add(tfeducation);



//designation
        JLabel labeldesignation = new JLabel("Designation  :");
        labeldesignation.setBounds(50, 400, 150, 30);
        labeldesignation.setFont(new Font("SERIF", Font.PLAIN, 20));
        image.add(labeldesignation);
        
         tfdesignation = new JTextField();
        tfdesignation.setBounds(200, 400, 150, 30);
        image.add(tfdesignation);
        

//mobile
        JLabel labelphone = new JLabel("Mobile No  :");
        labelphone.setBounds(400, 250, 150, 30);
        labelphone.setFont(new Font("SERIF", Font.PLAIN, 20));
        image.add(labelphone);
        
         tfphone = new JTextField();
        tfphone.setBounds(600, 250, 150, 30);
        image.add(tfphone);
        
  //GENDER      
        JLabel labelgender = new JLabel("Gender  :");
        labelgender.setBounds(50, 250, 150, 30);
        labelgender.setFont(new Font("SERIF", Font.PLAIN, 20));
        image.add(labelgender);
        
       
        JLabel lblgender = new JLabel();
      //ceducation.setBackground(Color.WHITE);
        lblgender.setBounds(200, 250, 150, 30);
        image.add(lblgender);
        
        
        
        try{
            Conn c = new Conn();
            String query = "select * from employee where empid = '"+empid+"'";
            c.s.executeQuery(query);
            ResultSet rs = c.s.executeQuery(query);
            while (rs.next()){
                lblname.setText(rs.getString("name"));
                tffname.setText(rs.getString("fname"));
                lbldob.setText(rs.getString("dob"));
                tfaddress.setText(rs.getString("address"));
                tfsalary.setText(rs.getString("salary"));
                tfphone.setText(rs.getString("phone"));
                tfemail.setText(rs.getString("email"));
                tfeducation.setText(rs.getString("education"));
                tfdesignation.setText(rs.getString("designation"));
                lblaadhar.setText(rs.getString("aadhar"));
                lblempid.setText(rs.getString("empid"));
                tfage.setText(rs.getString("age"));
                lblgender.setText(rs.getString("gender"));
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        
       update = new JButton("Update Details");
       update.setBounds(250, 550, 150, 40);
       update.addActionListener(this);
       update.setBackground(Color.BLACK);
       update.setForeground(Color.WHITE);
       image.add(update);
        
        back = new JButton("Back ");
        back.setBounds(450, 550, 150, 40);
        back.addActionListener(this);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        image.add(back);
        
        
       
        
        
        
        
        
        
        setSize(900, 700);
        setLocation(250, 30);
        setVisible(true);
    
    
    }
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == update){
            String fname = tffname.getText();
            String salary = tfsalary.getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            String education = tfeducation.getText();
            String designation = tfdesignation.getText();
            String age = tfage.getText();
            
            try {
                Conn conn = new Conn();
                String query = " update employee set fname = '"+fname+"', phone = '"+phone+"', age = '"+age+"', email = '"+email+"', address = '"+address+"', education = '"+education+"', designation = '"+designation+"', salary = '"+salary+"' where empid = '"+empid+"'";
                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Details updated successfully");
                setVisible(false);
                new Home();
                
                
            }catch (Exception e) {
                e.printStackTrace();
            } 
            
            
        }else{
            setVisible(false);
            new Home();
        }
        
    }

public static void main (String[] args){
    new UpdateEmployee("");
}    
}
