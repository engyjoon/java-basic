package ch10;

import java.util.Calendar;

class CalendarEx4 {

	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();
		date.set(2018, 4, 5);
		
		System.out.println(toString(date));
		
		System.out.println("after 1 day");
		date.add(Calendar.DATE, 1);
		System.out.println(toString(date));
		
		System.out.println("before 6 month");
		date.add(Calendar.MONTH, -6);
		System.out.println(toString(date));
		
		System.out.println("after 31 day (roll)");
		date.roll(Calendar.DATE, 31);
		System.out.println(toString(date));
		
		System.out.println("after 31 day (add)");
		date.add(Calendar.DATE, 31);
		System.out.println(toString(date));
	}

	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR) + "년 " + (date.get(Calendar.MONTH)+1) + "월 " +
			   date.get(Calendar.DATE) + "일 "; 
	}
}
