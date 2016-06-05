
public class RomanNumeral {


	
	public static int Parse(String string) {
		char[] letters = string.toCharArray(); 

		int total = 0;

		for (int i = 0; i < letters.length; i++) {
			int value = getCharValue(letters[i]);
			Integer nextValue = letters.length > (i+1) ? getCharValue(letters[i+1]) : null;

			if (nextValue == null || value >= nextValue) {
				total += value;
			} else {
				total -= value;
			}
		}
		
		return total;	
	}

	private static int getCharValue(char c) {
		switch (c) {
			case 'I': return 1;
			case 'V': return 5;
		}

		throw new RuntimeException("Not implemented!");
	}

}
