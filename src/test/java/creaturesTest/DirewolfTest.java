package creaturesTest;
import creatures.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DirewolfTest {
	Direwolf wolf;
	
	@Test
	void testItHasAName() {
		wolf = new Direwolf("Nymeria");
		
		assertEquals("Nymeria", wolf.getName());
	}
	
	@Test
	void testCanHaveDifferentNameAndHome() {
		wolf = new Direwolf("Lady");
		
		assertEquals("Lady", wolf.getName());
		assertEquals("Beyond the Wall", wolf.getHome());
	}

	@Test
	void testIsMassiveByDefault() {
		wolf = new Direwolf("Ghost");
		
		assertEquals("Ghost", wolf.getName());
		assertEquals("Massive", wolf.getSize());
	}
	
	@Test
	void testItCanHaveAnotherHomeAndAnotherSize() {
		wolf = new Direwolf("Shaggydog", "Winterfell", "Smol Pupper");
		
		assertEquals("Shaggydog", wolf.getName());
		assertEquals("Winterfell", wolf.getHome());
		assertEquals("Smol Pupper", wolf.getSize());
	}
	
	@Test
	void testTheStarksAreInWinterfellByDefault() {
		wolf = new Direwolf("Summer", "Winterfell");
		Stark stark = new Stark("Bran");
		
		assertEquals("Winterfell", wolf.getHome());
		assertEquals("Winterfell", stark.getLocation());
	}
	
	@Test
	void testItStartsWithNoStarksToProtect() {
		wolf = new Direwolf("Nymeria");
		Stark stark = new Stark("Arya");
		
		assertEquals(0, wolf.starksToProtect.size());
	}
	
	@Test
	void testItProtectsTheStarkChildren() {
		wolf = new Direwolf("Nymeria", "Riverlands");
		Stark stark = new Stark("Arya", "Riverlands");
		
		wolf.protects(stark);
		
		assertEquals("Arya", wolf.starksToProtect.get(0).getFirstName());
	}
	
	@Test
	void testCanOnlyProtectStarkChildrenIfTheyAreInTheSameLocation() {
		wolf = new Direwolf("Ghost");
		Stark stark = new Stark("Jon", "Kings Landing");
		
		wolf.protects(stark);
		
		assertEquals(0, wolf.starksToProtect.size());
	}
	
	@Test
	void testCanOnlyProtectTwoStarksAtATime() {
		Direwolf summerWolf = new Direwolf("Summer", "Winterfell");
		Direwolf ladyWolf = new Direwolf("Lady", "Winterfell");
		Stark sansaStark = new Stark("Sansa");
		Stark jonStark = new Stark("Jon");
		Stark robStark = new Stark("Rob");
		Stark branStark = new Stark("Bran");
		Stark aryaStark = new Stark("Arya");
		
		summerWolf.protects(sansaStark);
		summerWolf.protects(jonStark);
		ladyWolf.protects(robStark);
		ladyWolf.protects(branStark);
		ladyWolf.protects(aryaStark);
		
		assertEquals("Sansa", summerWolf.starksToProtect.get(0).getFirstName());
		assertEquals("Jon", summerWolf.starksToProtect.get(1).getFirstName());
		
	}
}
