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

}
