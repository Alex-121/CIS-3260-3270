package edu.gsu.cis3270.chapter10;

public class Time {
 
	private int hour;
	private int minutes;
	private int seconds;
	
	public Time() {
		// Obtain the total milliseconds since midnight, Jan 1, 1970
	    long totalMilliseconds = System.currentTimeMillis();

	    // Obtain the total seconds since midnight, Jan 1, 1970
	    long totalSeconds = totalMilliseconds / 1000;

	    // Compute the current second in the minute in the hour
	    seconds = (int) (totalSeconds % 60);

	    // Obtain the total minutes
	    int totalMinutes = (int) (totalSeconds / 60);

	    // Compute the current minute in the hour
	    minutes = totalMinutes % 60;

	    // Obtain the total hours
	    int totalHours = totalMinutes / 60;

	    // Compute the current hour
	    hour = totalHours % 24;	
	}
	
	public Time(long miliseconds) {
		setTime(miliseconds);
	}
	
	public Time(int hour, int min, int sec) {
		this.hour = hour;
		minutes = min;
		seconds = sec;
	}

	public int getHour() {
		return hour;
	}

	public int getMinutes() {
		return minutes;
	}

	public int getSeconds() {
		return seconds;
	}
	
	void setTime(long elapseTime) {
	    // Obtain the total seconds since midnight, Jan 1, 1970
	    long totalSeconds = elapseTime / 1000;

	    // Compute the current second in the minute in the hour
	    seconds = (int) (totalSeconds % 60);

	    // Obtain the total minutes
	    int totalMinutes = (int) (totalSeconds / 60);

	    // Compute the current minute in the hour
	    minutes = totalMinutes % 60;

	    // Obtain the total hours
	    int totalHours = totalMinutes / 60;

	    // Compute the current hour
	    hour = totalHours % 24;	
	}
}
