import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

//    germ1s can
//              mutate, increasing Deadliness


    private Person person;
    private Germ germ1;
    private Germ germ2;
    private Nanobot bot;

    @Before
    public void setUp() throws Exception {
        person = new Person("Iain", 100);
        germ1 = new Germ("Basilskin", 45, 3);
        germ2 = new Germ("Jellyface", 100, 4);
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
        person.catchDisease(germ1);
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

    @Test
    public void canBecomeImmune() {
        assertEquals(0, person.getImmunities().size());
        person.becomeImmune("Jellyface");
        assertEquals(1, person.getImmunities().size());
    }

    @Test
    public void canBeImmune() {
        person.becomeImmune("Jellyface");
        person.catchDisease(germ2);
//        check health hasn't been affected
        assertEquals(100, person.getHealth());
    }
}
