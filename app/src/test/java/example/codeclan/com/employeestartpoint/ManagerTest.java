package example.codeclan.com.employeestartpoint;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNull;
import static org.junit.Assert.*;

/**
 * Created by michaelslevin on 24/10/2017.
 */

public class ManagerTest {
    Manager manager;

    @Before
    public void before() {
        manager = new Manager(3, "John Price", "RX333", 35000);
    }

    @Test
    public void testGetManagerId(){
        assertEquals(3, manager.getName();
    }
}

