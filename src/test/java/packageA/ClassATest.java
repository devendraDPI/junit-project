package packageA;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import junits.StringFunctions;

public class ClassATest {
	
	@Tag("Sanity")
	@DisplayName("Test1")
	@Test
	public void Test1() {
		
		assertTrue(StringFunctions.isPlaindrome("oppo"));
		
	}

}
