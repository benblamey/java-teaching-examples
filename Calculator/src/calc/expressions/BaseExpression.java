package calc.expressions;

import calc.Tokenizer;
import calc.Tokens;

public class BaseExpression implements ExpressionInterface {

	public Double eval(Tokenizer t) {

		Double result = 0.0; 
		
		do {
			if (t.tryRead(Tokens.NUMBER)) {
				NumericExpression ne = new NumericExpression();
				result += ne.eval(t);
			} else {
				throw new RuntimeException();
			}
			
			if (t.tryRead(Tokens.PLUS)) {
				t.read(Tokens.PLUS);
			} else {
				break;
			}
		} while (true);

		return result;
	}

}
