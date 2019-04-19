package be.vdab.swing;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

class Land {
    private final String naam;
    private final String hoofdstad;

    public Land(String naam, String hoofdstad) {
        this.naam = naam;
        this.hoofdstad = hoofdstad;
    }

    @Override
    public String toString() {
        return naam;
    }

    public String getHoofdstad() {
        return hoofdstad;
    }
}

public class JListMain extends JFrame {
    private static final long serialVersionUID = 1L;
    private final Land[] landen = new Land[]{new Land("België", "Brussel"), new Land("Nederland", "Amsterdam")};
    private final JList<Land> listLanden = new JList<>(landen);
    private final JLabel labelHoofdstad = new JLabel();

    public JListMain() {
        super("Landen");
        add(new JScrollPane(listLanden));
        add(labelHoofdstad, BorderLayout.SOUTH);
        pack();
        listLanden.addListSelectionListener(new LandenSelectionListener());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private class LandenSelectionListener implements ListSelectionListener {
        @Override
        public void valueChanged(ListSelectionEvent event) {
            // de method valueChanged wordt meerdere keren opgeroepen
            // als de gebruiker een land selecteert.
            // getValueIsAdjusting bevat false bij de laatste oproep uit de reeks
            if (event.getValueIsAdjusting() == false) {
                labelHoofdstad.setText(listLanden.getSelectedValue().getHoofdstad());
            }
        }
    }

    public static void main(String[] args) {
        new JListMain().setVisible(true);
    }
}
