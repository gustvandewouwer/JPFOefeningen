package be.vdab.gastenboek;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GastenboekEntry implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    private final LocalDateTime datum = LocalDateTime.now();
    private final String schrijver;
    private final String boodschap;

    public GastenboekEntry(String schrijver, String boodschap) {
        this.schrijver = schrijver;
        this.boodschap = boodschap;
    }

    @Override
    public String toString() {
        return FORMATTER.format(datum) + ":" + schrijver + ":" + boodschap;
    }
}