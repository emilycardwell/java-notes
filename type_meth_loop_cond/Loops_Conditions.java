package type_meth_loop_cond;

public class Loops_Conditions {

	public static void doStuff() {

		/* if/else statements */
		int a = 5;
		if (a == 0) {
			System.out.println("0");
		} else if (a == 1) {
			System.out.println("1");
		} else {
			System.out.println("idk");
		}

		/* for loop */
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.println(i);
			}
		}

		/* while loop */
		while (a < 10) {
			System.out.println("hi!");
			a++;
		}

        /* try/catch */
        try {
            /* code */
        } catch(Exception e) {
            /* error message */
        }

	}

}
