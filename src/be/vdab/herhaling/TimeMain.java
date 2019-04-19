package be.vdab.herhaling;

public class TimeMain {
    public static void main(String[] args) {
        Time hour1 = new Time(9, 40);
        Time hour2 = new Time(10, 30);
        Time hour3 = hour2.subtract(hour1);
        System.out.println(hour3);
        Time hour4 = hour1.add(hour2);
        System.out.println(hour4);

        Time hour10 = new Time(10, 30);
        Time hour20 = new Time(23, 50);
        Time hour30 = hour10.subtract(hour20);
        System.out.println(hour30);
        Time hour40 = hour10.add(hour20);
        System.out.println(hour40);

    }
}
