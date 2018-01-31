package innovotics.tyler;

import java.util.Scanner;

public class AreaCalculator {

	public static void main(String[] args) {

		// Declare Variables
		int humanChoice = 0;
		int base = 0;
		int height = 0;
		int length = 0;
		int width = 0;
		double radius = 0;
		int sideLength = 0;
		double Pi = 3.14;
		Scanner reader = new Scanner(System.in);

		// Initiation
		System.out.println("Shape Area Calculator");
		System.out.println("");
		System.out.println("1) Triangle");
		System.out.println("2) Rectangle");
		System.out.println("3) Square");
		System.out.println("4) Circle");
		System.out.println("5) Quit");
		System.out.println("Which shape?: ");
		humanChoice = reader.nextInt();

		// Certain Inputs for certain shapes
		switch (humanChoice) {
		case 1: // triangle case
			System.out.println("");
			System.out.println("Base: ");
			base = reader.nextInt();
			System.out.println("Height: ");
			height = reader.nextInt();
			System.out.println("");
			System.out.println("The area is " + area_triangle(base, height));
		case 2: // rectangle
			System.out.println("");
			System.out.println("Length: ");
			length = reader.nextInt();
			System.out.println("Width: ");
			width = reader.nextInt();
			System.out.println("");
			System.out.println("The area is " + area_rectange(length, width));
		case 3:
			System.out.println("");
			System.out.println("Side lengths: ");
			sideLength = reader.nextInt();
			System.out.println("The area is " + area_square(sideLength));
		case 4:
			System.out.println("");
			System.out.println("Radius: ");
			radius = reader.nextDouble();

		case 5:
			System.exit(2);
		default:
		}

	}

	public static double area_circle(int radius) {
		double area = radius * radius;
		return area;

	}

	// area of a triangle calculation
	public static double area_triangle(int base, int height) {
		double area = 0.5 * base * height;
		return area;
	}

	// area of a rectangle calculation
	public static int area_rectange(int length, int width) {
		int area = length * width;
		return area;
	}

	// area of a square
	public static int area_square(int side) {
		int area = side * side;
		return area;
	}

}
