import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Alessio Manià - IN2000247
 */
public class TestClass {
	@Test
	void testMethod() {
		Assertions.assertEquals(0, new Model().return0());
	}
	@Test
	void testSetNew() {
		NewClass n = new NewClass(1);
		n.setNumber(3);
		Assertions.assertEquals(7, n.getNumber());
	}
}
