package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
	@Test
	public void test() {
		Reporter.log("Test Method executed.......",true);
	}
	@Test
	public void sample() {
		Reporter.log("sample class executed...",true);
	}
	@Test
	public void add() {
		Reporter.log("add method executed....",true);
	}
}
