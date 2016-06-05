
public class BowlingScore {

	private int _score;
	private boolean _lastFrameWasStrike;
	
	public int getScore() {
		return _score;
	}

	public void throwBall(int i, int j)
			throws BowlingException
	{
		if (i + j > 10) {
			throw new BowlingException();
		}
		
		if (_lastFrameWasStrike)
		{
			// Bonus Points!
			_score += i;
			_score += j;
		}
		
		_score += i;
		_score += j;
		
		_lastFrameWasStrike = false;
	}

	public void strike() {
		
		if (_lastFrameWasStrike) {
			_score += 10;	
		}
		
		_score += 10;		
		_lastFrameWasStrike = true;
	}

}
