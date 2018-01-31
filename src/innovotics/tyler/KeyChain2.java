package innovotics.tyler;

import java.util.Scanner;

public class KeyChain2 {

	public static void main(String[] args) {
		// Variables Declaration
		int humanChoice = 0;
		Scanner reader = new Scanner(System.in);
		int totalKeyChains = 0;
		int modifyKeyChain = 0;
		int complete = 0;
		String name = null;
		int cost = 0;

		// Initialization
		System.out.println("The KeyChain Shop");
		System.out.println("");
		System.out.println("1. Add Keychains to Order");
		System.out.println("2. Remove Keychains from Order");
		System.out.println("3. View Current Order");
		System.out.println("4. Checkout");
		System.out.println("");
		System.out.println("Please enter your choice");
		humanChoice = reader.nextInt();

		// comparison on choice to results
		while (complete != 1) {
			// if person says 1
			if(humanChoice == 1){
				System.out.println("You have " + totalKeyChains + " keychains.  How many to add?");
				modifyKeyChain = reader.nextInt();
				totalKeyChains = addKeyChain(totalKeyChains, modifyKeyChain);
				System.out.println("You now have " + totalKeyChains + " keychains.");
				//if person says 2
			} else if(humanChoice == 2) {
				System.out.println("You have " + totalKeyChains + " keychains.  How many to remove?");
				modifyKeyChain = reader.nextInt();
				totalKeyChains = removeKeyChain(totalKeyChains, modifyKeyChain);
				System.out.println("You now have " + totalKeyChains + " keychains.");
				//if person says 3
			} else if(humanChoice == 3) {
				System.out.println("You have "+ totalKeyChains + " keychains.");
				System.out.println("Keychains cost $10 each.");
				cost = costCalculator(totalKeyChains);
				System.out.println("Total cost is $" + cost + ".");
				// if person says 4
			} else if(humanChoice == 4){
				cost = costCalculator(totalKeyChains);
				System.out.println("");
				System.out.println("CHECKOUT");
				System.out.println("");
				checkout(totalKeyChains, name, cost);
			}
			System.out.println("");
			System.out.println("1. Add Keychains to Order");
			System.out.println("2. Remove Keychains from Order");
			System.out.println("3. View Current Order");
			System.out.println("4. Checkout");
			System.out.println("");
			System.out.println("Please enter your choice");
			humanChoice = reader.nextInt();
			}
		}
			
		
	
	
	//Calculators and Operators
	// add keychains
	public static int addKeyChain(int total, int modifier) {
		int result = total + modifier;
		return result;
	}
	//remove keychains
	public static int removeKeyChain(int total, int modifier){
		int result = total - modifier;
		return result;
	}
	//calculate cost
	public static int costCalculator(int total) {
		int result = total * 10;
		return result;
	}
	//checkout
	public static void checkout(int total, String name, int cost) {
		System.out.println("You have " + total + " keychains.");
		System.out.println("Keychains cost $10 each");
		System.out.println("Total cost is $" + cost + ".");
		System.out.println("Thanks for you order.");
		System.exit(1);
	}
}
