package CS113.Lab.Apr10;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        //meh
        CountDown countDown = new CountDown();

        //Create the frame and add the panel
        countDown.init();

        // Start the timer
        countDown.start();


    }
}
