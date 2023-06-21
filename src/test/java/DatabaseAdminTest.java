import org.example.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Alan", "AN0432834Q", 40000);
    }

    @Test
    public void hasName(){
        assertEquals("Alan", databaseAdmin.getName());
    }
    @Test
    public void hasNINumber(){
        assertEquals("AN0432834Q", databaseAdmin.getNINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(40000, databaseAdmin.getSalary());
    }

}
