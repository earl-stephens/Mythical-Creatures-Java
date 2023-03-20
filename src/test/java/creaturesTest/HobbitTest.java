package creaturesTest;
import creatures.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HobbitTest {
	Hobbit hobbit;
	
	@Test
	void testItHasAName() {
		hobbit = new Hobbit("Bilbo");
		
		assertEquals("Bilbo", hobbit.getName());
	}

}
