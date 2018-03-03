package ch7;

public class TVCR2 extends Tv5 implements IVCR {

	VCR2 vcr = new VCR2();
	
	@Override
	public void play() {
		// TODO Auto-generated method stub
		vcr.play();
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		vcr.stop();
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub
		vcr.reset();
	}

	@Override
	public int getCounter() {
		// TODO Auto-generated method stub
		return vcr.getCounter();
	}

	@Override
	public void setCounter(int c) {
		// TODO Auto-generated method stub
		vcr.setCounter(c);
	}

}
