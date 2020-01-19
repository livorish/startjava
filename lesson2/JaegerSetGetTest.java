public class JaegerSetGetTest {

    public static void main(String[] argv) {
        JaegerGetSet robo279 = new JaegerGetSet();
        robo279.setModelName("Striker Eureka");
        robo279.setMark("Mark-5");
        robo279.setOrigin("Australia");
        robo279.setEquipment("TY/Escape Hatch");
        robo279.setHeight(1.850f);
        robo279.setWeight(76.2f);
        robo279.setArmor(9);
        robo279.setEnergyCore("XIG Supercell Chamber");
        robo279.setKaijuKilled(11);
        robo279.setSpeed(3);
        System.out.println(robo279.toString());

        JaegerGetSet robo895 = new JaegerGetSet();
        robo895.setModelName("Crimson Typhoon");
        robo895.setMark("Mark-4");
        robo895.setOrigin("China");
        robo895.setEquipment("28-Go/Cockpit");
        robo895.setHeight(1.722f);
        robo895.setWeight(76.2f);
        robo895.setArmor(6);
        robo895.setEnergyCore("Midnight Orb 9[3]");
        robo895.setKaijuKilled(7);
        robo895.setSpeed(3);
        robo895.setSpeed(6);
        System.out.println(robo895.toString());
    }
}
