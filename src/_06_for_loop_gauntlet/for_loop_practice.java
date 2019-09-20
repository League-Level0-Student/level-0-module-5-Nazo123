package _06_for_loop_gauntlet;

public class for_loop_practice {

	public static void main(String[] args) {

		for (int i = 0; i < 101; i++) {
			System.out.print(i + " ");
		}
		System.out.println("");
		for (int a = 100; a > -1; a--) {
			System.out.print(a + " ");
		}
		System.out.println(" ");

		for (int e = 2; e < 101; e++) {
			if (e % 2 == 0) {
				System.out.print(e + " ");
			}
		}
		System.out.println(" ");
		System.out.println(" ");
		for (int e = 1; e < 501; e++) {
			if (e % 2 == 0) {
				System.out.println(e + " is even ");
			} else {
				System.out.println(e + " is odd ");
			}

		}
		for (int e = 0; e < 778; e++) {
			if (e % 7 == 0 && e != 0) {
				System.out.print(e + " ");
			}
		}

		System.out.println(" ");
		System.out.println(" ");
		for (int age = 0; age < 13; age++) {

			System.out.println("In "+(age+2006)+" I was "+age+" years old");
		}

		System.out.println(" ");
	int placeholder = 0;
		for(int z=0;z<3;z++) {
		for (int w =0;w<3;w++) {
			System.out.print(placeholder+", ");
			System.out.println(w);
			
			}
		placeholder++;
		}
		System.out.println(" ");

		for (int b = 1; b < 9; b++) {
			System.out.print(b + " ");
			b++;
			System.out.print(b + " ");
			b++;
			System.out.println(b + " ");

		}
		System.out.println(" ");
		System.out.println(" ");
		for (int b = 1; b < 100; b++) {
			System.out.print(b + " ");
			b++;
			System.out.print(b + " ");
			b++;
			System.out.print(b + " ");
			b++;
			System.out.print(b + " ");
			b++;
			System.out.print(b + " ");
			b++;
			System.out.print(b + " ");
			b++;
			System.out.print(b + " ");
			b++;
			System.out.print(b + " ");
			b++;
			System.out.print(b + " ");
			b++;
			System.out.println(b + " ");
		}

		for (int i = 1; i < 7; i++) {
			System.out.println("");
			for (int b = 0; b < i; b++) {
				System.out.print("* ");
			}

		}

	}

}
