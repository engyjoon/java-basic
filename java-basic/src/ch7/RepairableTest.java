package ch7;

class RepairableTest {

	public static void main(String[] args) {
		Tank2 tank = new Tank2();
		Dropship2 dropship = new Dropship2();
		Marine2 marine = new Marine2();
		SCV scv = new SCV();
		
		scv.repair(tank);
		scv.repair(dropship);
	}

}
