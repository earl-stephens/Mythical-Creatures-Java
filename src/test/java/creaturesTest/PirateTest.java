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
	
	@Test
	void testItIsntAlwaysAScallywag() {
		pirate = new Pirate("Jack", "cook");
		
		assertEquals("cook", pirate.getJob());
	}
	
	@Test
	void testItIsNotCursedByDefault() {
		pirate = new Pirate("Jack");
		assertFalse(pirate.isCursed());
		
		pirate.commitHeinousAct();
		assertFalse(pirate.isCursed());
		
		pirate.commitHeinousAct();
		assertFalse(pirate.isCursed());
		
		pirate.commitHeinousAct();
		assertTrue(pirate.isCursed());
	}
	
	@Test
	void testItHasABooty() {
		pirate = new Pirate("Jack Sparrow");
		
		assertEquals(0, pirate.getBooty());
	}
	
	@Test
	void testItGetsBootyForRobbingAShip() {
		pirate = new Pirate("Jack Sparrow");
		assertEquals(0, pirate.getBooty());
		
		pirate.robShip();
		assertEquals(100, pirate.getBooty());
		
		pirate.robShip();
		assertEquals(200, pirate.getBooty());
	}
}
