public class WolfTest {
	
	public static void main(String[] argv) {
		Wolf wolfFem = new Wolf();
		wolfFem.sex = "female";
		wolfFem.name = "Brash";
		wolfFem.weight = 14.5f;
		wolfFem.age = 4;
		wolfFem.coloring = "brown";
		System.out.println("It is " + wolfFem.sex);
		System.out.println("Its name is " + wolfFem.name);
		System.out.println("Its weight is " + wolfFem.weight);
		System.out.println("Its is " + wolfFem.age + " years old");
		System.out.println("Its color is " + wolfFem.coloring);
		System.out.println(wolfFem.name + " " + wolfFem.sit());
		System.out.println("Is " + wolfFem.name + " howling? " + wolfFem.howl());
		System.out.println(wolfFem.name + " " + wolfFem.hunt());
	}
	
}