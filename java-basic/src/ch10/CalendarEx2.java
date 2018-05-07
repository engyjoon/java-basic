package ch10;

import java.util.Calendar;

class CalendarEx2 {

	public static void main(String[] args) {
		final String[] DAY_OF_WEEK = {"","일","월","화","수","목","금","토"};
		
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
		//date1.set(2018, 5, 1);
		date1.set(2018,  Calendar.MAY, 1);
		
		System.out.println("date1 : " + toString(date1) + DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)]);
		System.out.println("date2 : " + toString(date2) + DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)]);
		
		long difference = (date2.getTimeInMillis() - date1.getTimeInMillis()) / 1000;
		
		System.out.println("difference(초) : " + difference);
		System.out.println("difference(일) : " + difference/(24*60*60));
	}

	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR) + "년 " + (date.get(Calendar.MONTH)+1) + "월 " +
			   date.get(Calendar.DATE) + "일 "; 
	}
}
