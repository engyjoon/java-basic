package ch3;
import java.util.Scanner;

public class OperatorEx25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		char ch = ' ';
		
		System.out.printf("문자를 하나 입하세요.>");
		
		String input = scanner.nextLine();
		ch = input.charAt(0);
		
		if ('0' <= ch && ch <= '9') {
			System.out.println("입력하신 문자는 숫자입니다. %n");
		}
		
		if (('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'z')) {
			System.out.printf("입력하신 문자는 영문자입니다. %n");
		}
	}

}