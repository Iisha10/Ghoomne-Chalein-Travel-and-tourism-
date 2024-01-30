import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame implements Runnable {
    Thread thread;
    Splash (){
//        defining size of frame
//        setSize(1200, 600);
//        setLocation(200, 100);
        // multiple threading in java is allowed with interfaces not with classes
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons travel/icons/splash.jpg"));
        Image i2= i1.getImage().getScaledInstance(1200, 600, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);//we cannot directly place the i2 in JLabel i.e image class ke object ko directly Jlabel mei nahi daal sakte
        JLabel image=new JLabel(i3);
        add(image);
        setVisible(true);//the frame will be visbile to us once this is set to true
        thread= new Thread(this);
        thread.start();



    }
    public void run(){
        try{
            Thread.sleep(5000);
//            new login();
            setVisible(false);
        }catch(Exception e){}
    }
    public static void main(String[] args)
    {
        Splash frame =new Splash();
        int x=1;
        for(int i=1; i<=500; x+=7,  i+=6)
        {

            frame.setLocation(750-(x)/2, 400-(i/2));
            frame.setSize(x+i, i);
            try{
                Thread.sleep(10);
            }catch(Exception e){}
        }
    }

}
