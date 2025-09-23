package basics.of.java;
import java.util.*;

class human{
	boolean haveEyes;
	String color;
	boolean haveHands;
	
	human(boolean e, String c, boolean h){
		this.color = c;
		this.haveEyes = e;
		this.haveHands =h;
	}
}

public class DemoJava {

	public static void main(String[] args) {
		
		human obj = new human(true,"White",false);
		System.out.println(obj.color);
		System.out.println(obj.haveEyes);
		System.out.println(obj.haveHands);
		System.out.println("Hi");
	}

}
