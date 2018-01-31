package innovotics.tyler;

import java.util.Scanner;

public class KeyChain {

	public static void main(String[] args) {
		// Declare Variables
		int humanChoice = 0;
		int complete = 0;
		Scanner reader = new Scanner(System.in);

		// Initialization
		System.out.println("Keychain Shop");
		System.out.println("");
		System.out.println("1. Add Keychains to Order");
		System.out.println("2. Remove Keychains from Order");
		System.out.println("3. View Current Order");
		System.out.println("4. Checkout");
		humanChoice = reader.nextInt();
		System.out.println(humanChoice);

		// Input Organizer
		while (complete != 1) {
			if (humanChoice == 1) {
				System.out.println(add_keychains());
			} else if (humanChoice == 2) {
				System.out.println(remove_keychains());
			} else if (humanChoice == 3) {
				System.out.println(view_order());
			} else if (humanChoice == 4) {
				System.out.println(checkout());
				complete = 1;
				System.exit(1);
			}
			humanChoice = reader.nextInt();
		}
	}

	public static String add_keychains() {
		String choice1 = "ADD KEYCHAINS";
		return choice1;
	}

	public static String remove_keychains() {
		String choice2 = "REMOVE KEYCHAINS";
		return choice2;
	}

	public static String view_order() {
		String choice3 = "VIEW ORDER";
		return choice3;
	}

	public static String checkout() {
		String choice4 = "CHECKOUT";
		return choice4;
	}

}
