public class Jaeger {

    String modelName;
    String mark;
    String origin;
    String equipment;
    String energyCore;
    float height;
    float weight;
    int speed;
    int armor;
    int kaijuKilled;

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public void setEnergyCore(String energyCore) {
        this.energyCore = energyCore;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setArmor(int armor) {
        this.armor = armor;
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
        this.speed += 1;
        return this.speed;
    }
}
