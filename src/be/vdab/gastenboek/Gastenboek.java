package be.vdab.gastenboek;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Gastenboek implements Serializable {
    private static final long serialVersionUID = 1L;

    private final List<GastenboekEntry> entries = new ArrayList<>();

    public void toevoegen(GastenboekEntry gastenboekEntry) {
        entries.add(gastenboekEntry);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int index = entries.size() - 1; index >= 0; index--) {
            builder.append(entries.get(index));
            builder.append("\n");
        }
        return builder.toString();
    }
}