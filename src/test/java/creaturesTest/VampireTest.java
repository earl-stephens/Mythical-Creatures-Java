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

	@Test
	void testItKeepsAPetBatByDefault() {
		vampire = new Vampire("Ruthven");
		
		assertEquals("bat", vampire.getPet());
	}
	
	@Test
	void testItCanKeepOtherPets() {
		vampire = new Vampire("Varney", "fox");
		
		assertEquals("fox", vampire.getPet());
	}
	
	@Test
	void testIsThirstyByDefault() {
		vampire = new Vampire("The Count");
		
		assertTrue(vampire.isThirsty());
	}
	
	@Test
	void testIsNotThirstyAfterDrinking() {
		vampire = new Vampire("Elizabeth Bathory");
		
		vampire.drink();
		assertFalse(vampire.isThirsty());
	}
}
