/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuandphe1536893;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import model.Fruit;
import model.Fruit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Asus
 */
public class FruitTest {
    private List<String> list;
    public FruitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("@BeforeClass - runOnceBeforeClass");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("@AfterClass - runOnceAfterClass");
    }
    
    @Before
    public void setUp() {
        System.out.println("@Before - runBeforeTestMethod");
    }
    
    @After
    public void tearDown() {
        System.out.println("@After - runAfterTestMethod");
    }

    
    @Test(timeout= 1000)
    public void testGetFruitId() throws InterruptedException {
        System.out.println("testGetFruitId");
        Fruit instance = new Fruit();
        instance.setFruitId("12");
        String expResult = "12";
        String result = instance.getFruitId();
        assertEquals(expResult, result);
        System.out.println(result);
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
        System.out.println(fruitId);
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
        System.out.println(fruitName);
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
        System.out.println(quantity);
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
        System.out.println(origin);
    }

}