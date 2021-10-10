/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package lamvhhe130764;

import common.DataInput;
import controller.FruitManager;
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
    MockedStatic<DataInput> mockData = mockStatic(DataInput.class);
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
    
    public void setupMockAddFruitObject() {
        mockData.when(()->DataInput.checkInputString("Enter fruit id: ")).thenReturn("12");
        mockData.when(()->DataInput.checkInputString("Enter fruit name: ")).thenReturn("apple");
        mockData.when(()->DataInput.checkInputDouble("Enter price: ", Double.MIN_VALUE, Double.MAX_VALUE)).thenReturn(123.0);
        mockData.when(()->DataInput.checkInputInt("Enter quantity: ")).thenReturn(3);
        mockData.when(()->DataInput.checkInputString("Enter origin: ")).thenReturn("vn");
        mockData.when(()->DataInput.checkInputYN()).thenReturn(false);
    }
     public void setupMockUpdateFruitObject() {
        mockData.when(()->DataInput.checkInputString("Enter fruit id: ")).thenReturn("12");
        mockData.when(()->DataInput.checkInputString("Enter fruit name: ")).thenReturn("apple");
        mockData.when(()->DataInput.checkInputDouble("Enter price: ", Double.MIN_VALUE, Double.MAX_VALUE)).thenReturn(120.0);
        mockData.when(()->DataInput.checkInputInt("Enter quantity: ")).thenReturn(3);
        mockData.when(()->DataInput.checkInputString("Enter origin: ")).thenReturn("vn");
        mockData.when(()->DataInput.checkInputYN()).thenReturn(false);
    }
    /**
     * Test of addFruit method, of class FruitManager.
     */
    @Test
    public void testAddFruit() {
        System.out.println("addFruit");
        FruitManager instance = new FruitManager();
        setupMockAddFruitObject();
        instance.addFruit();
        ArrayList<Fruit> res = instance.getFruitList();
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(1, res.size());
    }

    /**
     * Test of updateFruit method, of class FruitManager.
     */
    @Test
    public void testUpdateFruit() {
        System.out.println("updateFruit");
        FruitManager instance = new FruitManager();
        ArrayList<Fruit> res = instance.getFruitList();
        res.add(new Fruit("12", "apple", 0.0, 3, "vn"));
        mockData.when(()->DataInput.fruitExisted(res, "12")).thenReturn(true);
        setupMockUpdateFruitObject();
        instance.updateFruit();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of deleteFruit method, of class FruitManager.
     */
    @Test
    public void testDeleteFruit() {
        System.out.println("deleteFruit");
        FruitManager instance = new FruitManager();
        ArrayList<Fruit> res = instance.getFruitList();
        res.add(new Fruit("12", "apple", 0.0, 3, "vn"));
        mockData.when(()->DataInput.fruitExisted(res, "12")).thenReturn(true);
        mockData.when(()->DataInput.checkInputString("Enter fruit id: ")).thenReturn("12");
        instance.deleteFruit();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
