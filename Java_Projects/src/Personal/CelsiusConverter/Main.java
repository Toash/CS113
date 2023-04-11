package Personal.CelsiusConverter;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static JButton button;
    public static JTextField text;
    public static JLabel outputLabel;
    public static double FahToCel(double fah){
        return ((fah-32.0)*5)/9.0;
    }

    public static void main(String[] args) {
        // Frame
        JFrame frame = new JFrame("Celsius Converter");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //Create JPanel
        JPanel panel = new JPanel();
        // Layout manager decides how components will be displayed
        panel.setLayout(new BoxLayout(panel,BoxLayout.PAGE_AXIS));
        // Use set preferred size when layout manager is present
        panel.setPreferredSize(new Dimension(200,100));

        // Components
        text = new JTextField();
        button = new JButton("Convert");
        JLabel inputLabel = new JLabel("Enter Fahrenheit");
        outputLabel = new JLabel("Converted Celsius: ");

        button.addActionListener(new ButtonFunctionality());

        // Add components to panel
        panel.add(inputLabel);
        panel.add(text);
        panel.add(button);
        panel.add(outputLabel);
        frame.add(panel);

        // Update frame
        frame.pack();
        frame.setVisible(true);


    }

}
