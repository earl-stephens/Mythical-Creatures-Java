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

}
