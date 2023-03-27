package creaturesTest;
import creatures.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DirewolfTest {
	Direwolf wolf;
	
	@Test
	void testItHasAName() {
		wolf = new Direwolf("Nymeria");
		
		assertEquals("Nymeria", wolf.getName());
	}
	
	@Test
	void testCanHaveDifferentNameAndHome() {
		wolf = new Direwolf("Lady");
		
		assertEquals("Lady", wolf.getName());
		assertEquals("Beyond the Wall", wolf.getHome());
	}

	@Test
	void testIsMassiveByDefault() {
		wolf = new Direwolf("Ghost");
		
		assertEquals("Ghost", wolf.getName());
		assertEquals("Massive", wolf.getSize());
	}
	
	@Test
	void testItCanHaveAnotherHomeAndAnotherSize() {
		wolf = new Direwolf("Shaggydog", "Winterfell", "Smol Pupper");
		
		assertEquals("Shaggydog", wolf.getName());
		assertEquals("Winterfell", wolf.getHome());
		assertEquals("Smol Pupper", wolf.getSize());
	}
}
