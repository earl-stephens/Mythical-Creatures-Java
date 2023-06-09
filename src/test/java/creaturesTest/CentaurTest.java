package creaturesTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import creatures.Centaur;

class CentaurTest {
	static Centaur centaur;
	
	@BeforeEach
	void setUp() {
		centaur =  new Centaur("George", "Palomino");
	}
	
	@Test
	void testItHasAName() {
		assertEquals("George", centaur.getName());
	}

	@Test
	void testItHasAHorseBreed() {
		assertEquals("Palomino", centaur.getBreed());
	}
	
	@Test
	void testItHasExcellentBowSkills() {
		assertEquals("Twang!!!", centaur.shoot());
	}
	
	@Test
	void testItMakesAHorseSoundWhenItRuns() {
		assertEquals("Clop clop clop clop!", centaur.run());
	}
	
	@Test
	void testWhenFirstCreatedIsNotCranky() {
		assertFalse(centaur.isCranky());
	}
	
	@Test
	void testWhenFirstCreatedIsStandingUp() {
		assertTrue(centaur.isStanding());
	}
	
	@Test
	void testGetsTiredAfterRunningOrShootingABowThrice() {
		centaur.run();
		centaur.shoot();
		centaur.run();
		assertTrue(centaur.isCranky());
	}
	
	@Test
	void testWillNotShootABowWhenCranky() {
		assertFalse(centaur.isCranky());
		centaur.shoot();
		centaur.shoot();
		centaur.shoot();
		assertTrue(centaur.isCranky());
		assertEquals("NO!", centaur.shoot());
	}
	
	@Test
	void testWillNotSleepIfStanding() {
		assertEquals("NO!", centaur.sleep());
	}
	
	@Test
	void testNotStandingAfterLayingDown() {
		assertTrue(centaur.isStanding());
		
		centaur.layDown();
		assertFalse(centaur.isStanding());
		assertTrue(centaur.isLaying());
	}
	
	@Test
	void testCanSleepWhenLayingDown() {
		centaur.layDown();
		assertNotEquals("NO!", centaur.sleep());
	}
	
	@Test
	void testCanNotShootABowWhenLayingDown() {
		centaur.layDown();
		assertEquals("NO!", centaur.shoot());
	}
	
	@Test
	void testCanNotRunWhileLayingDown() {
		centaur.layDown();
		assertEquals("NO!", centaur.run());
	}
	
	@Test
	void testItCanStandUp() {
		assertTrue(centaur.isStanding());
		centaur.layDown();
		assertFalse(centaur.isStanding());
		centaur.standUp();
		assertTrue(centaur.isStanding());
	}
	
	@Test
	void testIsNoLongerCrankyAfterSleeping() {
		centaur.shoot();
		centaur.run();
		centaur.shoot();
		assertTrue(centaur.isCranky());
		
		centaur.layDown();
		centaur.sleep();
		assertFalse(centaur.isCranky());
		
		centaur.standUp();
		assertEquals("Twang!!!", centaur.shoot());
		assertEquals("Clop clop clop clop!", centaur.run());
	}
	
	@Test
	void testBecomesRestedAfterDrinkingAPotion() {
		centaur.shoot();
		centaur.run();
		centaur.shoot();
		assertTrue(centaur.isCranky());
		
		centaur.drinkPotion();
		assertFalse(centaur.isCranky());
	}
	
	@Test
	void testCanOnlyDrinkPotionWhenStanding() {
		centaur.layDown();
		assertFalse(centaur.isStanding());
		assertEquals("NO!", centaur.drinkPotion());
	}
	
	@Test
	void testGetsSickIfDrinkingPotionWhileRested() {
		centaur.shoot();
		centaur.run();
		centaur.shoot();
		assertTrue(centaur.isCranky());
		centaur.drinkPotion();
		assertFalse(centaur.isCranky());
		
		assertEquals("I don't feel good!", centaur.drinkPotion());
	}
}
