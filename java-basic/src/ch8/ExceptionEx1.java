package ch8;

public class ExceptionEx1 {
	public static void main(String[] args) {
		try {
			try { } catch (Exception e2) { }
		} catch (Exception e1) {
			try { } catch (Exception e2) { }
		}
		
		try {
			
		} catch (Exception e) {
			
		}
	}
}
