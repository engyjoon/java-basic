package ch7;

public class Product3 {
	int price;
	int bonusPoint;
	
	Product3(int price) {
		this.price = price;
		bonusPoint = (int) (price/10.0);
	}
	
	Product3() {
		price = 0;
		bonusPoint = 0;
	}
}
