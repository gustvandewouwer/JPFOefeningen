package be.vdab.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JCheckBoxMain extends JFrame {

    private static final long serialVersionUID = 1L;
    private final JCheckBox checkBoxZout = new JCheckBox("Zout");
    private final JCheckBox checkBoxSaus = new JCheckBox("Saus");
    private final JButton buttonBestel = new JButton("Bestel");
    private final JLabel labelBestelling = new JLabel();

    public JCheckBoxMain() {
        super("Frietjes");
        setLayout(new GridLayout(4, 1));
        add(checkBoxZout);
        add(checkBoxSaus);
        add(buttonBestel);
        add(labelBestelling);
        setSize(300, 150);
        buttonBestel.addActionListener(new BestelActionListener());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//        pack();
    }

    private class BestelActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            StringBuilder bestelling = new StringBuilder("frietjes");
            if (checkBoxZout.isSelected()) {
                bestelling.append(" met zout");
                if (checkBoxSaus.isSelected()) {
                    bestelling.append(" en saus");
                }
            } else if (checkBoxSaus.isSelected()) {
                bestelling.append(" met saus");
            }
            labelBestelling.setText(bestelling.toString());
        }
    }

    public static void main(String[] args) {
        new JCheckBoxMain().setVisible(true);
    }



}


