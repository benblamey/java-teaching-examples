package calc.tests;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

import calc.Tokenizer;
import calc.Tokens;

public class TestTokenizer {

	@Test
	public void test1() 
	{
		Tokenizer t = new Tokenizer("123213");
		assertEquals(true, t.tryRead(Tokens.NUMBER));
		assertEquals("123213", t.read(Tokens.NUMBER));		
	}
	
	@Test
	public void test2() 
	{
		Tokenizer t = new Tokenizer("123213+");
		assertEquals(true, t.tryRead(Tokens.NUMBER));
		assertEquals("123213", t.read(Tokens.NUMBER));
		assertEquals(true, t.tryRead(Tokens.PLUS));
	}
	
}
