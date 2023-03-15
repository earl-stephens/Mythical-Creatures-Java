package creaturesTest;
import creatures.*;

import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CentaurTest {
	static Centaur centaur;
	
	@BeforeAll
	static void setUp() {
		centaur =  new Centaur("George", "Palomino");
	}
	
	@Test
	void test() {
		fail("Not yet implemented");
	}

}
