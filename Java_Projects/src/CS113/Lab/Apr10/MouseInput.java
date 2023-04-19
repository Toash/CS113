package CS113.Lab.Apr10;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseInput implements MouseListener {

    CountDown countdown;
    // Get references to stop timer etc...
    public MouseInput(CountDown countdown){
        this.countdown = countdown;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //Check if the clock is ticking, if so, stop

        System.out.println("Clicked");

        if(countdown.isCountingDown()){
            countdown.stop();
        } else{
            countdown.resetCountdown();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
