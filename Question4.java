import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = sc.nextInt();
		int zodiac = year % 12;
		
		switch(zodiac) {
			case 0:
				System.out.println("monkey");
				break;
			case 1:
				System.out.println("rooster");
				break;
			case 2:
				System.out.println("dog");
				break;
			case 3:
				System.out.println("pig");
				break;
			case 4:
				System.out.println("rat");
				break;
			case 5:
				System.out.println("ox");
				break;
			case 6:
				System.out.println("tiger");
				break;
			case 7:
				System.out.println("rabbit");
				break;
			case 8:
				System.out.println("dragon");
				break;
			case 9:
				System.out.println("snake");
				break;
			case 10:
				System.out.println("horse");
				break;
			case 11:
				System.out.println("sheep");
				break;
		}
		sc.close();

	}

}
