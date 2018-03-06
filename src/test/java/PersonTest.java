import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

//    germs can
//              mutate, increasing Deadliness


    private Person person;
    private Germ germ;
    private Nanobot bot;

    @Before
    public void setUp() throws Exception {
        person = new Person("Iain", 100);
        germ = new Germ("Basilskin", 45, 3);
        bot = new Nanobot(50, 10);
    }

    @Test
    public void canCheckHealth() {
        assertEquals(100, person.getHealth());
    }

    @Test
    public void hasEmptyBody(){
        assertEquals(0, person.bodyCount());
    }

    @Test
    public void canCatchADisease() {
        person.catchDisease(germ);
        assertEquals(1, person.bodyCount());
        assert(person.getBody().get(0) instanceof Germ);
        assertEquals(55, person.getHealth());
    }

    @Test
    public void canEatNanobot(){
        person.eatNanobot(bot);
        assertEquals(1, person.bodyCount());
        assert(person.getBody().get(0) instanceof Nanobot);
    }

    @Test
    public void canIncreaseHealth() {
        person.increaseHealth(50);
        assertEquals(150, person.getHealth());
    }
}
