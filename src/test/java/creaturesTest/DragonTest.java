package creaturesTest;
import creatures.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DragonTest {
	public static Dragon dragon;
	
	@Test
	void testItHasAName() {
		dragon = new Dragon("Ramoth", "gold", "Lessa");
		
		assertEquals("Ramoth", dragon.getName());
	}

}
