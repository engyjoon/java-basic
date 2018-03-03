package ch7;

public class PolyArgumentTest3 {

	public static void main(String[] args) {
		Buyer3 b = new Buyer3();
		Tv4 tv = new Tv4();
		Computer3 com = new Computer3();
		Audio2 audio = new Audio2();
		
		b.buy(tv);
		b.buy(com);
		b.buy(audio);
		b.summary();
		System.out.println();
		b.refund(com);
		b.summary();
	}

}
