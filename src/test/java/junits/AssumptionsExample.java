package junits;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.*;

public class AssumptionsExample {
	
	@BeforeEach
	public void setup() {
		
		System.setProperty("ENV", "DEV");
		
	}
	
	@Test
	public void test1() {
		
		String ExpectedEnv = "DEV";
		String ActualEnv = System.getProperty("ENV");
		
		assumeTrue(ExpectedEnv.equals(ActualEnv));
		assertTrue(StringFunctions.isPlaindrome("oppo"));
		
	}
	

}
