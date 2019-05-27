import java.time.LocalTime;

public class HelloTime {
	public static void main(String[] argv) {
		int hours = LocalTime.now().getHour();
		System.out.println(hours);
		String name = System.console().readLine();
		if(hours < 12) {
			System.out.println("Good Morning " + name);
		}
		else if(hours > 12 && hours < 18) {
			System.out.println("Good Afternoon " + name);
		}
		else {
			System.out.println("Good Night " + name);
		}
	}
}
