package calc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tokenizer {

	private String string;
	int index = 0;

	public Tokenizer(String string) {
		this.string = string;
	}

	public boolean tryRead(String pattern) {
		Matcher matcher = toPattern(pattern);
		boolean matches = matcher.find();
		return matches;
	}

	public String read(String pattern) {
		Matcher matcher = toPattern(pattern);
		
		// Assert the group.
		// Count does not include the 0th entire match.
		if (!matcher.find() || matcher.groupCount() != 1) {  
			throw new RuntimeException();
		}
		
		String result = matcher.group(0);
		index = index + (matcher.end() );
		return result;
	}
	
	private Matcher toPattern(String pattern) {
		pattern = "^ *("+pattern+")"; 
		Pattern patternCompiled = Pattern.compile(pattern);
		String toEat = string.substring(index);
		Matcher matcher = patternCompiled.matcher(toEat);
		System.out.println("Matching " + toEat  + " #" + pattern);
		
		return matcher;
	}


}
