public class Wolf {
	
	private String sex;
	private String name;
	private float weight;
	private int age;
	private String coloring;
	
	public String getSex() {
		return sex;
	}
	
	public void setSex(String sex) {
		this.sex = sex;
 	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
 	}
	
	public String getWeight() {
		return weight;
	}
	
	public void setWeight(float weight) {
		this.weight = weight;
 	}
	
	public String getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if (age > 8) {
			throw IllegalArgumentException("Unacceptable age"); //System.out.println("Unacceptable age");
		}
		this.age = age;
 	}
	
	public String getColoring() {
		return coloring;
	}
	
	public void setColoring(String color) {
		this.color = color;
 	}
	
	public void move() {
		System.out.println("идет");
    }
	
	public String sit() {
		return "присела";
    }
	
	public boolean howl() {
		return true; 
    }
	
	public String hunt() {
		return "охотится"; 
    }
	
}

public class WolfTest {
	
	public static void main(String[] argv) {
		Wolf wolfFem = new Wolf();
		wolfFem.setName("Brash");
		try {
			wolfFem.setAge(14);
		} catch(e: Exception) {
			println(e.message)
		}
		
		System.out.println("Its name is " + wolfFem.getName());
		System.out.println("Its is " + wolfFem.getAge() + " years old");
	
}
