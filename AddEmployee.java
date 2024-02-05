package employee.management.system;

import java.awt.*;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;
import java.util.*;
import java.awt.event.*;


public class AddEmployee extends JFrame implements ActionListener{
    
    Random ran = new Random();
    int number = ran.nextInt(99999);
    
    JTextField tfname, tffname, tfaddress, tfphone, tfaadhar, tfemail, tfsalary, tfdesignation, tfage;
    JDateChooser dcdob;
    JComboBox cbeducation, cbgender;
    JLabel lblempid;
    JButton add, back;
    
    AddEmployee(){
        getContentPane().setBackground(Color.<color name>);
        setLayout(null);
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/<image name>"));
        Image i2 = i1.getImage().getScaledInstance(1150, 770, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1150, 770);
        add(image);

        
//heading
        JLabel heading = new JLabel("Add Employee Detail");
        heading.setBounds(320, 30, 500, 50);
        heading.setFont(new Font("ALGERIAN", Font.BOLD, 25));
        image.add(heading);
        
        JLabel labelempid = new JLabel("Emp ID  :");
        labelempid.setBounds(370, 90, 150, 30);
        labelempid.setFont(new Font("SERIF", Font.PLAIN, 22));
        image.add(labelempid);
        
        lblempid = new JLabel("" + number);
        lblempid.setBounds(470, 90, 150, 30);
        lblempid.setFont(new Font ("Serif", Font.PLAIN, 20));
        image.add(lblempid);
        
//name
        JLabel labelname = new JLabel("Name  :");
        labelname.setBounds(50, 150, 150, 30);
        labelname.setFont(new Font("SERIF", Font.PLAIN, 20));
        image.add(labelname);
        
         tfname = new JTextField();
        tfname.setBounds(200, 150, 150, 30);
        image.add(tfname);
        

//father name
        JLabel labelfname = new JLabel("Father's Name  :");
        labelfname.setBounds(400, 150, 150, 30);
        labelfname.setFont(new Font("SERIF", Font.PLAIN, 20));
        image.add(labelfname);
        
         tffname = new JTextField();
        tffname.setBounds(600, 150, 150, 30);
        image.add(tffname);
        

//dob
        JLabel labeldob = new JLabel("Date Of Birth");
        labeldob.setBounds(50, 200, 150, 30);
        labeldob.setFont(new Font("SERIF", Font.PLAIN, 20));
        image.add(labeldob);
        
        dcdob = new JDateChooser();
        dcdob.setBounds(200, 200, 150, 30);
        image.add(dcdob);
        

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
        
        tfaadhar = new JTextField();
        tfaadhar.setBounds(600, 350, 150, 30);
        image.add(tfaadhar);
        
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
        
        String courses[] = { "  <SELECT>", "SSC", "HSC", "BSC", "BA", "B.COM", "BBA", "BCA", "BCS", "BE", "BTech", "MSC", "MA", "M.COM", "MBA", "MCA", "MCS", "ME", "MTech","PHD"};
        cbeducation = new JComboBox(courses);
      //ceducation.setBackground(Color.WHITE);
        cbeducation.setBounds(600, 300, 150, 30);
        image.add(cbeducation);



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
        
       String gender[] = { "  <SELECT>", "MALE", "FEMALE", "OTHER"};
        cbgender = new JComboBox(gender);
      //ceducation.setBackground(Color.WHITE);
        cbgender.setBounds(200, 250, 150, 30);
        image.add(cbgender);
        
        
        
       add = new JButton("Add Details");
       add.setBounds(250, 550, 150, 40);
       add.addActionListener(this);
       add.setBackground(Color.BLACK);
       add.setForeground(Color.WHITE);
       image.add(add);
        
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
        if (ae.getSource() == add){
            String name = tfname.getText();
            String fname = tffname.getText();
            String dob =( (JTextField) dcdob.getDateEditor().getUiComponent()).getText();
            String salary = tfsalary.getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            String education = (String) cbeducation.getSelectedItem();
            String designation = tfdesignation.getText();
            String aadhar = tfaadhar.getText();
            String empid = lblempid.getText();
            String gender = (String) cbgender.getSelectedItem();
            String age = tfage.getText();
            
            try {
                Conn conn = new Conn();
                String query = " insert into employee values('"+empid+"', '"+name+"', '"+fname+"', '"+phone+"', '"+gender+"', '"+age+"','"+dob+"', '"+email+"','"+address+"','"+aadhar+"','"+education+"', '"+designation+"', '"+salary+"')";
                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Details added successfully");
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
    new AddEmployee();
}    
}
