package be.vdab.mytestpersoneel;

public class DatumTest {
    public static void main(String[] args) {
        try {
            Datum d1 = new Datum(17, 3, 1961);
            System.out.println(d1);
        } catch (DatumException e) {
            System.out.println(e.getMessage());
        }

        try {
            Datum d1 = new Datum(32, 3, 1961);
            System.out.println(d1);
        } catch (DatumException e) {
            System.out.println(e.getMessage());
        }

        try {
            Datum d1 = new Datum(0, 3, 1961);
            System.out.println(d1);
        } catch (DatumException e) {
            System.out.println(e.getMessage());
        }

        try {
            Datum d1 = new Datum(-1, 3, 1961);
            System.out.println(d1);
        } catch (DatumException e) {
            System.out.println(e.getMessage());
        }

        try {
            Datum d1 = new Datum(15, 15, 1961);
            System.out.println(d1);
        } catch (DatumException e) {
            System.out.println(e.getMessage());
        }

        try {
            Datum d1 = new Datum(15, 0, 1961);
            System.out.println(d1);
        } catch (DatumException e) {
            System.out.println(e.getMessage());
        }

        try {
            Datum d1 = new Datum(15, -3, 1961);
            System.out.println(d1);
        } catch (DatumException e) {
            System.out.println(e.getMessage());
        }

        try {
            Datum d1 = new Datum(15, 3, 1583);
            System.out.println(d1);
        } catch (DatumException e) {
            System.out.println(e.getMessage());
        }

        try {
            Datum d1 = new Datum(15, 3, 1584);
            System.out.println(d1);
        } catch (DatumException e) {
            System.out.println(e.getMessage());
        }

        try {
            Datum d1 = new Datum(15, 3, 4099);
            System.out.println(d1);
        } catch (DatumException e) {
            System.out.println(e.getMessage());
        }

        try {
            Datum d1 = new Datum(15, 3, 4100);
            System.out.println(d1);
        } catch (DatumException e) {
            System.out.println(e.getMessage());
        }

        try {
            Datum d1 = new Datum(31, 2, 1961);
            System.out.println(d1);
        } catch (DatumException e) {
            System.out.println(e.getMessage());
        }

//        try {
//            Datum d1 = new Datum(31, 4, 1961);
//            System.out.println(d1);
//        } catch (DatumException e) {
//            System.out.println(e.getMessage());
//        }
//
//        try {
//            Datum d1 = new Datum(31, 6, 1961);
//            System.out.println(d1);
//        } catch (DatumException e) {
//            System.out.println(e.getMessage());
//        }
//
//        try {
//            Datum d1 = new Datum(31, 9, 1961);
//            System.out.println(d1);
//        } catch (DatumException e) {
//            System.out.println(e.getMessage());
//        }
//
//        try {
//            Datum d1 = new Datum(31, 11, 1961);
//            System.out.println(d1);
//        } catch (DatumException e) {
//            System.out.println(e.getMessage());
//        }



// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//        try {
//            Datum d1 = new Datum(32, 3, 1961);
//            System.out.println(d1);
//        } catch (DatumException e) {
//            System.out.println(e.getMessage());
//        }
//        try {
//            Datum d1 = new Datum(17, 13, 1961);
//            System.out.println(d1);
//        } catch (DatumException e) {
//            System.out.println(e.getMessage());
//        }
//        try {
//            Datum d1 = new Datum(17, 3, 5000);
//            System.out.println(d1);
//        } catch (DatumException e) {
//            System.out.println(e.getMessage());
//        }
//        try {
//            Datum d1 = new Datum(31, 2, 1961);
//            System.out.println(d1);
//        } catch (DatumException e) {
//            System.out.println(e.getMessage());
//        }
        try {
            Datum d1 = new Datum(31, 4, 1961);
            System.out.println(d1);
        } catch (DatumException e) {
            System.out.println(e.getMessage());
        }
        try {
            Datum d1 = new Datum(31, 6, 1961);
            System.out.println(d1);
        } catch (DatumException e) {
            System.out.println(e.getMessage());
        }
        try {
            Datum d1 = new Datum(31, 9, 1961);
            System.out.println(d1);
        } catch (DatumException e) {
            System.out.println(e.getMessage());
        }
        try {
            Datum d1 = new Datum(31, 11, 1961);
            System.out.println(d1);
        } catch (DatumException e) {
            System.out.println(e.getMessage());
        }

        //FEBRUARI
        try {
            Datum d1 = new Datum(28, 2, 2019);
            System.out.println(d1);
        } catch (DatumException e) {
            System.out.println(e.getMessage());
        }
        try {
            Datum d1 = new Datum(29, 2, 2019);
            System.out.println(d1);
        } catch (DatumException e) {
            System.out.println(e.getMessage());
        }
        try {
            Datum d1 = new Datum(30, 2, 1961);
            System.out.println(d1);
        } catch (DatumException e) {
            System.out.println(e.getMessage());
        }
        try {
            Datum d1 = new Datum(31, 2, 1961);
            System.out.println(d1);
        } catch (DatumException e) {
            System.out.println(e.getMessage());
        }
        try {
            Datum d1 = new Datum(29, 2, 2004);
            System.out.println(d1);
        } catch (DatumException e) {
            System.out.println(e.getMessage());
        }
        try {
            Datum d1 = new Datum(29, 2, 2400);
            System.out.println(d1);
        } catch (DatumException e) {
            System.out.println(e.getMessage());
        }
        try {
            Datum d1 = new Datum(29, 2, 2300);
            System.out.println(d1);
        } catch (DatumException e) {
            System.out.println(e.getMessage());
        }
        try {
            Datum d1 = new Datum(29, 2, 2100);
            System.out.println(d1);
        } catch (DatumException e) {
            System.out.println(e.getMessage());
        }

//        try {
            Datum d2 = new Datum();
//            d2.setDag(29);
//            d2.setMaand(3);
//            d2.setJaar(2001);
            System.out.println(d2);
//        } catch (DatumException e) {
//            System.out.println(e.getMessage());
//        }
    }
}
