package be.vdab.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;

public class JOptionPaneMain extends JFrame {

    private static final long serialVersionUID = 1L;

    public JOptionPaneMain() {
        super("JOptionPane");
        setLayout(new GridLayout(3, 1));
        JButton buttonTijd = new JButton("Bericht");
        JButton buttonMaximaliseren = new JButton("Bevestiging");
        JButton buttonTitel = new JButton("Vraag");
        add(buttonTijd);
        add(buttonMaximaliseren);
        add(buttonTitel);
        setSize(300, 150);
        buttonTijd.addActionListener(new TijdActionListener());
        buttonMaximaliseren.addActionListener(new MaximaliserenActionListener());
        buttonTitel.addActionListener(new TitelActionListener());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private class TijdActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            // de eerste parameter van showMessageDialog is het venster
            // dat "eigenaar" is van het popup venster dat zal tevoorschijn komen
            JOptionPane.showMessageDialog(JOptionPaneMain.this, "Het is nu " + LocalTime.now(), "Nu", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private class MaximaliserenActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            if (JOptionPane.showConfirmDialog(JOptionPaneMain.this, "Wilt u maximaliseren") == JOptionPane.OK_OPTION) {
                JOptionPaneMain.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            }
        }
    }

    private class TitelActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            String nieuweTitel = JOptionPane.showInputDialog(JOptionPaneMain.this, "Nieuwe titel");
            if (nieuweTitel != null) {
                JOptionPaneMain.this.setTitle(nieuweTitel);
            }
        }
    }

    public static void main(String[] args) {
        new JOptionPaneMain().setVisible(true);
    }

}
