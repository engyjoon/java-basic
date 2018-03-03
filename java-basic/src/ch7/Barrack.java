package ch7;

public class Barrack extends Building implements Liftable {

	LiftableImpl l = new LiftableImpl();
	
	@Override
	public void liftOff() {
		l.liftOff();
	}

	@Override
	public void move(int x, int y) {
		l.move(x, y);
	}

	@Override
	public void stop() {
		l.stop();
	}

	@Override
	public void land() {
		l.land();
	}
	
	void trainMarine() { /* 내용 생략 */ }

}
