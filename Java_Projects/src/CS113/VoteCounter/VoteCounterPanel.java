package CS113.VoteCounter;//***********************************************************
// VoteCounterPanel.java
//
// Panel for the GUI that tallies votes for two candidates,
// Joe and Sam.
//***********************************************************

//Justin Ho, Lab partner: Khanh Dang
import java.awt.*;
import java.awt.event.*;
import javax.swing. *;
public class VoteCounterPanel extends JPanel
{
    private int votesForJoe;
    private int votesForSam;
    private JButton joeButton;
    private JButton samButton;
    private JLabel labelJoe;
    private JLabel labelSam;
    private JLabel labelWinning;
//-------------------------------------------------
// Constructor: Sets up the GUI.
//-------------------------------------------------
    public VoteCounterPanel()
    {
        votesForJoe = 0;
        votesForSam = 0;

        joeButton = new JButton("Vote for Joe");
        samButton = new JButton("Vote for Sam");

        joeButton.addActionListener(new VoteButtonListener());
        samButton.addActionListener(new VoteButtonListener());

        labelJoe = new JLabel("Votes for Joe: " + votesForJoe);
        labelSam = new JLabel("Votes for Sam: " + votesForSam);
        labelWinning = new JLabel();

        add(joeButton);
        add(labelJoe);
        add(samButton);
        add(labelSam);
        add(labelWinning);

        setPreferredSize(new Dimension(500, 200));
        setBackground(Color.cyan);
    }
//**************************************************
// Represents a listener for button push (action) events
//**************************************************
    private class VoteButtonListener implements ActionListener
    {
//----------------------------------------------
// Updates the appropriate vote counter when a
// button is pushed for one of the candidates.
//----------------------------------------------
        public void actionPerformed(ActionEvent event)
        {
            if(joeButton == event.getSource()){
                votesForJoe++;
                labelJoe.setText("Votes for Joe: " + votesForJoe);
            }
            else {
                votesForSam++;
                labelSam.setText("Votes for Sam: " + votesForSam);
            }

            if (votesForSam > votesForJoe)
            {
                labelWinning.setText("Sam is winning!");
            }
            else if (votesForSam == votesForJoe){
                labelWinning.setText("They are tied!");
            }
            else{
                labelWinning.setText("Joe is winning!");
            }



        }
    }
}