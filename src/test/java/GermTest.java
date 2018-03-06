import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GermTest {

    private Germ germ;
    private Nanobot bot;

    @Before
    public void setUp() throws Exception {
        germ = new Germ("Gary", 6, 3);
        bot = new Nanobot(15, 7);
    }

    @Test
    public void canGetName() {
        assertEquals("Gary", germ.getName());
    }

    @Test
    public void canAttackNanobot() {
        germ.attack(bot);
        assertEquals(12, bot.getStrength());
    }

    @Test
    public void canMultiply() {
        germ.multiply(3);
        assertEquals(18, germ.getStrength());
    }

}
