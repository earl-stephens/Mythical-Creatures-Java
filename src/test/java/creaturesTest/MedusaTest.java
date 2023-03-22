package creaturesTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import creatures.*;

class MedusaTest {
	Medusa medusa;
	
	@BeforeEach
	void setUp() {
		medusa =  new Medusa("Cassiopeia");
	}
	
	@Test
	void testItHasAName() {
		assertEquals("Cassiopeia", medusa.getName());
	}

	@Test
	void testItHasNoStatuesWhenCreated() {
		assertEquals(0, medusa.statuesGetCount());
	}
	
	@Test
	void testItGainsAStatueWhenStaringAtAPerson() {
		Person victim = new Person("Perseus");
		
		medusa.stare(victim);
		
		assertEquals(1, medusa.statuesGetCount());
		assertEquals("Perseus", medusa.getVictim(0).getName());
		assertEquals(Person.class, medusa.getVictim(0).getClass());
	}
}