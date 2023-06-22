import org.example.Developer;
import org.example.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("OT6473G", 70000, "Programming", 10000000);
    }

    @Test
    public void hasName(){
        assertEquals("Steve", director.getName("Steve"));
    }
    @Test
    public void hasNINumber(){
        assertEquals("OT6473G", director.getNINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(70000, director.getSalary());
    }

    @Test
    public void hasDepartment(){
        assertEquals("Programming", director.getDeptName());
    }

    @Test
    public void hasBudget(){
        assertEquals(10000000, director.getBudget(), 0.0);
    }
}
