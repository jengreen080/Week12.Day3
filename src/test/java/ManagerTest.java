import org.example.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void before(){
        manager = new Manager( "DV0992834J", 50000, "Bridges and Civils");
    }

    @Test
    public void hasName(){
        assertEquals("Dave", manager.getName("Dave"));
    }
    @Test
    public void hasNINumber(){
        assertEquals("DV0992834J", manager.getNINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(50000, manager.getSalary());
    }

    @Test
    public void hasDepartment(){
        assertEquals("Bridges and Civils", manager.getDeptName());
    }

    @Test
    public void checkRaiseSalary(){
        manager.raiseSalary(1000.00);
        assertEquals(51000, manager.getSalary());
    }

    @Test
    public void checkPayBonus(){
//        manager.payBonus();
        assertEquals(500, manager.payBonus(), 0.0);
    }
}
