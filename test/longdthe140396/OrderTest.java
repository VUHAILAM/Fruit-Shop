/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package longdthe140396;

import lamvhhe130764.*;
import model.Order;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lamvu
 */
public class OrderTest {
    
    public OrderTest() {
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
     * Test of setFruitId method, of class Order.
     */
    @Test(timeout= 1000)
    public void testSetFruitId() {
        System.out.println("setFruitId");
        String fruitId = "12";
        Order instance = new Order();
        instance.setFruitId(fruitId);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(fruitId, instance.getFruitId());
    }

    /**
     * Test of setFruitName method, of class Order.
     */
    @Test(timeout= 1000)
    public void testSetFruitName() {
        System.out.println("setFruitName");
        String fruitName = "apple";
        Order instance = new Order();
        instance.setFruitName(fruitName);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(fruitName, instance.getFruitName());
    }

    /**
     * Test of setQuantity method, of class Order.
     */
    @Test(timeout= 1000)
    public void testSetQuantity() {
        System.out.println("setQuantity");
        int quantity = 3;
        Order instance = new Order();
        instance.setQuantity(quantity);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(quantity, instance.getQuantity());
    }
    
}
