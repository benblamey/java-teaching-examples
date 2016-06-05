import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Collections;
import java.util.regex.Pattern;


public class Main {

	
	public static void main(String[] args) throws Exception	 {
		BibtexFile file = new BibtexFile("C:\\work\\docs\\PHD_work\\master.bib");
		
//		Collections.sort(file.keys);
//		for (String key : file.keys) {
//			System.out.println(key);
//		}
		
		String thesis = "";
		FileReader fr = new FileReader("C://work//docs//Dropbox//PHD//thesis//foo.txt"); 
		BufferedReader reader = new BufferedReader(fr);
		do {
			String readLine2 = reader.readLine();
			if (readLine2 ==  null) break;
			thesis += "\n" + readLine2;
		} while (true);
		
		for (String key : file.keys) {
			if (!thesis.contains(key)) {
				System.out.println(key);
			}
		}
		
		
	}
	
}
