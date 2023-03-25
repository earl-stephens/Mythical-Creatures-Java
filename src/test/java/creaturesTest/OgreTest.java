package creaturesTest;
import creatures.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OgreTest {
	Ogre ogre;
	
	@BeforeEach
	void setUp() {
		ogre = new Ogre("Brak");
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
}
