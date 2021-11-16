package junits;

import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FirstJunit {
	
	@BeforeAll
	public static void Method3() {
		
		System.out.println("Inside Method3");
		
	}
	
	@BeforeEach
	public void Method1() {
		
		System.out.println("Inside Method1");
		
	}
	
	@Test
	public void Test1() {
		
		System.out.println("Inside Test1");
		
		boolean flag = true;
		Assert.assertTrue(flag);
		
	}
	
	@Test
	public void Test2() {
		
		System.out.println("Inside Test2");
		
	}
	
	@AfterEach
	public void Method2() {
		
		System.out.println("Inside Method2");
		
	}
	
	@AfterAll
	public static void Method4() {
		
		System.out.println("Inside Method4");
		
	}

}
