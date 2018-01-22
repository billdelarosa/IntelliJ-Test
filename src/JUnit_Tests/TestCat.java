package JUnit_Tests;
import com.company.*;
import org.junit.*;


public class TestCat extends junit.framework.TestCase {
    private int mousesKilled;

    @Test
    public void testCat() {
        Cat cat = new Cat(0, "Test");
        assertTrue("Mice killed is not less than zero", cat.getMousesKilled() >= 0);
        assertTrue("Cat name is not equal to null", cat.getName() != null);
    }

    public void testSetUp() {
        mousesKilled = 0;
        assertEquals("Mice Killed should be zero", 0, mousesKilled);
    }

    public void testAddMice() {
        mousesKilled++;
        assertTrue("Mice killed should be less than 0", mousesKilled > 0);
    }

    public void testGetMiceKilled() {
        // Not sure if it's necessary to test a getter/setter.
        assertEquals("Mice killed returned should be equal to amount of mice killed", this.mousesKilled, mousesKilled);
    }
}
