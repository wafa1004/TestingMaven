import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by sinen on 2017-09-02.
 */
public class AddTest {

    @Test
    public void testAddApp() {
        Add add = new Add();
        assertEquals(add.add(), 11);
    }
}
