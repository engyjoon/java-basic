package ch10;

import java.util.Calendar;

class CalendarEx1 {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		
		System.out.println(today.get(Calendar.YEAR));
		System.out.println(today.get(Calendar.MONTH));
		System.out.println(today.get(Calendar.WEEK_OF_YEAR));
		System.out.println(today.get(Calendar.WEEK_OF_MONTH));
		
		System.out.println(today.get(Calendar.DATE)); // 일
		System.out.println(today.get(Calendar.DAY_OF_MONTH)); // 일
		System.out.println(today.get(Calendar.DAY_OF_YEAR)); // 일
		System.out.println(today.get(Calendar.DAY_OF_WEEK)); // 요일 (1:일요일)
		System.out.println(today.get(Calendar.DAY_OF_WEEK_IN_MONTH)); // 요일
		System.out.println(today.get(Calendar.AM_PM)); // 0:오전, 1:오후
		System.out.println(today.get(Calendar.HOUR)); // 0~11
		System.out.println(today.get(Calendar.HOUR_OF_DAY)); // 0~23
		System.out.println(today.get(Calendar.MINUTE));
		System.out.println(today.get(Calendar.SECOND));
		System.out.println(today.get(Calendar.MILLISECOND));
		System.out.println(today.get(Calendar.ZONE_OFFSET)/(60*60*1000)); // -12~+12
		System.out.println(today.getActualMaximum(Calendar.DATE));
	}

}
