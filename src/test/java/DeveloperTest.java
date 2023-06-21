import org.example.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Alan", "AN0432834Q", 40000);
    }

    @Test
    public void hasName(){
        assertEquals("Alan", developer.getName());
    }
    @Test
    public void hasNINumber(){
        assertEquals("AN0432834Q", developer.getNINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(40000, developer.getSalary());
    }

}
