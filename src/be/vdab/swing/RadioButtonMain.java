package be.vdab.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class RadioButtonMain extends JFrame {
    private static final long serialVersionUID = 1L;
    private final JTextField textField = new JTextField(50);
    private final JRadioButton radioHoofdLetters = new JRadioButton("Hoofdletters");
    private final JRadioButton radioKleineLetters = new JRadioButton("Kleine letters");

    public RadioButtonMain() {
        super("Letters");
        add(textField);
        JPanel panelSouth = new JPanel(new GridLayout(2, 1));
        panelSouth.add(radioHoofdLetters);
        panelSouth.add(radioKleineLetters);
        radioHoofdLetters.setSelected(true);
        ButtonGroup groupHoofdOfKleineLetters = new ButtonGroup();
        groupHoofdOfKleineLetters.add(radioHoofdLetters);
        groupHoofdOfKleineLetters.add(radioKleineLetters);
        add(panelSouth, BorderLayout.SOUTH);
        textField.addKeyListener(new HoofdLetterListener());

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
    }

    private class HoofdLetterListener extends KeyAdapter {
        @Override
        public void keyTyped(KeyEvent event) {
            if (radioHoofdLetters.isSelected()) {
                event.setKeyChar(Character.toUpperCase(event.getKeyChar()));
            } else {
                event.setKeyChar(Character.toLowerCase(event.getKeyChar()));
            }
        }
    }

    public static void main(String[] args) {
        new RadioButtonMain().setVisible(true);
    }

}
