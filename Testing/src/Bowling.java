
public class Bowling {

	private int _score;
	private boolean _lastBallWasStrike;
	
	public int getScore() {
		return _score;
	}

	public void throwBalls(int i, int j) {
		if (i+j>10){
			throw new BowlingException();
		}
		
		if (_lastBallWasStrike) {
			_score += i;
			_score += j;
		}
		
		_score += i;
		_score += j;
		_lastBallWasStrike = false;
	}

	public void throwStrike() {
		_score+=10;
		_lastBallWasStrike = true;
	}
	
	



}
