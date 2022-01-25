import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter three numbers: ");
		float num = sc.nextFloat();
		float num2 = sc.nextFloat();
		float num3 = sc.nextFloat();
		
		float average = (num + num2 + num3) / 3;
		System.out.print("The average of " + num + " " + num2 + " " + num3 + " " + " is " + average);
		sc.close();

	}

}
