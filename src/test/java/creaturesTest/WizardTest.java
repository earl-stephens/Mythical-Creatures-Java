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
}
