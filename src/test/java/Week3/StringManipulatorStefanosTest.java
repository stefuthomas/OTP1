package Week3;

import static org.junit.jupiter.api.Assertions.*;

class StringManipulatorStefanosTest {
    private StringManipulatorStefanos stringManipulatorStefanos;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        stringManipulatorStefanos = new StringManipulatorStefanos();
    }

    @org.junit.jupiter.api.Test
    void reverse() {
        assertEquals("olleh", stringManipulatorStefanos.reverse("hello"));
    }

    @org.junit.jupiter.api.Test
    void capitalize() {
        assertEquals("HELLO", stringManipulatorStefanos.capitalize("hello"));
    }

}