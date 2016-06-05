import static org.junit.Assert.*;
import org.junit.Test;

public class BowlingTest {

	@Test
	public void test() {
		Bowling bowling = new Bowling();
		assertEquals(0, bowling.getScore());
	}
	
	@Test
	public void testB() {
		Bowling bowling = new Bowling();
		bowling.throwBalls(2,3);
		assertEquals(5, bowling.getScore());
	}

	@Test(expected=BowlingException.class)
	public void testC() {
		Bowling bowling = new Bowling();
		bowling.throwBalls(8, 8);	
	}
	
	@Test
	public void testD() {
		Bowling bowling = new Bowling();
		bowling.throwStrike();
		assertEquals(10, bowling.getScore());
	}
	
	@Test
	public void testE() {
		Bowling bowling = new Bowling();
		bowling.throwStrike();
		bowling.throwBalls(2, 7);
		assertEquals(28, bowling.getScore());
	}
	
	@Test
	public void testF() {
		Bowling bowling = new Bowling();
		bowling.throwStrike();
		bowling.throwBalls(2, 7);
		bowling.throwBalls(2, 7);
		assertEquals(28+9, bowling.getScore());
	}
	
	@Test
	public void testG() {
		Bowling bowling = new Bowling();
		bowling.throwStrike();
		bowling.throwStrike();
		bowling.throwBalls(1, 9);
		assertEquals(10+10+1
				+10+1+9
				+1+9,
				bowling.getScore());
	}
	
	
	
	
	
	
	
	
	
}
