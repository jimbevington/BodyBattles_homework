import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NanobotTest {

    private Nanobot bot;
    private Germ germ;

    @Before
    public void setUp() throws Exception {
        bot = new Nanobot("Starship Trooper", 15, 4);
        germ = new Germ("Damasio", 10, 6);
    }

    @Test
    public void canGetStrength() {
        assertEquals(15, bot.getStrength());
    }

    @Test
    public void canSetStrength(){
        bot.setStrength(10);
        assertEquals(10, bot.getStrength());
    }

    @Test
    public void canGetAttackPower() {
        assertEquals(4, bot.getAttackPower());
    }

    //    test can attack germ

    @Test
    public void canAttackGerm() {
        bot.attack(germ);
        assertEquals(6, germ.getStrength());
    }

    //    experiment with can deliver medicine
}
