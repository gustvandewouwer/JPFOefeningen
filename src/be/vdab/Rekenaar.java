package be.vdab;

public class Rekenaar {
    private String tekst;
    private int totaal;
    public Rekenaar(String input) {
        tekst = input;
        totaal = berekenen(input);
    }
    public void setTekst(String input) {
        tekst = input;
        totaal = berekenen(input);
    }
    //Het is belangrijk dat de status van het object in zijn geheel blijft kloppen.
//Wanneer de string-expressie wijzigt, wijzigt ook het resultaat van de berekening,
//daarom wordt meteen na het setten van de string tekst het totaal berekend.
    public String getTekst() {
        return tekst;
    }
    public int getTotaal() {
        return totaal;
    }
    private int berekenen(String expressie) {
        String[] delen = expressie.split(" ");
//in geval van een lege expressie bevat de array delen slechts 1 element,
//nl. een lege string: ""
// eerste cijfer in totaal zetten om te sommeren
        if (!delen[0].equals(""))
            totaal=Integer.parseInt(delen[0]);
        else
            totaal=0;
        int i=1;
        while (i < delen.length) {
            char bewerkingsTeken = delen[i].charAt(0);
            i++;
            if (i < delen.length) {
                int getal = Integer.parseInt(delen[i]);
                voerUit(bewerkingsTeken, getal);
                i++;
            }
        }
        return totaal;
    }
    private void voerUit(char bewTeken, int getal) {
        switch (bewTeken) {
            case '+':
                totaal += getal; break;
            case '-':
                totaal -= getal; break;
            case '*':
                totaal *= getal; break;
            case '/':
                if (getal != 0) {
                    totaal /= getal;}
                break;
            default:
                break;
        }
    }
    @Override
    public String toString() {
        return tekst + ";" + totaal;
    }
}