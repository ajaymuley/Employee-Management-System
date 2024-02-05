package employee.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Home extends JFrame implements ActionListener{
    
    JButton add, view, update, remove, sign;
    
    Home() {
        
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/<image name>"));
        Image i2 = i1.getImage().getScaledInstance(1150, 750, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1150, 750);
        add(image);
        
       JLabel heading = new JLabel("Employee Management System");
        heading.setBounds(382, 20, 420, 40);
        image.add(heading);
        heading.setFont(new Font("Algerian", Font.PLAIN, 25));
        heading.setForeground(Color.black);
        image.add(heading);
        
         add = new JButton("Add Employee");
        add.setBounds(393, 80, 150, 40);
        add.addActionListener(this);
        image.add(add);
        
         view = new JButton("View Employees");
        view.setBounds(617, 80, 150, 40);
        view.addActionListener(this);
        image.add(view);
        
         update = new JButton("Update Employee");
        update.setBounds(393, 140, 150, 40);
        update.addActionListener(this);
        image.add(update);
        
         remove = new JButton("Remove Employee");
        remove.setBounds(617, 140, 150, 40);
        remove.addActionListener(this);
        image.add(remove);
        
         sign = new JButton("Log Out");
        sign.setBounds(505, 200, 150, 40);
        sign.addActionListener(this);
        image.add(sign);
        
        setSize(1150, 700);
        setLocation(130, 15);
        setVisible(true);
        
    
}
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == add){
            setVisible(false);
            new AddEmployee();
        }else if (ae.getSource() == view){
            setVisible(false);
            new ViewEmployee();
        }else if (ae.getSource() == update){
            setVisible(false);
            new ViewEmployee();
        }else if (ae.getSource() == remove) {
            setVisible(false);
            new RemoveEmployee();
        }else {
            setVisible(false);
            new Login();
        }
    }
public static void main(String[] args){
    new Home();
}
    
}
