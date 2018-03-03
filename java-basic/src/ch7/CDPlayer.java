package ch7;

public class CDPlayer extends Player {

	@Override
	void play(int pos) {
		/* 조상의 추상메서드를 구현 */
	}

	@Override
	void stop() {
		/* 조상의 추상메서드를 구현 */
	}

	int currentTrack;
	
	void nextTrack() {
		currentTrack++;
	}
	
	void preTrack() {
		if (currentTrack > 1) {
			currentTrack--;
		}
	}
}
