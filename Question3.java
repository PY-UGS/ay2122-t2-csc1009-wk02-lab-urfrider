
public class Question3 {

	public static void main(String[] args) {
		long totalMilliseconds = System.currentTimeMillis();
		long totalSeconds = totalMilliseconds / 1000;
		long seconds = totalSeconds % 60;
		long totalMinutes = totalSeconds / 60;
		long minutes = totalMinutes % 60;
		long totalHours = totalMinutes / 60;
		long hours = totalHours % 24;

		System.out.println("Current time is " + hours + ":" + minutes + ":" + seconds + " GMT");
	}

}
