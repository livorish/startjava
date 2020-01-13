public class Wolf {

    String sex;
    String name;
    float weight;
    int age;
    String coloring;

    void move() {
        System.out.println("идет");
    }

    String sit() {
        return "присела";
    }

    boolean howl() {
        return true;
    }

    String hunt() {
        return "охотится";
    }
}
