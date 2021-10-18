/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package longdthe140396;

import lamvhhe130764.*;
import java.util.concurrent.TimeUnit;
import model.Fruit;
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
public class FruitTest {
    
    public FruitTest() {
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
     * Test of getFruitId method, of class Fruit.
     */
    @Test(timeout= 1000)
    public void testGetFruitId() throws InterruptedException {
        System.out.println("getFruitId");
        Fruit instance = new Fruit();
        instance.setFruitId("12");
        String expResult = "12";
        String result = instance.getFruitId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setFruitId method, of class Fruit.
     */
    @Test(timeout= 1000)
    public void testSetFruitId() {
        System.out.println("setFruitId");
        String fruitId = "12";
        Fruit instance = new Fruit();
        instance.setFruitId(fruitId);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(fruitId, instance.getFruitId());
    }

    /**
     * Test of setFruitName method, of class Fruit.
     */
    @Test(timeout= 1000)
    public void testSetFruitName() {
        System.out.println("setFruitName");
        String fruitName = "apple";
        Fruit instance = new Fruit();
        instance.setFruitName(fruitName);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(fruitName, instance.getFruitName());
    }

    /**
     * Test of setQuantity method, of class Fruit.
     */
    @Test(timeout= 1000)
    public void testSetQuantity() {
        System.out.println("setQuantity");
        int quantity = 3;
        Fruit instance = new Fruit();
        instance.setQuantity(quantity);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(quantity, instance.getQuantity());
    }

    /**
     * Test of setOrigin method, of class Fruit.
     */
    @Test(timeout= 1000)
    public void testSetOrigin() {
        System.out.println("setOrigin");
        String origin = "vn";
        Fruit instance = new Fruit();
        instance.setOrigin(origin);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(origin, instance.getOrigin());
    }
    
}
