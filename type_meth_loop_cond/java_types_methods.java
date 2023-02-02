package type_meth_loop_cond;
import java.util.ArrayList;

public class java_types_methods {
	public static void main(String[] args) {

	/*  primitive types  */
	int a = 8;
	char b = 'y';
	long c = 1991;
	double d = 6.8;

	/* objects */
	String name = "Emily";
	System.out.println(name.toUpperCase());

	ArrayList<Integer> e = new ArrayList<Integer>();

	/* call methods */
		/* internal */
	addExclamationPoint(name);

	String sentence = addPeriod(b + " " + name);
	System.out.println(sentence);

		/* external */
	Animal f = new Animal();
	String dog = f.iAmDog();
	System.out.println(dog);

	Loops_Conditions g = new Loops_Conditions();
	g.doStuff();

	}

	/* methods */
	public static void addExclamationPoint(String s) {
		System.out.println(s + "!");
	}

	public static String addPeriod(String s) {
		return s + ".";
	}

}
