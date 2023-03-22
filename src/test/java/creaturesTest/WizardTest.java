package creaturesTest;
import creatures.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WizardTest {
	Wizard wizard;
	
	@Test
	void testItHasAName() {
		wizard = new Wizard("Eric");
		
		assertEquals("Eric", wizard.getName());
	}
	
	@Test
	void testItHasADifferentName() {
		wizard = new Wizard("Alex");
		
		assertEquals("Alex", wizard.getName());
	}
	
	@Test
	void testItIsBeardedByDefault() {
		wizard = new Wizard("Ben");
		
		assertTrue(wizard.isBearded());
	}
	
	@Test
	void testIsNotAlwaysBearded() {
		wizard = new Wizard("Valerie", false);
		
		assertFalse(wizard.isBearded());
	}
	
	@Test
	void testItHasRootPowers() {
		wizard = new Wizard("Stella", false);
		
		assertEquals("sudo chown ~/bin", wizard.incantation("chown ~/bin"));
	}
	
	@Test
	void testItHasManyRootPowers() {
		wizard = new Wizard("Sal", true);
		
		assertEquals("sudo rm -rf /home/mirandax", wizard.incantation("rm -rf /home/mirandax"));
	}
}
