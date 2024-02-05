package employee.management.system;
import java.awt.*;
import javax.swing.*;



public class Splash1 extends JFrame {
 
    Splash1(){
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/<image name>"));
        Image i2 = i1.getImage().getScaledInstance(1150, 650, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1150, 650);
        add(image);
        
        
        
        setSize(frame size(x -y axis));
        setLocation(frame location(x -y axis);
        setLayout(null);
        setVisible(true);
        
        
        try {
            
            Thread.sleep(5600);
            setVisible(false);
            new Login();
            
        } catch (Exception e){
            e.printStackTrace();
        }
        
        
        
    }
    

    
    
     public static void main(String args[]){
        new Splash1();
        
     }

}
