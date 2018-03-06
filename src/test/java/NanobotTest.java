import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NanobotTest {

    private Nanobot bot;

    @Before
    public void setUp() throws Exception {
        bot = new Nanobot(4);
    }

//    can get Strength

    @Test
    public void canGetStrength() {
        assertEquals(4, bot.getStrength());
    }

//    can attack a Germ

//    experiment with can deliver medicine
}
