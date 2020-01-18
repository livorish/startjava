public class JaegerConstructor {

    private String modelName;
    private String mark;
    private String origin;
    private String equipment;
    private String energyCore;
    private float height;
    private float weight;
    private int speed;
    private int armor;
    private int kaijuKilled;

    public JaegerConstructor(String modelName, String mark, String origin,
                  String equipment, String energyCore, float height,
                  float weight, int speed, int armor, int kaijuKilled) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.equipment = equipment;
        this.energyCore = energyCore;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.armor = armor;
        this.kaijuKilled = kaijuKilled;
    }

    boolean drift() {
        System.out.println("Вы вошли в дрифт.");
        return true;
    }

    void move() {
        System.out.println("Вы прошли 5 шаги.");
    }

    String scanKaiju() {
        return "nothing";
    }

    int acceleration() {
        this.speed += 1;
        return this.speed;
    }

    public void printInfo() {
        System.out.println("=> Name of the first robot is: " + this.modelName);
        System.out.println(this.modelName + " has a mark: " + this.mark);
        System.out.println(this.modelName + " was made in " + this.origin);
        System.out.println(this.modelName + " has an equipment: " + this.equipment);
        System.out.println(this.modelName + " has an energyCore: " + this.energyCore);
        System.out.println(this.modelName + " has a speed: " + this.speed);
        System.out.println(this.modelName + " has an armor: " + this.armor);
        System.out.println(this.modelName + " height is " + this.height);
        System.out.println(this.modelName + " weighs is " + this.weight);
        System.out.println(this.modelName + " has a energyCore: " + this.energyCore);
        System.out.println(this.modelName + " killed: " + this.kaijuKilled);
        System.out.println(this.modelName + " accelerated: " + this.acceleration());
        System.out.println("*-*-*-*-*-*-**-*-*-*-*-*-**-*-*-*-*-*-**-*-*-*-*-*-*");
    }
}
