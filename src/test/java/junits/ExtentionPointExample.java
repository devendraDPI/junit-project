package junits;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(EnvCheck.class)
public class ExtentionPointExample {
	
	@Test
	@DisplayName("Positive Test")
	public void test1() {
		
		assertTrue(StringFunctions.isPlaindrome("oppo"));
	}
	
	//@Disabled
	@Test
	@DisplayName("Negative Test")
	public void test2() {
		
		assertFalse(StringFunctions.isPlaindrome("abce"));
	}

}
