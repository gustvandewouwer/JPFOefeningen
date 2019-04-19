package be.vdab.herhaling;

public class PacmanMain {
    public static void main(String[] args) {
        Doolhof doolhof = new Doolhof();
        Pacman pacman = new Pacman();
        doolhof.add(pacman);
        Monster inky = new Monster("inky");
        doolhof.add(inky);
        Monster pinky = new Monster("pinky");
        doolhof.add(pinky);
        Monster blinky = new Monster("blinky");
        doolhof.add(blinky);
        Monster clyde = new Monster("clyde");
        doolhof.add(clyde);
        System.out.println(doolhof); // pacman 3 leven(s), inky, pinky, blinky, clyde
        blinky.meet(pacman);
        System.out.println(doolhof); // pacman 2 leven(s), inky, pinky, blinky, clyde
        pacman.eatPowerPill();
        pacman.meet(inky);
        clyde.meet(pacman);
        System.out.println(doolhof); // pacman 2 leven(s), pinky, blinky
        pacman.powerPillWorkedOut();
    }
}
