package be.vdab.lambda;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Venster extends JFrame {
    private static final long serialVersionUID = 1L;
    Venster() {
        super("Conversie");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextField textField = new JTextField();
        JButton buttonHoofdLetters = new JButton("hoofdletters");
        JButton buttonKleineLetters = new JButton("kleine letters");

        buttonHoofdLetters.addActionListener(
                e -> textField.setText(textField.getText().toUpperCase()));

        buttonKleineLetters.addActionListener(
                e -> textField.setText(textField.getText().toLowerCase()));

        add(textField, BorderLayout.NORTH);
        add(buttonHoofdLetters, BorderLayout.WEST);
        add(buttonKleineLetters, BorderLayout.EAST);
        pack();
    }
}
class Main {
    public static void main(String[] args) {
        new Venster().setVisible(true);
    }
}

