package JUnit_Tests;

import com.company.*;
import org.junit.*;

public class TestDog extends junit.framework.TestCase {
    private boolean isFriendly;
    private String name;


    public void testForDogNameAndFriendlyValues() {
        Dog dog = new Dog(true, "TestDog");
        this.isFriendly = dog.isFriendly();
        this.name = dog.getName();
        assertTrue("Dog should be friendly", isFriendly);
        assertEquals("Dog name should be 'TestDog'", this.name, name);
    }

    public void testSetUp() {
        isFriendly = true;
        assertTrue("Dog should be friendly", isFriendly);
    }

    public void testIsDogFriendlyAfterSetUp() {
        testSetUp();
        assertTrue("Dog should be friendly", isFriendly);
    }
}
