package ch10;

class CalendarEx8 {

	public static void main(String[] args) {
		String date1 = "201808";
		String date2 = "201705";
		
		int month1 = Integer.parseInt(date1.substring(0, 4)) * 12 +
				     Integer.parseInt(date1.substring(4));
		int month2 = Integer.parseInt(date2.substring(0, 4)) * 12 +
			         Integer.parseInt(date2.substring(4));
		
		System.out.println(date1);
		System.out.println(date2);
		System.out.println(Math.abs(month1 - month2));
	}

}
