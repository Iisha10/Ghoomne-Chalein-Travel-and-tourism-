import javafx.scene.layout.Border;

import javax.swing.*;
import java.awt.*;

public class Signup extends JFrame {
    Signup() {
        // setBounds is the combination of setSize and setLocation
        setBounds(350, 200, 900, 360);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);


        JPanel p1 = new JPanel();
        p1.setBackground(new Color(133, 193, 233));
        p1.setBounds(0, 0, 500, 400);
        p1.setLayout(null);
        add(p1);

        JLabel username = new JLabel("UserName");
        username.setFont(new Font("Tahoma", Font.BOLD, 14));
        username.setBounds(50, 20, 125, 25);
        p1.add(username);

        JTextField tfusername = new JTextField();
        tfusername.setBounds(170, 20, 200, 25);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfusername);

        JLabel name = new JLabel("Name");
        name.setFont(new Font("Tahoma", Font.BOLD, 14));
        name.setBounds(50, 60, 125, 25);
        p1.add(name);

        JTextField tfname = new JTextField();
        tfname.setBounds(170, 60, 200, 25);
        tfname.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfname);

        JLabel pswd = new JLabel("Password");
        pswd.setFont(new Font("Tahoma", Font.BOLD, 14));
        pswd.setBounds(50, 100, 125, 25);
        p1.add(pswd);

        JTextField tfpswd = new JTextField();
        tfpswd.setBounds(170, 100, 200, 25);
        tfpswd.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfpswd);

        JLabel security = new JLabel("Security Question");
        security.setFont(new Font("Tahoma", Font.BOLD, 14));
        security.setBounds(50, 140, 125, 25);
        p1.add(security);

        Choice secure=new Choice();//Choice is a class to provide us labels
        secure.add("Dog's Name");
        secure.add("Favorite singer");
        secure.add("Favorite Car");
        secure.add("Favorite Destination");
        secure.setBounds(180,140, 200, 30);
        p1.add(secure);

        JLabel ans = new JLabel("Answer");
        ans.setFont(new Font("Tahoma", Font.BOLD, 14));
        ans.setBounds(50, 180, 125, 25);
        p1.add(ans);

        JTextField tfans=new JTextField();
        tfans.setBounds(170, 180, 205, 25);
        tfans.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfans);

        JButton create=new JButton("Create");
        create.setBackground(Color.LIGHT_GRAY);
        create.setForeground(Color.black);
        create.setFont(new Font("Tahoma", Font.BOLD, 14));
        create.setBounds(80, 250, 100,30);
        p1.add(create);

        JButton back=new JButton("Back");
        back.setBackground(Color.LIGHT_GRAY);
        back.setForeground(Color.black);
        back.setFont(new Font("Tahoma", Font.BOLD, 14));
        back.setBounds(250, 250, 100,30);
        p1.add(back);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons travel/icons/signup.png"));
        Image i2= i1.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(580, 50, 250,250);
        add(image);


        p1.requestFocusInWindow();
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Signup());
    }
}
