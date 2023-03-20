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
	
	@Test
	void testItCanHaveADifferentDisposition() {
		hobbit = new Hobbit("Frodo", "adventurous");
	}
	
	@Test
	void testItCanGrowOlderWhenCelebratingBirthdays() {
		hobbit = new Hobbit("Meriadoc");
		assertEquals(0, hobbit.getAge());
		
		for(int i = 0; i < 5; i++) {
			hobbit.celebrateBirthday();
		}
		
		assertEquals(5, hobbit.getAge());
	}
	
	@Test
	void testItIsConsideredAChildAt32() {
		hobbit = new Hobbit("Gerontius");
		
		for(int i = 0; i < 32; i++) {
			hobbit.celebrateBirthday();
		}
		
		assertFalse(hobbit.isAnAdult());
	}
}
