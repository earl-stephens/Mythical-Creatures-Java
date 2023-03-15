package creaturesTest;
import creatures.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UnicornTest {
	static Unicorn unicorn;

	@Test
	void testItHasAName() {
		unicorn = new Unicorn("Robert");
		assertEquals("Robert", unicorn.getName());
	}

}
