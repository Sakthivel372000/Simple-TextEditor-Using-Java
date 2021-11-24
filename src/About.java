import javax.swing.*;
import java.awt.*;

public class About extends JFrame{

    
    About (){
        setTitle("About Text Pad Application");
        setBounds(100,100,500,400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);
        ImageIcon icon =new ImageIcon(getClass().getResource("icons8-notepad-48.png"));
        setIconImage(icon.getImage());

        JLabel iconLabel= new JLabel(new ImageIcon(getClass().getResource("windows.png")));
        iconLabel.setBounds(150, 40, 400, 80);
        add(iconLabel);

        JLabel l3 = new JLabel ("<html> Text Pad  <br> Conventional Notepad Customised Version<br> All rights reserved <br> Text Pad is s simple text editor for basic text-editing which enables which enables users to create documents</html>");
        l3.setFont(new Font("SAN_SERIF",Font.PLAIN,18));
        l3.setBounds(150,130,500,300);
        add(l3);
    }

    public static void main (String[] args){
         new About().setVisible(true);
    }
}
