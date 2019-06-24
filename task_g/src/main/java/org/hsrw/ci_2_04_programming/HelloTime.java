package org.hsrw.ci_2_04_programming;

import java.time.LocalTime;

public class HelloTime {
	private String name;
	private String period;	

	public HelloTime(String name) {
		int hours = LocalTime.now().getHour();

		if(hours < 12) {
			this.period = "Good Morning ";
		}
		else if(hours > 12 && hours < 18) {
			this.period = "Good Afternoon ";
		}
		else {
			this.period = "Good Night ";
		}
		
		this.name = name;
	}

	public String greet() {
		return period + name;
	}	
}
