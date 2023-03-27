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

}
