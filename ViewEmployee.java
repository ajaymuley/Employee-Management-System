package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;

public class ViewEmployee extends JFrame implements ActionListener{
    
    
    
    JTable table;
    JButton back, search, print, update;
    Choice cemployeeid;
    
    ViewEmployee() {
        
             
        
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        
        
        JLabel searchlbl = new JLabel("Search By Employee ID :");
        searchlbl.setBounds(20, 20, 150, 20);
        add(searchlbl);
        
        cemployeeid = new Choice();
        cemployeeid.setBounds(180, 20, 150, 20);
        add(cemployeeid);
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/view background.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1150, 770, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1150, 770);
        add(image);
        
        
     /*   JLabel heading = new JLabel("EMPLOYEE DETAILS");
        heading.setBounds(300, 0, 900, 60);
        heading.setFont(new Font("algerian", Font.PLAIN, 30));
        heading.setForeground(Color.BLACK);
        add(heading);
       */ 
        table = new JTable();
        
        
         try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("Select * from employee");
            
            while(rs.next()){
                cemployeeid.add(rs.getString("empid"));
            }
        } catch (Exception e) {
            e.printStackTrace();
            
        }
        
         
         
        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("Select * from employee");
            table.setModel(DbUtils.resultSetToTableModel(rs));
            
            while(rs.next()){
                cemployeeid.add(rs.getString("empid"));
            }
        } catch (Exception e) {
            e.printStackTrace();
            
        }
        
        search = new JButton("Search");
        search.setBounds(170, 60, 80, 20);
       // search.setContentAreaFilled(false);
        search.addActionListener(this);
        image.add(search);
        
        print = new JButton("Print");
        print.setBounds(345, 500, 80, 35);
        print.addActionListener(this);
        image.add(print);
        
        update = new JButton("Update");
        update.setBounds(260, 60, 80, 20);
        update.addActionListener(this);
        image.add(update);
        
        
        back = new JButton("Back");
        back.setBounds(475, 500, 80, 35);
        back.addActionListener(this);
        image.add(back);
        
        
        JScrollPane jsp = new JScrollPane(table);
        jsp.setBounds(0, 100, 900, 500);
        image.add(jsp);
    
    setSize(900, 600);
    setLocation(250, 100);
    setVisible(true);
                
    }
    
   public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == search){
            String query = "select * from employee where empID = '"+cemployeeid.getSelectedItem()+"'";
            try {
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(query);
                table.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (Exception e) {
                e.printStackTrace();
                
            }
        }else if (ae.getSource() == print){
           setVisible(false);
            new Print(cemployeeid.getSelectedItem());
           
        }else if (ae.getSource() == update){
            setVisible(false);
            new UpdateEmployee(cemployeeid.getSelectedItem());
            
        }else 
        {
            setVisible(false);
            new Home();
        }
    }
   
    public static void main(String[] args) {
    new ViewEmployee();
    }
}
