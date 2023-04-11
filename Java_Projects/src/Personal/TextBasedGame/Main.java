package Personal.TextBasedGame;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        JLabel label = new JLabel();
        label.setText("Test text");

        JFrame frame = new JFrame();
        frame.setTitle("Text Based Adventure Game");
        frame.getContentPane().setBackground(Color.WHITE); // Content Pane holds the components
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        // Adding component
        frame.add(label);

        frame.setVisible(true);
    }

}
