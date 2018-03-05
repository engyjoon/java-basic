package ch7;

class InnerEx3 {

	private int outerIv = 0;
	static int outerCv = 0;
	
	class InstanceInner {
		int iiv = outerIv; // 외부 클래스의 private 멤버도 접근 가능하다.
		int iiv2 = outerCv;
	}
	
	static class StaticInner {
		// 스태틱 클래스는 외부 클래스의 인스턴스 멤버에 접근할 수 없다.
	//	int siv = outerIv;
		static int scv = outerCv;
	}
	
	void myMethod() {
		int lv = 0;
		final int LV = 0;
		
		class LocalInner {
			int liv = outerIv;
			int liv2 = outerCv;
			int liv3 = lv; // JDK 1.8부터 가능
			int liv4 = LV;
		}
	}
}
