public class JaegerConstructorTest {

    public static void main(String[] argv) {
        JaegerConstructor robo279 = new JaegerConstructor("Striker Eureka", "Mark-5", "Australia", "TY/Escape Hatch", "XIG Supercell Chamber", 76.2f, 1.850f, 10, 9, 11);
        JaegerConstructor robo895 = new JaegerConstructor("Crimson Typhoon", "Mark-4", "China", "28-Go/Cockpit", "Midnight Orb 9", 76.2f, 1.722f, 9, 6, 7);
        robo279.printInfo();
        robo895.printInfo();
    }
}
