import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

//    Person
//        has name, health and body with Combatants in it

//    when catches a Disease
//    adds Germ to body
//    Germs deadliness docks Health

//    germs can spawn, docking Health more
//              mutate, increasing Deadliness
//              attack nanobots

//    when drinks some Nanobots
//    adds nanobot to the body


//    nanobot can attack disease
//                disperse medicine

    private Person person;
    private Germ germ;

    @Before
    public void setUp() throws Exception {
        person = new Person("Iain", 100);
        germ = new Germ("Basilskin", 45, 3);
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
}
