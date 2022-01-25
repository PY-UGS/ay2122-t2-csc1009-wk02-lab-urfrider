import java.util.Scanner;

public class Question1 {

	final static double PI = 3.14159;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number for radius: ");
		float radius = sc.nextFloat();
		
		System.out.print("The area for the circle of radius " + radius + "is " + (radius*radius*PI));
		sc.close();

	}

}
