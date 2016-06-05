package calc;

import calc.expressions.BaseExpression;

public class Calculator {

	public static Double calc(String string) {
		
		System.out.println("--new calc--");
		
		Tokenizer t = new Tokenizer(string);
		
		BaseExpression b = new BaseExpression();
		
		return b.eval(t);
	}

}
