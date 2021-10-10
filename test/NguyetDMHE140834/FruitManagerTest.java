/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NguyetDMHE140834;

import controller.FruitManager;
import java.util.ArrayList;
import model.Fruit;
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
public class FruitManagerTest {
    
    public FruitManagerTest() {
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
     * Test of addFruit method, of class FruitManager.
     */
    @Test
    public void testAddFruit() {
        System.out.println("addFruit");
        FruitManager instance = new FruitManager();
        
        instance.addFruit();
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of updateFruit method, of class FruitManager.
     */
    @Test
    public void testUpdateFruit() {
        System.out.println("updateFruit");
        FruitManager instance = new FruitManager();
        instance.updateFruit();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteFruit method, of class FruitManager.
     */
    @Test
    public void testDeleteFruit() {
        System.out.println("deleteFruit");
        FruitManager instance = new FruitManager();
        instance.deleteFruit();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFruitList method, of class FruitManager.
     */
    @Test
    public void testGetFruitList() {
        System.out.println("getFruitList");
        FruitManager instance = new FruitManager();
        ArrayList<Fruit> expResult = null;
        ArrayList<Fruit> result = instance.getFruitList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFruitByItem method, of class FruitManager.
     */
    @Test
    public void testGetFruitByItem() {
        System.out.println("getFruitByItem");
        int item = 1;
        FruitManager instance = new FruitManager();
        //instance.getFruitByItem(1);
        Fruit expResult = null;
        
//        expResult.setFruitId("1");
//        expResult.setFruitName("organe");
//        expResult.setOrigin("supermaket");
//        expResult.setPrice(1000);
//        expResult.setQuantity(10);
        Fruit result = instance.getFruitByItem(item);
        

        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of saveToFile method, of class FruitManager.
     */
    @Test
    public void testSaveToFile() {
        System.out.println("saveToFile");
        FruitManager instance = new FruitManager();
        instance.saveToFile();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of readFruitListFromFile method, of class FruitManager.
     */
    @Test
    public void testReadFruitListFromFile() {
        System.out.println("readFruitListFromFile");
        FruitManager instance = new FruitManager();
       
        instance.readFruitListFromFile();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
