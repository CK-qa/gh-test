

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void testIfTrue() {
        Assertions.assertTrue(true, "This is true!");
    }

    @Test
    public void testIfFalse() {
        Assertions.assertTrue(false, "This is false!");
    }

}