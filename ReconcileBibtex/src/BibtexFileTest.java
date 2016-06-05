import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;


public class BibtexFileTest {

	@Test
	public void test() throws IOException {
		BibtexFile file = new BibtexFile("C:\\work\\docs\\PHD_work\\master.bib");
		
		assertEquals(417, 
				file.keys.size());
		
	}

}
