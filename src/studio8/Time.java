package studio8;

import java.util.Objects;

public class Time {

	private int hour;
	private int minute;
	private boolean isMilitaryTime;
	
	
	/**
	 * Constructor for time
	 * 
	 * @param hour int between 0 and 23
	 * @param minute int between 0 and 59
	 */
	public Time(int hour, int minute) {
		this.hour = hour;
		this.minute = minute;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(hour, minute);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && minute == other.minute;
	}

	public String toString() {
		int newHour = this.hour;
		if(!isMilitaryTime && newHour > 12) {
			newHour = newHour - 12;
		}
		return newHour + ":" + this.minute;
	}
	
	public static void main(String[] args) {
		Time t1 = new Time(12, 12);
    }

}