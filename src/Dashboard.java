import javax.swing.*;
import java.awt.*;

import java.awt.event.*;
public class Dashboard extends JFrame implements  ActionListener{

    JButton addpdetails, updatepdetails,  viewdetails, deldetails,checkpackage, bookpackage, viewpackage, viewhotels;
    String username;

    Dashboard(String username)
    {
        this.username=username;
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);

        JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0,0,102));
        p1.setBounds(0,0,2000,65);
        add(p1);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource(("icons travel/icons/dashboard.png")));
        Image i2 = i1.getImage().getScaledInstance(70,70, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel icon=new JLabel(i3);
        icon.setBounds(5,0,70,70);
        p1.add(icon);


        JPanel p2=new JPanel();
        p2.setBackground(new Color(0,0,102));
        p2.setLayout(null);
        p2.setBounds(0,65,300,1000);
        add(p2);




        addpdetails=new JButton("Add personal details");
        addpdetails.setBounds(0,0, 300, 50);
        addpdetails.setBackground(new Color(0,0,102));
        addpdetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        addpdetails.setMargin(new Insets(0, 0, 0, 60));
        addpdetails.setForeground(Color.WHITE);
        addpdetails.addActionListener(this);
        p2.add(addpdetails);

         updatepdetails=new JButton("Update details");
        updatepdetails.setBounds(0,50, 300, 50);
        updatepdetails.setBackground(new Color(0,0,102));
        updatepdetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        updatepdetails.setMargin(new Insets(0, 0, 0, 80));
        updatepdetails.setForeground(Color.WHITE);
        p2.add(updatepdetails);

        viewdetails=new JButton("View details");
        viewdetails.setBounds(0,100, 300, 50);
        viewdetails.setBackground(new Color(0,0,102));
        viewdetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewdetails.setMargin(new Insets(0, 0, 0, 80));
        viewdetails.setForeground(Color.WHITE);
        p2.add(viewdetails);

       deldetails=new JButton("Delete details");
        deldetails.setBounds(0,150, 300, 50);
        deldetails.setBackground(new Color(0,0,102));
        deldetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        deldetails.setMargin(new Insets(0, 0, 0, 80));
        deldetails.setForeground(Color.WHITE);
        p2.add(deldetails);

        checkpackage=new JButton("Check package details");
        checkpackage.setBounds(0,200, 300, 50);
        checkpackage.setBackground(new Color(0,0,102));
        checkpackage.setFont(new Font("Tahoma", Font.PLAIN, 20));
        checkpackage.setMargin(new Insets(0, 0, 0, 30));
        checkpackage.setForeground(Color.WHITE);
        p2.add(checkpackage);

        bookpackage=new JButton("Book package ");
        bookpackage.setBounds(0,250, 300, 50);
        bookpackage.setBackground(new Color(0,0,102));
        bookpackage.setFont(new Font("Tahoma", Font.PLAIN, 20));
        bookpackage.setMargin(new Insets(0, 0, 0, 80));
        bookpackage.setForeground(Color.WHITE);
        p2.add(bookpackage);

        viewpackage=new JButton("View package ");
        viewpackage.setBounds(0,300, 300, 50);
        viewpackage.setBackground(new Color(0,0,102));
        viewpackage.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewpackage.setMargin(new Insets(0, 0, 0, 80));
        viewpackage.setForeground(Color.WHITE);
        p2.add(viewpackage);

         viewhotels=new JButton("View Hotels");
        viewhotels.setBounds(0,350, 300, 50);
        viewhotels.setBackground(new Color(0,0,102));
        viewhotels.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewhotels.setMargin(new Insets(0, 0, 0, 80));
        viewhotels.setForeground(Color.WHITE);
        p2.add(viewhotels);

        JButton bookhotels=new JButton("Book Hotel");
        bookhotels.setBounds(0,400, 300, 50);
        bookhotels.setBackground(new Color(0,0,102));
        bookhotels.setFont(new Font("Tahoma", Font.PLAIN, 20));
        bookhotels.setMargin(new Insets(0, 0, 0, 80));
        bookhotels.setForeground(Color.WHITE);
        p2.add(bookhotels);

        JButton detailhotels=new JButton("View Booked Hotel");
        detailhotels.setBounds(0,450, 300, 50);
        detailhotels.setBackground(new Color(0,0,102));
        detailhotels.setFont(new Font("Tahoma", Font.PLAIN, 20));
        detailhotels.setMargin(new Insets(0, 0, 0, 70));
        detailhotels.setForeground(Color.WHITE);
        p2.add(detailhotels);

        JButton destination=new JButton("Destinations");
        destination.setBounds(0,500, 300, 50);
        destination.setBackground(new Color(0,0,102));
        destination.setFont(new Font("Tahoma", Font.PLAIN, 20));
        destination.setMargin(new Insets(0, 0, 0, 80));
        destination.setForeground(Color.WHITE);
        p2.add(destination);

        JButton payment=new JButton("Payments");
        payment.setBounds(0,550, 300, 50);
        payment.setBackground(new Color(0,0,102));
        payment.setFont(new Font("Tahoma", Font.PLAIN, 20));
        payment.setMargin(new Insets(0, 0, 0, 70));
        payment.setForeground(Color.WHITE);
        p2.add(payment);

        JButton calc=new JButton("Calculate");
        calc.setBounds(0,600, 300, 50);
        calc.setBackground(new Color(0,0,102));
        calc.setFont(new Font("Tahoma", Font.PLAIN, 20));
        calc.setMargin(new Insets(0, 0, 0, 70));
        calc.setForeground(Color.WHITE);
        p2.add(calc);

        JButton note=new JButton("Notepad");
        note.setBounds(0,650, 300, 50);
        note.setBackground(new Color(0,0,102));
        note.setFont(new Font("Tahoma", Font.PLAIN, 20));
        note.setMargin(new Insets(0, 0, 0, 70));
        note.setForeground(Color.WHITE);
        p2.add(note);

        JButton about=new JButton("About");
        about.setBounds(0,700, 300, 50);
        about.setBackground(new Color(0,0,102));
        about.setFont(new Font("Tahoma", Font.PLAIN, 20));
        about.setMargin(new Insets(0, 0, 0, 70));
        about.setForeground(Color.WHITE);
        p2.add(about);

        JLabel thankyou=new JLabel("TRAVEL YOUR HEART OUT...");
        thankyou.setBounds(10, 710, 300, 200);
        thankyou.setForeground(Color.WHITE);
        thankyou.setFont(new Font("Montserrat", Font.ITALIC, 20));
        p2.add(thankyou);

        ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("icons travel/icons/home.jpg"));
        Image i5=i4.getImage().getScaledInstance(1650, 1000, Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        JLabel image=new JLabel(i6);
        image.setBounds(0, 0,2160, 1000);
        add(image);

       JLabel text=new JLabel("Ghoomne Chalein????");
       text.setBounds(810, 70, 1000, 80);
       text.setForeground(Color.black);
       text.setFont(new Font("Source Code Pro", Font.ITALIC, 50));
       image.add(text);




        setVisible(true);
    }
public void actionPerformed(ActionEvent ae)
{
    if(ae.getSource()==addpdetails)
    {
        new AddCustomer(username);
    }
}

    public static void main(String[] args)
    {
        new Dashboard("");
    }
}
