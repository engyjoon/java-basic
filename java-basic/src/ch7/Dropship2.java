package ch7;

public class Dropship2 extends AirUnit implements Repairable {

	Dropship2() {
		super(125);
		hitPoint = MAX_HP;
	}
	
	public String toString() {
		return "Dropship";
	}
	// ...
}
