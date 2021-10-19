/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NguyetDMHE140834;

import controller.OrderManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import model.Fruit;
import model.Order;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class OrderManagerTest {
    
    public OrderManagerTest() {
        OrderManager orderManager = new OrderManager();
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
        ArrayList<Fruit> lf = null;
        lf.add(new Fruit("1", "Cam", 1000, 10, "supermaket"));
        Fruit fruit = null;
        int quantity = 10;
        OrderManager instance = new OrderManager();
        instance.shopping(lf, fruit, quantity);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of putToHT method, of class OrderManager.
     */
    @Test
    public void testPutToHT() {
        System.out.println("putToHT");
        String name = " ";
        OrderManager instance = new OrderManager();
        instance.getHT();
        instance.putToHT(name);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getHT method, of class OrderManager.
     */
    @Test
    public void testGetHT() {
        System.out.println("getHT");
        OrderManager instance = new OrderManager();
        instance.getHT();
        HashMap<String, ArrayList<Order>> expResult = null;
        //expResult.getOrDefault(this, instance.getListOrder());
        Hashtable<String, ArrayList<Order>> result = instance.getHT();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getListOrder method, of class OrderManager.
     */
    @Test
    public void testGetListOrder() {
        System.out.println("getListOrder");
        OrderManager instance = new OrderManager();
        instance.getListOrder();
        ArrayList<Order> expResult = null;
        expResult.get(3); 
        ArrayList<Order> result = instance.getListOrder();
        result.add(new Order("1","Cam", 1000, 10));
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of updateOrder method, of class OrderManager.
     */
    @Test
    public void testUpdateOrder(){
        System.out.println("updateOrder");
        ArrayList<Order> lo = null;
        lo.add(new Order("3", "Ngan", 1000, 10));
        String id = "3";
        int quantity = 10;
        OrderManager instance = new OrderManager();
        instance.updateOrder(lo, id, quantity);
        // TODO review the generated test code and remove the default call to fail.
       //fail("The test case is a prototype.");
    }
    
}
