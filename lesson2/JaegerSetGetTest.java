public class JaegerSetGetTest {

    public static void main(String[] argv) {
        JaegerGetSet robo279 = new JaegerGetSet();
        robo279.setModelName("Striker Eureka");
        robo279.setWeight(1.850f);
        robo279.setArmor(9);
        robo279.setEnergyCore("XIG Supercell Chamber");
        robo279.setKaijuKilled(11);
        robo279.setSpeed(3);
        robo279.printInfo();

        JaegerGetSet robo895 = new JaegerGetSet();
        robo895.setModelName("Crimson Typhoon");
        robo895.setWeight(1.722f);
        robo895.setArmor(6);
        robo279.setEnergyCore("Midnight Orb 9[3]");
        robo895.setKaijuKilled(7);
        robo279.setSpeed(3);
        robo895.setSpeed(6);
        robo895.printInfo();
    }
}
