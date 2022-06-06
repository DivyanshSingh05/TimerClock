import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyWindow extends JFrame {

    private JLabel heading;         //JLabel is a class of java Swing . JLabel is used to display a short string or an image icon. JLabel can display text, image or both
    private JLabel clockLabel;
    private Font font = new Font("", Font.BOLD, 35);        //To create an object of the Font class, use its constructor Font().

    MyWindow() {     //constructor
        super.setTitle("My Clock");         //to set the title
        super.setSize(600, 400);        // setsize() method makes the rectangular area (For eg: 400pixels X 400 pixels)
        super.setLocation(300, 50);         //To change the position of JFrame on the screen. The upper left corner of your screen is (0,0). If you give NULL as parameter to JFrame.
        this.CreateGUI();
        super.setVisible(true);
    }

    public void CreateGUI() {
        heading = new JLabel("My Clock");
        clockLabel = new JLabel("Clock");
        heading.setFont(font);
        clockLabel.setFont(font);
        this.startClock();
        this.setLayout(new GridLayout(2,1));
        this.add(heading);
        this.add(clockLabel);
    }

    public void startClock() {
        Timer timer = new Timer(1000, new ActionListener() {            //A Swing timer(an instance of javax.swing.Timer) fires one or more action events after a specified delay.
            @Override
            public void actionPerformed(ActionEvent e) {
                //    String dateTime = new Date().toString();

                String dateTime = new Date().toLocaleString();
                clockLabel.setText(dateTime);
            }
        });
        timer.start();
    }
}