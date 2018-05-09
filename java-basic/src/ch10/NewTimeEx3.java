package ch10;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

class NewTimeEx3 {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		
		System.out.println(today);
		System.out.println(today.with(TemporalAdjusters.firstDayOfNextMonth())); // 다음 달의 첫 날 
		System.out.println(today.with(TemporalAdjusters.firstDayOfMonth())); // 이 달의 첫 날
		System.out.println(today.with(TemporalAdjusters.lastDayOfMonth())); // 이 달의 마지막 날
		System.out.println(today.with(TemporalAdjusters.firstInMonth(DayOfWeek.TUESDAY))); // 이 달의 첫번째 화요일
		System.out.println(today.with(TemporalAdjusters.lastInMonth(DayOfWeek.TUESDAY))); // 이 달의 마지막 화요일
		System.out.println(today.with(TemporalAdjusters.previous(DayOfWeek.TUESDAY))); // 지난 주 화요일
		System.out.println(today.with(TemporalAdjusters.previousOrSame(DayOfWeek.TUESDAY))); // 지난 주 화요일 (오늘 포함)
		System.out.println(today.with(TemporalAdjusters.next(DayOfWeek.TUESDAY))); // 다음 주 화요일
		System.out.println(today.with(TemporalAdjusters.nextOrSame(DayOfWeek.TUESDAY))); // 다음 주 화요일 (오늘 포함)
		System.out.println(today.with(TemporalAdjusters.dayOfWeekInMonth(4, DayOfWeek.TUESDAY))); // 이 달의 4번째 화요일
	}

}
