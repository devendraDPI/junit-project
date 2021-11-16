package junits;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.RepeatedTest;

public class RepeatedTestExample {
	
	@RepeatedTest(4)
	public void test1() {
		
		assertTrue(StringFunctions.isPlaindrome("oppo"));
	}

}
