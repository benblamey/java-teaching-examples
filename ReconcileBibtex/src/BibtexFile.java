import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class BibtexFile {

	public final List<String> keys = new ArrayList<String>();
	
	public BibtexFile(String filename) throws IOException {
		
		FileReader fr = new FileReader(filename); 
		
		BufferedReader reader = new BufferedReader(fr);
		Pattern compile = Pattern.compile("@[A-Za-z]+\\{([^,]+),");
		
		String readLine = "";
		do {
			readLine = reader.readLine();
			if (readLine == null) {
				break;
			}
			Matcher matcher = compile.matcher(readLine);
			if (matcher.matches()) {
				String key = matcher.group(1);
				keys.add(key);
			}
			if (matcher.matches() != readLine.startsWith("@")) {
				"".toString();
			}
			
		} while (true); 
		
	}
	
}
