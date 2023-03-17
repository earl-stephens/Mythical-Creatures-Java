package creaturesTest;
import creatures.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VampireTest {
	static Vampire vampire;
	
	@Test
	void testItHasAName() {
		vampire = new Vampire("Dracula");
		
		assertEquals("Dracula", vampire.getName());
	}
	
	@Test
	void testCanBeNamedSomethingElse() {
		vampire = new Vampire("Vladimir");
		
		assertEquals("Vladimir", vampire.getName());
	}

}
