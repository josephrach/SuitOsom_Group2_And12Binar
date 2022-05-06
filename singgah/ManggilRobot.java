public class ManggilRobot extends Robot {
    private String modelName = "Bumblebee";

    public static void main(String[] args) {
        ManggilRobot myRobot = new ManggilRobot();
        myRobot.boom();
        System.out.println(myRobot.modelRobot + " " + myRobot.modelName);
    }
}
