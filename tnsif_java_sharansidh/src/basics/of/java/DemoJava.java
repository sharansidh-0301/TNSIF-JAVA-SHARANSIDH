package basics.of.java;

class human{
	String name; 
	String color;
	int age;
	char gender;
	human(String name, String color, int age, char gender ){
		this.color = color ;
		this.name = name ;
		this.age = age;
		this.gender = gender;
	}
}

public class DemoJava {

	public static void main(String[] args) {
		human obj = new human("Sidh","White",22,'M');
		System.out.println(obj.color);
		System.out.println(obj.name);
		System.out.println(obj.gender);
		System.out.println(obj.age);
		System.out.println(obj.gender);
		
	}

}
