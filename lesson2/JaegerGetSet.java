public class JaegerGetSet {

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

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public String getEnergyCore() {
        return energyCore;
    }

    public void setEnergyCore(String energyCore) {
        this.energyCore = energyCore;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getKaijuKilled() {
        return kaijuKilled;
    }

    public void setKaijuKilled(int kaijuKilled) {
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
