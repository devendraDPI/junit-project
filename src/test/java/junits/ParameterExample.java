package junits;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Month;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterExample {
	
	@ParameterizedTest
	@ValueSource(strings = {"oppo","madam","abce"})
	public void test1(String Name) {
		
		assertTrue(StringFunctions.isPlaindrome(Name));
		
	}
	
	@ParameterizedTest
	@ValueSource(ints = {3, 4, 8, 11})
	public void oddNumCheck(int num) {
		
		assertTrue(num%2!=0);
	}
	
	
	@ParameterizedTest
	@EnumSource(Month.class)
	public void MonthCheck(Month month) {
		
		int monthnum = month.getValue();
		assertTrue(monthnum >= 1 && monthnum <= 12);
		
	}
	
	@ParameterizedTest
	@EnumSource(value = Month.class, names = {"APRIL", "JUNE", "SEPTEMBER", "NOVEMBER"})
	public void MonthDaysCheck(Month month) {
		
		int days = month.length(false);
		assertEquals(days,30);
		
	}
	
	@ParameterizedTest
	@EnumSource(value = Month.class, names = {"FEBRUARY"})
	public void LeapYearCheck(Month month) {
		
		int days = month.length(false);
		assertEquals(days,28);
		
	}
	
	@ParameterizedTest
	@MethodSource("DpMethod")
	public void PlaindromeCheck1(String Name) {
		
		assertTrue(StringFunctions.isPlaindrome(Name));
		
	}
	
	static Stream<String> DpMethod(){
		
		return Stream.of("madam", "Hello", "radar", "mom", "dad");
				
	}

}
