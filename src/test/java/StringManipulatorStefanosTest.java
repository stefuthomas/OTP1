import org.junit.*;

import static org.junit.jupiter.api.Assertions.*;

public class StringManipulatorStefanosTest {

    private static StringManipulatorStefanos stringManipulatorStefanos;

    @Before
    public void setUp() {
        stringManipulatorStefanos = new StringManipulatorStefanos();
    }

    @Test
    public void testReverse() {
        assertEquals("Hello World", stringManipulatorStefanos.reverse("dlroW olleH"));
    }

    @Test
    public void testCapitalize() {
        assertEquals("HELLO", stringManipulatorStefanos.capitalize("hello"));
    }

    @After
    public void tearDown() {
        stringManipulatorStefanos = null;
    }
}