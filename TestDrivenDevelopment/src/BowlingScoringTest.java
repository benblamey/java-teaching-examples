import static org.junit.Assert.*;

import org.junit.Test;


public class BowlingScoringTest {

	@Test
	public void testInitialize() {
		BowlingScore score 
			= new BowlingScore();
		assertEquals("Score should start at zero.", 
				0, 
				score.getScore());
	}
	
	@Test
	public void testA()  {
		BowlingScore score 
			= new BowlingScore();
		score.throwBall(3,6);
		assertEquals("Score should start at zero.", 
				9, 
				score.getScore());		
	}
	
	@Test(expected=BowlingException.class)
	public void testB() {
		BowlingScore score 
			= new BowlingScore();
		score.throwBall(8,8);
	}
	
	@Test
	public void testC() {
		BowlingScore score 
		= new BowlingScore();
		score.throwBall(2, 4);
		score.throwBall(3, 7);
		assertEquals(16, score.getScore());
	}
	
	@Test
	public void testD() {
		BowlingScore score 
		= new BowlingScore();
		score.strike();
		assertEquals(10, score.getScore());
	}
	
	@Test
	public void testE() {
		BowlingScore score 
		= new BowlingScore();
		score.strike();
		score.throwBall(2, 3);
		assertEquals(20, score.getScore());
	}
	
	@Test
	public void testF() {
		BowlingScore score 
		= new BowlingScore();
		score.strike();
		score.strike();
		// (fudge).
		assertEquals(30, score.getScore());
	}
	
	@Test
	public void testG() {
		BowlingScore score 
		= new BowlingScore();
		score.strike();
		score.strike();
		score.strike();
		// (fudge).
		assertEquals(30+20, score.getScore());
	}
	
	
	
	
	
	
	
	
	
	
//	public void tokenizerTest() {
//
//		String[] goldTokens = new String[]
//				{
//				"Hi", "Fred"
//				};
//				
//		assertArrayEquals(goldTokens, 
//				tokens);
//		
//		
//	}
	
	
	
	

}
