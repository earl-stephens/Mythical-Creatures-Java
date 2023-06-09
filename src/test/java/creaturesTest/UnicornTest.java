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
	
	@Test
	void testItIsSilverByDefault() {
		unicorn = new Unicorn("Margaret");
		assertEquals("Silver", unicorn.getColor());
		assertTrue(unicorn.isSilver());
	}
	
	@Test
	void testColorDoesNotHaveToBeSilver() {
		unicorn = new Unicorn("Barbara", "Purple");
		assertEquals("Purple", unicorn.getColor());
		assertFalse(unicorn.isSilver());
	}
	
	@Test
	void testItSaysSparklyStuff() {
		unicorn = new Unicorn("Johnny");
		assertEquals("**;* Wonderful! **;*", unicorn.say("Wonderful!"));
		assertEquals("**;* I don't like you very much. **;*", unicorn.say("I don't like you very much."));
	}
}
