package ch7;

public class VCR2 {
	protected int counter;
	
	public void play() {
		// Tape을 재생한다.
	}
	
	public void stop() {
		// 재생을 멈춘다.
	}
	
	public void reset() {
		counter = 0;
	}
	
	public int getCounter() {
		return counter;
	}
	
	public void setCounter(int c) {
		counter = c;
	}
}
