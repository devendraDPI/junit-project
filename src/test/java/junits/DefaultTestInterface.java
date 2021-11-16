package junits;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.RepeatedTest;

public interface DefaultTestInterface {
	
	public void Method1();
	public void Method2();

	@RepeatedTest(4)
	default void test() {
		
		assertTrue(StringFunctions.isPlaindrome("oppo"));
		
	}
	

}
