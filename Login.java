package employee.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener {
   
    JTextField tfusername, tfpassword;
    
    Login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("WELCOME BACK!");
        heading.setBounds(257, 35, 1200 , 60);
        heading.setFont(new Font("algerian", Font.PLAIN, 30));
        heading.setForeground(Color.WHITE);
        add(heading);
        
        JLabel lbllogin = new JLabel("Please enter your login details");
        lbllogin.setBounds(275, 90, 200, 30);
        lbllogin.setFont(new Font("SERIF", Font.BOLD, 15));
        lbllogin.setForeground(Color.WHITE);
        add(lbllogin);
                
        
        JLabel lblusername = new JLabel("Username :");
        lblusername.setBounds(275, 140, 100, 30);
        lblusername.setFont(new Font("SERIF", Font.BOLD, 15));
        lblusername.setForeground(Color.WHITE);
        add(lblusername);
        
        tfusername = new JTextField();
        tfusername.setBounds(275, 170, 200, 30);
        add(tfusername);
        
        
        JLabel lblpassword = new JLabel("Password :");
        lblpassword.setBounds(275, 200, 100, 30);
        lblpassword.setFont(new Font("SERIF", Font.BOLD, 15));
        lblpassword.setForeground(Color.WHITE);
        add(lblpassword);
        
        tfpassword = new JTextField();
        tfpassword.setBounds(275, 230, 200, 30);
        add(tfpassword);
        
        JButton login = new JButton("LOGIN");
        login.setBounds(275, 290, 200, 30);
        login.setFont(new Font("SERIF", Font.BOLD, 22));
        login.setBackground(Color.BLACK);
        //button transperent backgound
       // login.setContentAreaFilled(false);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/<image name>"));
        Image i2 = i1.getImage().getScaledInstance(750, 450, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 750, 450);
        add(image);
        
        
        setSize(750, 420);
        setLocation(310, 150);
        setVisible(true);
        
     /*  while (true){
            heading.setVisible(false);
            try
            {
                Thread.sleep(500);
            }catch (Exception e)
            {
                
            }
            heading.setVisible(true);
             try
             {
                Thread.sleep(500);
            }
             catch (Exception e)
             {
                
            }
        }
       */
        
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
     try{
        String username = tfusername.getText();
        String password = tfpassword.getText();
       
        Conn c = new Conn();
//mysql connectivity
        String query = "select * from login where username = '"+username+"' and password = '"+password+"'";
       
        ResultSet rs = c.s.executeQuery(query);
        if (rs.next()){
            setVisible(false);
            new Home();
        }else{
            JOptionPane.showMessageDialog(null, "Invalid Username or Password");
            setVisible(false);
        }
       }catch (Exception e){
        e.printStackTrace();
    }
    }
    
    public static void main(String[] args){
        new Login();
    }
}
