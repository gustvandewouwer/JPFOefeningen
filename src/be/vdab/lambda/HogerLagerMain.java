package be.vdab.lambda;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

class HogerLager extends JFrame {
    private static final long serialVersionUID = 1L;
    private final int teRadenGetal = new Random().nextInt(10) + 1;
    private final JTextField textField = new JTextField();
    private final JButton button = new JButton("gok");
    private int beurten;

    HogerLager() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(textField, BorderLayout.NORTH);
        add(button, BorderLayout.SOUTH);

        button.addActionListener(event -> gok());

        pack();
    }

    private void gok() {
        beurten++;
        try {
            int getal = Integer.parseInt(textField.getText());
            if (getal == teRadenGetal) {
                JOptionPane.showMessageDialog(this,
                        "Gevonden in " + beurten + " beurt(en)");
            } else {
                JOptionPane.showMessageDialog(this,
                        getal > teRadenGetal ? "Lager" : "Hoger");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Tik een getal");
        }
    }
}

public class HogerLagerMain {
    public static void main(String[] args) {
        new HogerLager().setVisible(true);
    }
}