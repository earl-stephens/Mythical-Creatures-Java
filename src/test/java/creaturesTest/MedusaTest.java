package creaturesTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import creatures.Medusa;

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
}
