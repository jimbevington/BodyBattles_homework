import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GermTest {

    private Germ germ;

    @Before
    public void setUp() throws Exception {
        germ = new Germ("Gary", 12);
    }

    @Test
    public void canGetDeadliness() {
        assertEquals(12, germ.getDeadliness());
    }

//    can multiply by a factor, which will increase deadliness

    @Test
    public void canMultiply() {
        germ.multiply(3);
        assertEquals(36, germ.getDeadliness());
    }

//    can attack a nanobot

//    experiment with hurting human's health

}
