/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package lamvhhe130764;

import common.DataInput;
import controller.OrderManager;
import java.util.ArrayList;
import java.util.Hashtable;
import model.Fruit;
import model.Order;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.MockedStatic;
import static org.mockito.Mockito.mockStatic;

/**
 *
 * @author lamvu
 */
public class OrderManagerTest {
    MockedStatic<DataInput> mockData = mockStatic(DataInput.class);
    public OrderManagerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of shopping method, of class OrderManager.
     */
    @Test
    public void testShopping() {
        System.out.println("shopping");
        ArrayList<Fruit> lf = new ArrayList<>();
        Fruit fruit = new Fruit("12", "apple", 12.0, 3, "vn");
        lf.add(fruit);
        int quantity = 1;
        OrderManager instance = new OrderManager();
        ArrayList<Order> res = instance.getListOrder();
        mockData.when(()-> DataInput.checkItemExist(res, "12")).thenReturn(true);
        instance.shopping(lf, fruit, quantity);
        
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(res.size(), 1);
    }

    /**
     * Test of updateOrder method, of class OrderManager.
     */
    @Test
    public void testUpdateOrder() {
        System.out.println("updateOrder");
        String id = "12";
        int quantity = 2;
        OrderManager instance = new OrderManager();
        ArrayList<Order> lo = instance.getListOrder();
        instance.updateOrder(lo, id, quantity);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
