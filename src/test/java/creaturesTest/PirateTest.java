package creaturesTest;
import creatures.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PirateTest {
	Pirate pirate;
	
	@Test
	void testItHasAName() {
		pirate = new Pirate("Jane");
		
		assertEquals("Jane", pirate.getName());
	}

	@Test
	void testItCanHaveADifferentName() {
		pirate = new Pirate("Blackbeard");
		
		assertEquals("Blackbeard", pirate.getName());
	}
	
	@Test
	void testItIsAScallywagByDefault() {
		pirate = new Pirate("Jane");
		
		assertEquals("Scallywag", pirate.getJob());
	}
}
