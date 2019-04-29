package be.vdab.lambda;

import javax.swing.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

class VensterToArray extends JFrame {

    private static final long serialVersionUID = 1L;
    private static final Path STERRENBEELDEN_PATH = Paths.get("/data/sterrenbeelden.txt");

    VensterToArray() {
        super("Sterrenbeelden");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JList<String> listSterrenbeelden;
        try (Stream<String> stream = Files.lines(STERRENBEELDEN_PATH)) {
            listSterrenbeelden = new JList<>(
                    stream.sorted()
                            .toArray(aantalElementen -> new String[aantalElementen]));
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Kan sterrenbeelden niet lezen");
            listSterrenbeelden = new JList<>();
        }
        add(new JScrollPane(listSterrenbeelden));
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
}
class ToArrayMain {
    public static void main(String[] args) {
        new VensterToArray().setVisible(true);
    }
}