package be.vdab;

public class TestMain {
    public static void main(String[] args) {
        //String tekst = "2";
        //String tekst = "6";
        String tekst = "abc";
        try {
            int[] cijfers = {12, 5, 28, 37};
            System.out.println("Element uit de array: " + cijfers[Integer.parseInt(tekst)]);
            System.out.println("Deze code wordt alleen uitgevoerd" + " wanneer er geen fout optreedt.");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("ArrayIndexOutOfBoundsException: " + ex.getMessage());
        } catch (NumberFormatException ex) {
            System.out.println("NumberFormatException: " + ex.getMessage());
        } catch (RuntimeException ex) {
            System.out.println("RuntimeException: " + ex.getMessage());
        }

        Integer i = new Integer(1);
        verhoog(i);
        System.out.println("i=" + i);
    }

    private static void verhoog(Integer i) {
        i++;
        System.out.println("i=" + i);
    }
}
