import jdk.nashorn.internal.runtime.ECMAException;

import javax.swing.*;
import java.awt.*;
public class Loading extends JFrame implements Runnable{
    Thread T;
    JProgressBar bar;
    public void run()
    {
        try{
            for(int i=1; i<=101; i++)
            {
                int max=bar.getMaximum();
                int value=bar.getValue();
                if(value<max)
                {
                    bar.setValue(bar.getValue()+1);
                }
                else
                {
                    setVisible(false);

                }
                Thread.sleep(50);
            }

        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    Loading(){
        T=new Thread(this);
        setBounds(500, 200, 680, 400 );
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel text1=new JLabel("GHOOMNE CHALEIN: Travel and Tourism Application");
        text1.setBounds(100, 20, 600, 35);
        text1.setForeground(Color.BLUE);
        text1.setFont(new Font("Raleway", Font.BOLD, 20));
        add(text1);

         bar=new JProgressBar();
        bar.setBounds(200, 150, 300,30);
        bar.setStringPainted(true);
        add(bar);

        JLabel loading=new JLabel("Loading, please wait...");
        loading.setBounds(210, 200, 600, 20);
        loading.setForeground(Color.BLACK);
        loading.setFont(new Font("Raleway", Font.BOLD, 18));
        add(loading);

        JLabel welcome=new JLabel("Welcome...");
        welcome.setBounds(90, 310, 100, 20);
        welcome.setForeground(Color.BLACK);
        welcome.setFont(new Font("Raleway", Font.BOLD, 18));
        add(welcome);
        T.start();


        setVisible(true);
    }

    public static void main(String[] args)
    {
        new Loading();
    }
}
