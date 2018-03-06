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
}
