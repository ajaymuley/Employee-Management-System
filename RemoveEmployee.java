package employee.management.system;


import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;

public class RemoveEmployee extends JFrame implements ActionListener {
    
    Choice cempid;
    JButton delete,back;
    
    RemoveEmployee() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/update.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 600, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 600);
        add(image);
         
        
        
        
        
        JLabel labelempid = new JLabel("Employee ID :");
        labelempid.setBounds(330, 100, 100, 30);
       // labelempid.setForeground(Color.WHITE);
        image.add(labelempid);
        
        cempid = new Choice();
        cempid.setBounds(435, 100, 120, 30);
        image.add(cempid);
        
        try{
            Conn c = new Conn();
            String query = "select * from employee";
            ResultSet rs = c.s.executeQuery(query);
            while(rs.next()) {
                cempid.add(rs.getString("empid"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
        JLabel labelname = new JLabel("Name :");
        labelname.setBounds(330, 150, 100, 30);
       // labelname.setForeground(Color.red);
        image.add(labelname);
        
        JLabel lblname = new JLabel();
        lblname.setBounds(435, 150, 100, 30);
       // lblname.setForeground(Color.red);
        image.add(lblname);
        
        JLabel labelphone = new JLabel("Mobile No :");
        labelphone.setBounds(330, 200, 100, 30);
        //labelphone.setForeground(Color.red);
        
        image.add(labelphone);
        
        JLabel lblphone = new JLabel();
        lblphone.setBounds(435, 200, 100, 30);
       // lblphone.setForeground(Color.red);
        image.add(lblphone);
        
        JLabel labelemail = new JLabel("Email ID :");
        labelemail.setBounds(330, 250, 100, 30);
       // labelemail.setForeground(Color.black);
        image.add(labelemail);
        
        JLabel lblemail = new JLabel();
        lblemail.setBounds(435, 250, 120, 30);
       // lblemail.setForeground(Color.black);
        image.add(lblemail);
        
        
        try{
            Conn c = new Conn();
            String query = "select * from employee where empid = '"+cempid.getSelectedItem()+"'";
            ResultSet rs = c.s.executeQuery(query);
            while(rs.next()) {
                lblname.setText(rs.getString("name"));
                lblphone.setText(rs.getString("phone"));
                lblemail.setText(rs.getString("email"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        cempid.addItemListener(new ItemListener() {
        public void itemStateChanged(ItemEvent ie){
            try{
            Conn c = new Conn();
            String query = "select * from employee where empid = '"+cempid.getSelectedItem()+"'";
            ResultSet rs = c.s.executeQuery(query);
            while(rs.next()) {
                lblname.setText(rs.getString("name"));
                lblphone.setText(rs.getString("phone"));
                lblemail.setText(rs.getString("email"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        }
        });
        delete = new JButton("Delete");
        delete.setBounds(320, 350, 100, 30);
        delete.setBackground(Color.BLACK);
        delete.setForeground(Color.WHITE);
        delete.addActionListener(this);
        image.add(delete);
        
                
        back = new JButton("Back");
        back.setBounds(445, 350, 100, 30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        image.add(back);
        
        
        
        
        setSize(900, 600);
        setLocation(250, 60);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == delete){
            try {
                Conn c = new Conn();
                String query = "delete from employee where empid = '"+cempid.getSelectedItem()+"'";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Employee Information Deleted Successfully");
                setVisible(false);
                new Home();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            setVisible(false);
            new Home();
        }
    }
    
    
    public static void main(String[] args){
        new RemoveEmployee();
    }
}
