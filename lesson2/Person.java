public class Person {

    String sex = "female";
    String name = "Natalya";
    float height = 1.65f;
    int weight = 56;
    int age = 37;

    void move() {
        System.out.println("Я иду");
    }

    String sit() {
        return "Я присела";
    }

    String run() {
        return "Я побежала";
    }

    void speak() {
        System.out.println("Я говорю");
    }

    boolean learnJava() {
        return true;
    }
}
