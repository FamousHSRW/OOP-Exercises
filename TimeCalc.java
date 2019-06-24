package org.hsrw.ci_2_04_programming;
import java.time.LocalTime;

public class TimeCalc {
	public static void main(String[] argv) {
		System.out.println(argv[0]);
		
		LocalTime a = LocalTime.parse(argv[0]);
		LocalTime b = LocalTime.parse(argv[1]);
		int firstHour =  Integer.parseInt(argv[0].substring(0,2)); 
		int firstMinute = Integer.parseInt(argv[0].substring(3,5));
		int secondHour = Integer.parseInt(argv[1].substring(0,2));
		int secondMinute = Integer.parseInt(argv[1].substring(3,5));
		int firstInSeconds = LocalTime.of(firstHour, firstMinute).toSecondOfDay();
		int secondInSeconds = LocalTime.of(secondHour, secondMinute).toSecondOfDay();	
		int difference;
		
		if(a.isBefore(b)) {
			difference = b.minusSeconds(a.toSecondOfDay()).toSecondOfDay();		
			System.out.println("Difference: " + (secondInSeconds - firstInSeconds));

		} else {
			difference = a.minusSeconds(b.toSecondOfDay()).toSecondOfDay();
			System.out.println("Difference: " + (firstInSeconds - secondInSeconds));

		}
		
	

		System.out.println("Difference: " + difference);
	}
}
