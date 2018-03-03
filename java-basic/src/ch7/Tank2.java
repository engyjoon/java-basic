package ch7;

public class Tank2 extends GroundUnit implements Repairable {
	
	Tank2() {
		super(150);
		hitPoint = MAX_HP;
	}
	
	public String toString() {
		return "Tank";
	}
	// ...
}
