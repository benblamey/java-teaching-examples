package calc.expressions;

import calc.Tokenizer;
import calc.Tokens;

public class NumericExpression implements ExpressionInterface {

	@Override
	public Double eval(Tokenizer t) {
		String number = t.read(Tokens.NUMBER);
		double parseDouble = Double.parseDouble(number);
		return parseDouble;
	}
	
	

}
