package innovotics.tayna;

import java.util.Scanner;

public class CollatzSequence {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int step = 0;
		int num = reader.nextInt();
		System.out.print(num + " ");
		do 
		{
			if (num % 2 == 0)
			{
				num = num/2;
				System.out.print(num + " ");
				step++;
			}
			else
			{
				num = (3 * num) + 1;
				System.out.print(num + " ");
				step++;
			}
		}
		while(num != 1);
		System.out.println();
		System.out.println("Completed after " + step + " steps");
	}

}