import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GermTest {

    private Germ germ;
    private Nanobot bot;

    @Before
    public void setUp() throws Exception {
        germ = new Germ("Gary", 6, 3);
        bot = new Nanobot("Clor", 15, 7);
    }

    @Test
    public void canAttackNanobot() {
        germ.attack(bot);
        assertEquals(12, bot.getStrength());
    }

    //    can multiply by a factor, which will increase deadliness

    @Test
    public void canMultiply() {
        germ.multiply(3);
        assertEquals(18, germ.getStrength());
    }


//    can attack a nanobot

//    experiment with hurting human's health

}
