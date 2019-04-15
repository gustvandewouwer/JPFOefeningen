package be.vdab;

public class Bankrekeningnummer {
    public static void main(String[] args) {
// long bankreknr = 823445816730L; //OK
        long bankreknr = 237824199569L; //OK
// long bankreknr = 662431212859L; //OK
// long bankreknr = 737524091952L; //OK
// long bankreknr = 111224444891L; //niet OK
// long bankreknr = 777553241844L; //niet OK
        long bankreknrEerste10 = bankreknr / 100;
        System.out.println(bankreknrEerste10);
        int bankreknrLaatste2 = (int) (bankreknr % 100);
        System.out.println(bankreknrLaatste2);
        int rest = (int) (bankreknrEerste10 % 97);
        System.out.println("BankrekeningNr: " + bankreknr);
        System.out.println("rest van de deling door 97: " + rest);
        System.out.println("laatste 2 cijfers: " + bankreknrLaatste2 );
    }
}