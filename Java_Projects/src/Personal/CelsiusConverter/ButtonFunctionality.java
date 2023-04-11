package Personal.CelsiusConverter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonFunctionality implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        double fah = Double.parseDouble(Main.text.getText());
        double cel = Main.FahToCel(fah);
        Main.outputLabel.setText("Converted Celsius: " + Double.toString(cel));
    }
}
