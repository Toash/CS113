package CS113.Lab.Apr10;//        Clocks are a standard thing to animate—they change at regular intervals. In this exercise, you will write an
//        applet that displays a simple “clock” that just counts down from 10. The clock will be a DigitalDisplay object.
//        The file DigitalDisplay.java contains the code for the class. The file CountDown.java contains the program and
//        CountDownPanel.java contains a skeleton for the panel for the animation. Copy these files to your directory,
//        compile and run the program. It should just display the clock with the number 10. Now do the following to
//        make the clock count down, stop when it hits 0, and reset to 10 if the user clicks the mouse.
//        1. Add an inner class named CountListener that implements ActionListener. In actionPerformed,
//          Decrement the clock value. To do this use the decrement method in the DigitalDisplay class. (Look at
//          its signature to see how to use it.)
//          If the display value of the clock is negative, stop the timer; otherwise repaint the panel.
//        2. In the constructor, set up the timer.
//        3. Compile and run the program to see if it works.
//        4. Now add code to let a mouse click have some control over the clock. In particular, if the clock is running
//          when the mouse is clicked the clock should be stopped (stop the timer). If the clock is not running, it should
//          be reset to 10 and started. To add the ability of the panel to respond to mouse clicks, do the following:
//          Add an inner class that implements the MouseListener interface. In mouseClicked, if the timer is
//          running, stop it; otherwise reset the clock to 10 (there is a method in the DigitalDisplay class to do
//          this), start the timer, and repaint the applet. The bodies of the other methods in the MouseListener interface will be empty.
//          Add a second parameter of type JApplet to the constructor for CountDownPanel. In your constructor,
//          add the mouse listener to the applet.
//          Modify the program CountDown.java to send the applet (this) as the second parameter for the
//          CountDownPanel constructor.
//        5. Compile and run the program to make sure everything works right.

//***************************************************
// DigitalDisplay.java
//
// A simple rectangular display of a single number
//***************************************************

//GUI
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;

public class DigitalDisplay
{


    private int displayVal; // value to be displayed
    private int x, y; // position
    private int width, height; // size
    private Font displayFont; // font for the number
    // ---------------------------------------------------------
// construct a DigitalDisplay object with the given values
// and New Century Schoolbook font in 40 point bold
// ---------------------------------------------------------
    public DigitalDisplay(int start, int x, int y, int w, int h)
    {
        this.x = x;
        this.y = y;
        width = w;
        height = h;
        displayVal = start;
        displayFont = new Font ("New Century Schoolbook", Font.BOLD, 40);
    }
    // ----------------------------
// decrement the display value
// ----------------------------
    public void decrement()
    {
        displayVal--;
    }
    // ----------------------------
// increment the display value
// ----------------------------
    public void increment()
    {
        displayVal++;
    }
    // ----------------------------
// return the display value
// ----------------------------
    public int getVal()
    {
        return displayVal;
    }
    // ------------------------------------------------------
// reset the display value to that given in the parameter
// ------------------------------------------------------
    public void reset (int val)
    {
        displayVal = val;
    }
    // ----------------
// draw the display
// ----------------
    public void draw (Graphics page)
    {
// draw a black border
        page.setColor (Color.black);
        page.fillRect (x, y, width, height);
// a white inside
        page.setColor (Color.white);
        page.fillRect (x + 5, y + 5, width - 10, height - 10);
// display the number centered
        page.setColor (Color.black);
        page.setFont (displayFont);
        int fontHeight = page.getFontMetrics().getHeight();
        int strWidth = page.getFontMetrics().stringWidth(""+displayVal);
        page.drawString (""+displayVal, x + width/2 - strWidth/2,
                y + fontHeight/2 + height/2);
    }
}