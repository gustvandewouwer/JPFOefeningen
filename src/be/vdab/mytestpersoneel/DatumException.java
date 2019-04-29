package be.vdab.mytestpersoneel;

public class DatumException extends Exception {
//    private int dag;
//    private int maand;
//    private int jaar;

    public DatumException() {}
    public DatumException(String omschrijving) {
        super(omschrijving);
    }

//    public DatumException(String message, int dag, int maand, int jaar) {
//        super(message);
//        this.dag = dag;
//        this.maand = maand;
//        this.jaar = jaar;
//    }
//
//    public String getExceptionData() {
//        return "dag: " + dag +
//                " maand: " + maand +
//                " jaar: " + jaar;
//    }
}
