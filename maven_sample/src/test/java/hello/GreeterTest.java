package hello;

import static org.junit.Assert.*;
import org.junit.Test;

public class GreeterTest {
	@Test
	public void testSayHello() {
		Greeter greeter = new Greeter();
		assertEquals("Hello world!", greeter.sayHello());
	}
}
