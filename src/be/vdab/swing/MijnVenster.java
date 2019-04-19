package be.vdab.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MijnVenster extends JFrame { // JFrame implementeert Serializable, dus:
    private static final long serialVersionUID = 1L;

    private final static String ZIN = "Hier staat een zin";
    private final JTextField textField = new JTextField(50);

    public MijnVenster() {

//        super("Letters");
//        add(textField);
//        JMenuBar bar = new JMenuBar();
//        setJMenuBar(bar);
//        JMenu menuBewerken = new JMenu("Bewerken");
//        bar.add(menuBewerken);
//        JMenuItem menuHoofdLetters = new JMenuItem("hoofdletters");
//        JMenuItem menuKleineLetters = new JMenuItem("kleine letters");
//        menuBewerken.add(menuHoofdLetters);
//        menuBewerken.add(menuKleineLetters);
//        menuHoofdLetters.addActionListener(new HoofdLetterListener());
//        menuKleineLetters.addActionListener(new KleineLettersListener());
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        pack();

        super("Letters");
        add(textField);
        textField.addKeyListener(new HoofdLetterListener());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
    }

    // een inner class voor hoofdletters
    private class HoofdLetterListener2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            textField.setText(ZIN.toUpperCase());
        }
    }

    // een inner class voor kleine letters
    private class KleineLettersListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            textField.setText(ZIN.toLowerCase());
        }
    }

    public static void main(String[] args) {
        new MijnVenster().setVisible(true);
    }

    private class HoofdLetterListener extends KeyAdapter {
        @Override
        public void keyTyped(KeyEvent event) {
            // iedere ingetikte toets omvormen naar hoofdletters:
            event.setKeyChar(Character.toUpperCase(event.getKeyChar()));
        }
    }
}