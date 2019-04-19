package be.vdab.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

public class TemperatuurVenster extends JFrame {
    private static final long serialVersionUID = 1L;
    private final JTextField celciusTextBox = new JTextField();
    private final JLabel labelFahrenheit = new JLabel();

    public TemperatuurVenster() {
        super("Temperatuur conversie");
        setLayout(new GridLayout(3, 2));
        add(new JLabel("Temperatuur in Celcius:"));
        add(celciusTextBox);

        JButton buttonConversie = new JButton("Conversie");
        add(buttonConversie);
        buttonConversie.addActionListener(new ConversieListener());
        add(new JLabel(""));

        add(new JLabel("Temperatuur in Fahrenheit:"));
        add(labelFahrenheit);

        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private class ConversieListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            try {
                BigDecimal celcius = new BigDecimal(celciusTextBox.getText());
                BigDecimal fahrenheit = celcius.multiply(BigDecimal.valueOf(9))
                        .divide(BigDecimal.valueOf(5))
                        .add(BigDecimal.valueOf(32));
                labelFahrenheit.setText(fahrenheit.toString());
            } catch (NumberFormatException ex) {
                labelFahrenheit.setText("Tik een getal");
            }
        }
    }

    public static void main(String[] args) {
        new TemperatuurVenster().setVisible(true);
    }


}
