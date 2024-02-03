import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Login extends JFrame{
    Login(){
            setSize(900, 400);
            setLocation(350, 200);
            setLayout(null);//this is done to create our own layout and hence we are telling swing ki bhai hum khud hi apna layout design krre hain

            getContentPane().setBackground(Color.WHITE);



            JPanel p1=new JPanel(new GridBagLayout());
            p1.setBackground(new Color(131, 193, 233));//swing by default use border layout here initially we are not using any layout so our background color has been filled thoroughly in the pannel.
            p1.setBounds(0, 0, 400, 400);

            add(p1);

            JPanel p2=new JPanel();
            p2.setLayout(null);
            p2.setBounds(400, 30, 450, 300);

            JLabel username=new JLabel("UserName");
            username.setBounds(60, 20, 100, 25);
            username.setFont(new Font("SAN_SARIF", Font.PLAIN, 20));
            p2.add(username);
            JTextField tfusername =new JTextField();
            tfusername.setBounds(60, 50, 300, 30);
            tfusername.setBorder(BorderFactory.createEmptyBorder());
            p2.add(tfusername);
            add(p2);

            JLabel password=new JLabel("Password");
            password.setBounds(60, 90, 100, 25);
            password.setFont(new Font("SAN_SARIF", Font.PLAIN, 20));
            p2.add(password);
            JTextField tfpassword =new JTextField();
            tfpassword.setBounds(60, 120 , 300, 30);
            tfpassword.setBorder(BorderFactory.createEmptyBorder());
            p2.add(tfpassword);
            add(p2);

            JButton login=new JButton("Login");
            login.setBounds(60, 170, 100, 30);
            login.setBackground(Color.LIGHT_GRAY);
            login.setForeground(Color.WHITE);
            login.setBorder(new LineBorder(Color.LIGHT_GRAY));
            p2.add(login);

            JButton signup=new JButton("Signup");
            signup.setBounds(200, 170, 100, 30);
            signup.setBackground(Color.LIGHT_GRAY);
            signup.setForeground(Color.WHITE);
            signup.setBorder(new LineBorder(Color.LIGHT_GRAY));
            p2.add(signup);

            JButton forgetps=new JButton("Forget Password");
            forgetps.setBackground(Color.LIGHT_GRAY);
            forgetps.setBounds(130, 220, 110, 30);
            forgetps.setForeground(Color.WHITE);
            forgetps.setBorder(new LineBorder(Color.LIGHT_GRAY));
            p2.add(forgetps);

            JLabel text=new JLabel("Trouble logging in...");
            text.setBounds(270, 220, 150, 25);
            text.setFont(Font.getFont("ITALIAN"));
            text.setForeground(Color.black);
            p2.add(text);

            ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons travel/icons/login.png"));
            Image i2= i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
            ImageIcon i3=new ImageIcon(i2);
            JLabel image=new JLabel(i3);

            GridBagConstraints gbc = new GridBagConstraints();
            gbc.gridx = 0;
            gbc.gridy = 0;
            p1.add(image, gbc);

            setVisible(true);
    }
    public static void main(String[] args)
    {
        new Login();
    }
}
