package employee.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Splash extends JFrame implements ActionListener {

   
    
    Splash(){
        
         getContentPane().setBackground(Color.WHITE);
         setLayout(null);
       
        
        JLabel heading = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
        heading.setBounds(80, 30, 1200, 60);
        heading.setFont(new Font("algerian", Font.PLAIN, 60));
        heading.setForeground(Color.BLACK);
        add(heading);
      //front image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/splash.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1175, 650, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1150, 650);
        add(image);
        
        JButton clickhere = new JButton("CLICK HERE TO CONTINUE");
        clickhere.setBounds(415, 525, 330, 50);
        clickhere.setFont(new Font("SERIF", Font.BOLD, 20));
        clickhere.setBackground(Color.BLACK);
      // clickhere.setContentAreaFilled(false);
        clickhere.setForeground(Color.white);
        clickhere.addActionListener(this);
        image.add(clickhere);
       
        setSize(1150, 650);
        setLocation(110,25);
        setVisible(true);
        
        while (true){
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
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
    }
    
    public static void main(String args[]){
        new Splash();
        
    }
}
