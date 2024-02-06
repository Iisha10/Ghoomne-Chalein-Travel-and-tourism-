import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class ForgetPswd extends JFrame implements ActionListener {

    JTextField tfusername, tfname, tfques, tfans, tfpswd;
    JButton search, retrieve, back;
    ForgetPswd()
    {
        setBounds(350, 200, 850, 380);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons travel/icons/forgotpassword.jpg"));
        Image i2=i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(580, 30, 200, 200);
        add(image);


        JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBounds(30,30, 500, 255);
        add(p1);

        JLabel lusername=new JLabel("UserName");
        lusername.setBounds(40, 20 , 100, 25);
        lusername.setFont(new Font("Tahoma", Font.BOLD, 14));
        p1.add(lusername);

        tfusername=new JTextField();
        tfusername.setBounds(140, 20, 150, 25);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfusername);

        search=new JButton("Search");
        search.setBackground(Color.LIGHT_GRAY);
        search.setForeground(Color.white);
        search.setBounds(310, 20, 120, 25);
        search.addActionListener(this);
        p1.add(search);

        JLabel name=new JLabel("Name");
        name.setBounds(40, 60 , 100, 25);
        name.setFont(new Font("Tahoma", Font.BOLD, 14));
        p1.add(name);

        tfname=new JTextField();
        tfname.setBounds(140, 60, 150, 25);
        tfname.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfname);

        JLabel ques=new JLabel("Your Security Question");
        ques.setBounds(40, 100 , 200, 25);
        ques.setFont(new Font("Tahoma", Font.BOLD, 14));
        p1.add(ques);

        tfques=new JTextField();
        tfques.setBounds(210, 100, 150, 25);
        tfques.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfques);

        JLabel ans=new JLabel("Answer");
        ans.setBounds(40, 140 , 150, 25);
        ans.setFont(new Font("Tahoma", Font.BOLD, 14));
        p1.add(ans);

        tfans=new JTextField();
        tfans.setBounds(140, 140, 150, 25);
        tfans.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfans);

        retrieve=new JButton("Retrieve");
        retrieve.setBackground(Color.LIGHT_GRAY);
        retrieve.setForeground(Color.white);
        retrieve.setBounds(310, 140, 120, 25);
        retrieve.addActionListener(this);
        p1.add(retrieve);

        JLabel pswd=new JLabel("Password");
        pswd.setBounds(40, 180 , 100, 25);
        pswd.setFont(new Font("Tahoma", Font.BOLD, 14));
        p1.add(pswd);

        tfpswd=new JTextField();
        tfpswd.setBounds(140, 180, 150, 25);
        tfpswd.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfpswd);

        back=new JButton("Back");
        back.setBackground(Color.LIGHT_GRAY);
        back.setForeground(Color.white);
        back.setBounds(180, 220, 100, 25);
        back.addActionListener(this);
        p1.add(back);

        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==search)
        {
            try{
                String query = "select * from account where username= '" + tfusername.getText() + "'";

                Connectitvity c=new Connectitvity();

                 ResultSet rs=c.s.executeQuery(query);
                 while(rs.next())
                 {
                     tfname.setText(rs.getString("name"));
                     tfques.setText(rs.getString("security"));
                 }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        else if(ae.getSource()==retrieve)
        {
            try{
                String query = "select * from account where answer= '" + tfans.getText() + "' AND username='" + tfusername.getText() + "'";

                Connectitvity c=new Connectitvity();

                ResultSet rs=c.s.executeQuery(query);
                while(rs.next())
                {
                    tfpswd.setText(rs.getString("password"));

                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        else
        {
            setVisible(false);
            new Login();
        }

    }
    public static void main(String[]args)
    {
        new ForgetPswd();
    }
}
