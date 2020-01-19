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
        speed ++;
        return speed;
    }

    public String toString() {
        return modelName + " has a mark: " + mark + ", it was made in " + origin + ", it has an equipment " +
        equipment + ", it has an energyCore " + energyCore + ", it has a speed " + speed +
        ", it has an armor" + armor + ", it height is " + height + ", it weighs is " + weight +
        ", it killed " + kaijuKilled + ", it accelerated " + acceleration();
    }
}
