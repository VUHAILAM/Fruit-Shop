/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longdthe140396;

/**
 *
 * @author Dao Thanh Long
 */
import common.DataInput;
import controller.FruitManager;
import controller.UserManager;
import java.util.ArrayList;
import model.Fruit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.MockedStatic;
import static org.mockito.Mockito.*;

/**
 *
 * @author lamvu
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
    @Test
    public void testAddFruit() {
        System.out.println("addFruit");
        FruitManager instance = new FruitManager();       
        instance.addFruit();
        fail("The test case is a prototype.");
    }
    @Test
    public void testUpdateFruit() {
        System.out.println("updateFruit");
        FruitManager instance = new FruitManager();
        instance.updateFruit();
        fail("The test case is a prototype.");
    }
    @Test
    public void testDeleteFruit() {
        System.out.println("deleteFruit");
        FruitManager instance = new FruitManager();
        instance.deleteFruit();
        fail("The test case is a prototype.");
    }
}
