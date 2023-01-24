package baseball;

public class Game {
	private final int index;
	private final int ballNum;
	public Game(int index, int ballNum) {
		this.index = index;
		this.ballNum = ballNum;
	}

	public BallStatus play(Game game) {
		// null 체크 필요
		if(this.equals(game)) {
			return BallStatus.STRIKE;
		}
		if(game.isBall(ballNum)) {
			return BallStatus.BALL;
		}
		return BallStatus.NOTHING;
	}
	
	public boolean isBall(int ballNum) {
		return this.ballNum == ballNum;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Game other = (Game) obj;
		return ballNum == other.ballNum && index == other.index;
	}

}
