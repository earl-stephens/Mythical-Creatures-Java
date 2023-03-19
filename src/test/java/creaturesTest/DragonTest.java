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
	
	@Test
	void testItHasARider() {
		dragon = new Dragon("Ramoth", "gold", "Lessa");
		
		assertEquals("Lessa", dragon.getRider());
	}
	
	@Test
	void testItHasAColor() {
		dragon = new Dragon("Ramoth", "gold", "Lessa");
		
		assertEquals("gold", dragon.getColor());
	}
	
	@Test
	void TestItIsADifferentDragon() {
		dragon = new Dragon("Mnementh", "bronze", "Flar");
		
		assertEquals("Mnementh", dragon.getName());
	}
	
	@Test
	void testItHasADifferentRider() {
		dragon = new Dragon("Mnementh", "bronze", "Flar");

		assertEquals("Flar", dragon.getRider());
	}
	
	@Test
	void testItHasADifferentColor() {
		dragon = new Dragon("Mnementh", "bronze", "Flar");
		
		assertEquals("bronze", dragon.getColor());
	}
	
	@Test
	void testItWasBornHungry() {
		dragon = new Dragon("Mnementh", "bronze", "Flar");

		assertTrue(dragon.isHungry());
	}
	
	@Test
	void testItEatsALot() {
		dragon = new Dragon("Mnementh", "bronze", "Flar");
		assertTrue(dragon.isHungry());
		
		dragon.eat();
		assertTrue(dragon.isHungry());
		
		dragon.eat();
		assertTrue(dragon.isHungry());
		
		dragon.eat();
		assertFalse(dragon.isHungry());
	}
}
