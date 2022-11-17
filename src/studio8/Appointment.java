package studio8;

import java.util.LinkedList;
import java.util.Objects;

public class Appointment {
	private Date date;
	private Time time;
	
	public Appointment(Date date, Time time) {
		this.date = date;
		this.time = time;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(date, time);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(date, other.date) && Objects.equals(time, other.time);
	}
	
	public String toString() {
		return this.date.toString() + " at " + this.time.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	Date christmas = new Date(12, 25, 0, true);
		Time t1 = new Time(12, 12);
		Appointment jesusCSection = new Appointment(christmas, t1);
		
		LinkedList<Appointment> calendar = new LinkedList<Appointment>();
		calendar.add(jesusCSection);
		System.out.println(calendar);
	}

}
