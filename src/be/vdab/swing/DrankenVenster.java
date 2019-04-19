package be.vdab.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrankenVenster extends JFrame {
    private static final long serialVersionUID = 1L;
    private final DefaultListModel<String> modelDranken = new DefaultListModel<>();
    private final JList<String> listDranken = new JList<>(modelDranken);

    public DrankenVenster() {
        super("Dranken");

        add(new JScrollPane(listDranken), BorderLayout.WEST);

        JPanel panelKnoppen = new JPanel(new GridLayout(4, 1));
        JButton buttonToevoegen = new JButton("toevoegen");
        panelKnoppen.add(buttonToevoegen);
        buttonToevoegen.addActionListener(new ToevoegenListener());

        JButton buttonVerwijderen = new JButton("verwijderen");
        panelKnoppen.add(buttonVerwijderen);
        buttonVerwijderen.addActionListener(new VerwijderListener());

        add(panelKnoppen, BorderLayout.EAST);

        pack();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private class ToevoegenListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            String nieuweDrank
                    = JOptionPane.showInputDialog(DrankenVenster.this, "Drank:");
            if (nieuweDrank != null && !nieuweDrank.trim().isEmpty()) {
                modelDranken.addElement(nieuweDrank);
            }
        }
    }

    private class VerwijderListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            if (listDranken.getSelectedIndex() != -1) {
                modelDranken.remove(listDranken.getSelectedIndex());
            }
        }
    }

    public static void main(String[] args) {
        new DrankenVenster().setVisible(true);
    }

}
