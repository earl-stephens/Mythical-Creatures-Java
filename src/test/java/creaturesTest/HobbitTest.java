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

	@Test
	void testItCanHaveAnotherName() {
		hobbit = new Hobbit("Peregrin");
		
		assertEquals("Peregrin", hobbit.getName());
	}
	
	@Test
	void testItHasAnUnadventurousDisposition() {
		hobbit = new Hobbit("Samwise");
		
		assertEquals("homebody", hobbit.getDisposition());
	}
}
