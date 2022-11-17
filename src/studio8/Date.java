package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {
	
	private int month;
	private int day;
	private int year;
	private boolean isHoliday;
	
	
	/**
	 * 
	 * Constructor that sets Date.java variables
	 * 
	 * @param month an int between 1 and 12
	 * @param day an int between 1 and 31
	 * @param year an int describing year
	 * @param isHoliday describes whether the date is a holiday
	 */
	public Date(int month, int day, int year, boolean isHoliday) {
		this.month = month;
		this.day = day;
		this.year = year;
		this.isHoliday = isHoliday;
	}
	
	public String toString() {
		return this.month + "/" + this.day + "/" + this.year;
	}
	
	

    @Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && month == other.month && year == other.year;
	}

	public static void main(String[] args) {
    	Date christmas = new Date(12, 25, 2022, true);
    	Date today = new Date(12, 25, 2022, false);
    	Date jBday = new Date(10, 25, 2004, true);
    	Date mBday = new Date(4, 30, 2004, true);
    	Date aBday = new Date(8, 29, 2004, true);
    	Date aBday2 = new Date(8, 29, 2004, false);

    	
    	System.out.println(christmas.equals(today));
    	
    	LinkedList<Date> list = new LinkedList<Date>();
    	list.add(christmas);
    	list.add(today);
    	list.add(jBday);
    	list.add(mBday);
    	list.add(aBday);
    	list.add(aBday2);
    	System.out.println(list);
    	
    	HashSet<Date> set = new HashSet<Date>();
    	set.add(aBday);
    	set.add(aBday2);
    	System.out.println(set);
    }
	
	

}
