package creaturesTest;
import creatures.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OgreTest {
	Ogre ogre;
	Human human;
	
	@BeforeEach
	void setUp() {
		ogre = new Ogre("Brak");
		human = new Human();
	}

	@Test
	void testItHasAName() {
		assertEquals("Brak", ogre.getName());
	}

	@Test
	void testLivesSomewhereByDefault() {
		assertEquals("Swamp", ogre.getHome());
	}
	
	@Test
	void testDoesntHaveToLiveInASwamp() {
		Ogre ogre2 =  new Ogre("Brak", "Castle");
		
		assertEquals("Castle", ogre2.getHome());
	}
	
	@Test
	void testCanMeetHumans() {
		assertEquals("Jane", human.getName());
		
		ogre.encounter(human);
		
		assertEquals(1, human.getEncounterCounter());
	}
	
	@Test
	void testIsNoticedByHumansForEvery3rdEncounter() {
		ogre.encounter(human);
		ogre.encounter(human);
		
		assertFalse(human.noticesOgre());
		
		ogre.encounter(human);
		
		assertTrue(human.noticesOgre());
	}
	
	@Test
	void testIsNoticedByHumanOn6thEncounter() {
		for(int i = 0; i < 5; i++) {
			ogre.encounter(human);
		}
		
		assertFalse(human.noticesOgre());
		
		ogre.encounter(human);
		
		assertTrue(human.noticesOgre());
	}
	
	@Test
	void testItCanSwingAClub() {
		ogre.swingAt(human);
		
		assertEquals(1, ogre.getSwings());
	}
	
	@Test
	void testSwingsClubWhenNoticedByHuman() {
		ogre.encounter(human);
		ogre.encounter(human);
		
		assertEquals(0, ogre.getSwings());
		
		ogre.encounter(human);
		
		assertEquals(1, ogre.getSwings());
		assertTrue(human.noticesOgre());
	}
	
	@Test
	void testItHitsHumanOnEverySecondSwing() {
		for(int i = 0; i < 5; i++) {
			ogre.encounter(human);
		}
		
		assertFalse(human.isKnockedOut());
		ogre.encounter(human);
		
		assertEquals(6, human.getEncounterCounter());
		assertEquals(2, ogre.getSwings());
		assertTrue(human.isKnockedOut());
	}
	
	@Test
	void testItApologizesAndWakesUpHuman() {
		for(int i = 0; i < 5; i++) {
			ogre.encounter(human);
		}
		assertFalse(human.isKnockedOut());
		ogre.encounter(human);
		assertTrue(human.isKnockedOut());
		
		ogre.apologize(human);
		
		assertFalse(human.isKnockedOut());
	}
}
