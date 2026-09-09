package homework.day1;

public class Robot {
    String name;
    Battery robotEnergy  = new Battery();

    static int moveEnergy = 2 ;
    static int runEnergy = 5 ;

    void move() {
        robotEnergy.consume(Robot.moveEnergy);
    }

    void run() {
        robotEnergy.consume(Robot.runEnergy);
    }

}
