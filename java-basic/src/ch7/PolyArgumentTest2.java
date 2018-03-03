package ch7;

public class PolyArgumentTest2 {

	public static void main(String[] args) {
		Buyer2 b = new Buyer2();
		
		b.buy(new Tv3());
		b.buy(new Computer2());
		b.buy(new Audio());
		b.summary();
	}

}
