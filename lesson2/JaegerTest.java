public class JaegerTest {

    public static void main(String[] argv) {
        Jaeger robo279 = new Jaeger();
        Jaeger robo895 = new Jaeger();
        robo279.setModelName("Striker Eureka");
        robo895.setModelName("Crimson Typhoon");
        robo279.setWeight(1.850f);
        robo895.setWeight(1.722f);
        robo279.setArmor(9);
        robo895.setArmor(6);
        robo279.setKaijuKilled(11);
        robo895.setKaijuKilled(7);
        robo279.setSpeed(3);
        robo895.setSpeed(6);

        System.out.println("Name of the first robot is: " + robo279.modelName);
        System.out.println("Name of the second robot is: " + robo895.modelName);
        System.out.println(robo279.modelName + " weighs " + robo279.weight);
        System.out.println(robo895.modelName + " weighs " + robo895.weight);
        System.out.println(robo279.modelName + " killed - " + robo279.kaijuKilled);
        System.out.println(robo895.modelName + " killed - " + robo895.kaijuKilled);
        System.out.println(robo279.modelName + " accelerated: " + robo279.acceleration());
        System.out.println(robo895.modelName + " accelerated: " + robo895.acceleration());
    }
}
