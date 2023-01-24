package baseball;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PlayGameTest {
	private Game game;
	@BeforeEach
	void init() {
		// 중복되는 input 값 분리
		game = new Game(1,3);
	}
	@Test
	void strike() {
		BallStatus status = game.play(new Game(1,3));
		assertThat(status).isEqualTo(BallStatus.STRIKE);
	}
	@Test
	void ball() {
		BallStatus status = game.play(new Game(2,3));
		assertThat(status).isEqualTo(BallStatus.BALL);
	}
	@Test
	void nothing() {
		BallStatus status = game.play(new Game(2,4));
		assertThat(status).isEqualTo(BallStatus.NOTHING);
	}
}
