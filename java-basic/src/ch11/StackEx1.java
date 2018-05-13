package ch11;

import java.util.Stack;

class StackEx1 {
	
	static Stack back = new Stack();
	static Stack forward = new Stack();

	public static void main(String[] args) {
		goURL("네이버");
		goURL("다음");
		goURL("구글");
		goURL("페이스북");
		
		printStatus();
		
		goBack();
		System.out.println("= 뒤로가기 버튼을 누른 후 =");
		printStatus();
		
		goBack();
		System.out.println("= 뒤로가기 버튼을 누른 후 =");
		printStatus();
		
		goForward();
		System.out.println("= 앞으로가기 버튼을 누른 후 =");
		printStatus();
		
		goURL("쿠팡");
		System.out.println("= 새로운 주소로 이동 후 =");
		printStatus();
	}

	static void printStatus() {
		System.out.println("back : " + back);
		System.out.println("forward : " + forward);
		System.out.println("현재화면은 '" + back.peek() + "' 입니다.");
		System.out.println();
	}
	
	static void goURL(String url) {
		back.push(url);
		if (!forward.empty())
			forward.clear();
	}
	
	static void goForward() {
		if (!forward.empty())
			back.push(forward.pop());
	}
	
	static void goBack() {
		if (!back.empty())
			forward.push(back.pop());
	}
}
