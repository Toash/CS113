package CS113.Lab.Apr10;// **********************************************************
// CountDown.java
//
// Draws a digital display that counts down from 10. The
// display can be stopped or reset with a mouse click.
// **********************************************************
import CS113.Lab.Apr10.DigitalDisplay;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CountDown extends JApplet
{

    // Add this to the timer
    public class CountListener implements ActionListener {
        private javax.swing.Timer timer;
        private CountDownPanel panel;
        private DigitalDisplay display;
        public CountListener(Timer timer, CountDownPanel panel, DigitalDisplay display){

            this.timer = timer;
            this.panel = panel;
            this.display = display;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            display.decrement(); //decrements the display
            if(display.getVal()<=0){

                //Stop timer
                timer.stop();

                // Reset the timer

            } else{
                panel.paintComponent(frame.getGraphics());
            }
        }
    }
    private DigitalDisplay display;


    //Time between countdowns in ms
    private final int DELAY = 350;

    //The timer that ticks down
    private javax.swing.Timer timer;

    // The frame to run the application
    public static JFrame frame;

    // ---------------------------------------------------------
// Initialize the applet, including the animation.
// ---------------------------------------------------------
    public void init()
    {
        // Displays graphics for clock
        CountDownPanel countDownPanel = new CountDownPanel(timer);


        // What to display on the clock
        display = countDownPanel.getDisplay();
        timer = new Timer (DELAY, new CountListener(timer,countDownPanel,display));

        // Create a frame to put the panel on
        frame = new JFrame("Clock Countdown");

        // Add components to frame

        frame.add(countDownPanel);
        frame.addMouseListener(new MouseInput(this));


        frame.pack();
        frame.setVisible(true);
    }
    // ---------------------------------------------------------
// Start the animation when the applet is started.
// ---------------------------------------------------------
    public void start()
    {
        timer.start();
    }
    // ---------------------------------------------------------
// Stop the animation when the applet is stopped.
// ---------------------------------------------------------
    public void stop()
    {
        timer.stop();
    }

    public boolean isCountingDown(){
        return this.timer.isRunning();
    }

    public void resetCountdown(){
        this.display.reset(10);
    }
}