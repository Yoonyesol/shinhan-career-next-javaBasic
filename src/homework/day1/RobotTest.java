package homework.day1;

public class RobotTest {
    public static void main(String[] args) {
        Battery battery = new Battery();
        battery.charge(200);

        Robot robot = new Robot();
        robot.robotEnergy = battery;

        robot.move();
        robot.run();

        System.out.println(robot.robotEnergy.battery);
    }
}