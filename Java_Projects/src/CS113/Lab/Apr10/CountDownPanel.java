package CS113.Lab.Apr10;// **********************************************************
// CountDownPanel.java
//
// Panel for a digital display that counts down from 10.
// The display can be stopped or reset with a mouse click.
// **********************************************************
import CS113.Lab.Apr10.DigitalDisplay;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CountDownPanel extends JPanel
{
    public class CountListener implements ActionListener {
        public java.util.Timer timer;
        public CountListener(){
            timer = new java.util.Timer();
        }

        @Override
        public void actionPerformed(ActionEvent e) {

            clock.decrement();

            if(clock.getVal()<0){

                //Stop timer
                //timer.stop();

            } else{
                System.out.println("Testing");
                paintComponent(f.getGraphics());
            }
        }
    }
    private final int WIDTH = 600;
    private final int HEIGHT = 400;
    private final int DISPLAY_WIDTH = 150;
    private final int DISPLAY_HEIGHT = 100;
    private final int DELAY = 1;
    private final int COUNT_START = 10;
    private DigitalDisplay clock;
    private Timer timer;

    public static JFrame f;
    // --------------------------------------------------------
// Set up the applet.
// --------------------------------------------------------
    public CountDownPanel (Timer countdown)
    {
// Set up the timer
        timer = new Timer(DELAY,new CountListener());
        //clock = new DigitalDisplay(10,400,300,800,600);

        f = new JFrame("panel");
        f.add(this);

        setBackground (Color.blue);
        setPreferredSize (new Dimension (WIDTH, HEIGHT));
        clock = new DigitalDisplay(COUNT_START, WIDTH/2 - DISPLAY_WIDTH,
                HEIGHT/2 - DISPLAY_HEIGHT,
                DISPLAY_WIDTH, DISPLAY_HEIGHT);

        f.show();
        //timer.addActionListener(new CountListener());
    }
    // --------------------
// draw the clock
// --------------------
    public void paintComponent (Graphics page)
    {
        super.paintComponent (page);
        clock.draw(page);
    }
}