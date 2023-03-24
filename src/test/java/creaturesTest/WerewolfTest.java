package creaturesTest;
import creatures.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WerewolfTest {
	Werewolf werewolf;
	
	@BeforeEach
	void setUp() {
		werewolf = new Werewolf("David", "London");
	}

	@Test
	void testItHasAName() {
		assertEquals("David", werewolf.getName());
	}

	@Test
	void testItHasALocation() {
		assertEquals("London", werewolf.getLocation());
	}
	
	@Test
	void testIsHumanByDefault() {
		assertTrue(werewolf.isHuman());
	}
	
	@Test
	void testItChangesToAWerewolf() {
		werewolf.change();
		
		assertTrue(werewolf.isWolf());
		assertFalse(werewolf.isHuman());
	}
	
	@Test
	void testItCanChangeBackToHuman() {
		assertTrue(werewolf.isHuman());
		assertFalse(werewolf.isWolf());
		werewolf.change();
		assertTrue(werewolf.isWolf());
		assertFalse(werewolf.isHuman());
		
		werewolf.change();
		
		assertTrue(werewolf.isHuman());
	}
	
	@Test
	void testStartAsWereWolfGoesBackToWolfAfterTwoChanges() {
		assertTrue(werewolf.isHuman());
		werewolf.change();
		assertTrue(werewolf.isWolf());
		
		werewolf.change();
		werewolf.change();
		
		assertTrue(werewolf.isWolf());		
	}
	
	@Test
	void testIsNotHungryByDefault() {
		assertFalse(werewolf.isHungry());
	}
	
	@Test
	void testIsHungryAfterChangingToWerewolf() {
		assertFalse(werewolf.isHungry());
		werewolf.change();
		
		assertTrue(werewolf.isHungry());
	}
	
	@Test
	void testCanEatAVictim() {
		werewolf.change();
		Person victim = new Person("Fiona");
		
		assertTrue(werewolf.eat(victim));
	}
	
	@Test
	void testCannotEatVictimIfInHumanForm() {
		Person victim = new Person("Fiona");
		
		assertFalse(werewolf.eat(victim));
	}
	
	@Test
	void testWolfNotHungryAfterEatingVictim() {
		werewolf.change();
		Person victim = new Person("Fiona");
		werewolf.eat(victim);
		
		assertFalse(werewolf.isHungry());
	}
	
	@Test
	void testVictimDiesAfterWerewolfEatsIt() {
		werewolf.change();
		Person victim = new Person("Fiona");
		assertFalse(victim.isDead());
		werewolf.eat(victim);
		
		assertTrue(victim.isDead());
	}
}
