import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

public class AddCustomer extends JFrame implements ActionListener {
    JLabel lblusername, labelname;
    JComboBox comboid;
    JRadioButton gfemale, gmale;
    JButton back, add;
    JTextField tfnumber, tfcountry, tfaddress, tfemail, tfphone;

    String username;
    AddCustomer(String username)
    {
        setBounds(450, 200, 650, 550);
        setLayout(null);

        JLabel username1=new JLabel("UserName");
        username1.setBounds(30, 50, 150, 25);
        add(username1);

        JLabel lblid=new JLabel("Valid Id");
        lblid.setBounds(30, 90, 150, 25);
        add(lblid);

        comboid=new JComboBox(new String[]{"Passport", "Aadhar Card", "PAN card"});
        comboid.setBounds(100, 90, 150, 25);
        comboid.setBackground(Color.WHITE);
        add(comboid);

        JLabel lblnum=new JLabel("Number");
        lblnum.setBounds(30, 130, 150, 25);
        add(lblnum);

        tfnumber=new JTextField();
        tfnumber.setBounds(100, 130, 150, 25);
        add(tfnumber);

        JLabel lblname=new JLabel("Name");
        lblname.setBounds(30,170,150,25);
        add(lblname);

        lblusername=new JLabel();
        lblusername.setBounds(110, 50, 150, 25);
        add(lblusername);

        labelname=new JLabel();
        labelname.setBounds(100,170,150,25);
        add(labelname);//uneditable

        JLabel lblgender=new JLabel("Gender");
        lblgender.setBounds(30, 210, 150,25);
        add(lblgender);

        gfemale=new JRadioButton("Female");
        gfemale.setBounds(100, 210, 70, 25);
        gfemale.setBackground(Color.WHITE);
        add(gfemale);

        gmale=new JRadioButton("Male");
        gmale.setBounds(180, 210, 70, 25);
        gmale.setBackground(Color.WHITE);
        add(gmale);//initially buttons are independent so bith the buttons are beign selected.

        ButtonGroup bg=new ButtonGroup();
        //grouping the buttons so that we can select only one button at a time.
        bg.add(gmale);
        bg.add(gfemale);

        JLabel lblcountry=new JLabel("Country");
        lblcountry.setBounds(30,250, 150,25);
        add(lblcountry);

        tfcountry=new JTextField();
        tfcountry.setBounds(100, 250, 150, 25);
        add(tfcountry);

        JLabel lbladdress=new JLabel("Address");
        lbladdress.setBounds(30, 290, 150, 25);
        add(lbladdress);

        tfaddress=new JTextField();
        tfaddress.setBounds(100,290,150,25);
        add(tfaddress);

        JLabel lblphone=new JLabel("Phone Number");
        lblphone.setBounds(30,330, 150,25);
        add(lblphone);

        tfphone=new JTextField();
        tfphone.setBounds(120, 330, 150, 25);
        add(tfphone);

        JLabel lblemail=new JLabel("Email");
        lblemail.setBounds(30, 370, 150, 25);
        add(lblemail);

        tfemail=new JTextField();
        tfemail.setBounds(100,370,150,25);
        add(tfemail);

        add=new JButton("Add");
        add.setBackground(Color.black);
        add.setForeground(Color.white);
        add.setBounds(50,430,100,25);
        add.addActionListener(this);
        add(add);

        back=new JButton("Back");
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.setBounds(180,430,100,25);
        back.addActionListener(this);
        add(back);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons travel/icons/newcustomer.jpg"));
        Image i2=i1.getImage().getScaledInstance(400, 500, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(320,40,300,420);
        add(image);

        try{
            Connectitvity c=new Connectitvity();
            ResultSet rs=c.s.executeQuery("select * from account where username= 'Isha'");
            while(rs.next()){
                lblusername.setText(rs.getString("username"));
                labelname.setText(rs.getString("name"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == add) {
            String id = (String) comboid.getSelectedItem();
            String username=lblusername.getText();
            String number = tfnumber.getText();
            String name = labelname.getText();
            String gender = null;
            if (gmale.isSelected()) {
                gender = "Male";
            } else {
                gender = "Female";
            }
            String country = tfcountry.getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();

            try {
                Connectitvity c = new Connectitvity();
                String query = "INSERT INTO customer (username, id, number, name, gender, country, address, phone, email) VALUES ('" + username + "', '" + id + "', '" + number + "', '" + name + "', '" + gender + "', '" + country + "', '" + address + "', '" + phone + "','" + email + "')";

                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Customer details added successfully");

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (ae.getSource() == back) {
            setVisible(false);
        }

        setVisible(false);
    }
    public static void main(String[] args)
    {
        new AddCustomer("");
    }
}
