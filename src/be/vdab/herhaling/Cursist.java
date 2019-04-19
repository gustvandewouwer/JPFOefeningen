package be.vdab.herhaling;

public class Cursist extends Persoon {
    private Traject traject;

    public Cursist(String voornaam, String familienaam, Traject traject) {
        super.setVoornaam(voornaam);
        super.setFamilienaam(familienaam);
        this.traject = traject;
    }

    public Cursist() {
    }

    public Traject getTraject() {
        return traject;
    }

    public void setTraject(Traject traject) {
        this.traject = traject;
    }
}
