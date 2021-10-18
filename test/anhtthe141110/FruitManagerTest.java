/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anhtthe141110;

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
import static org.mockito.Mockito.mockStatic;

/**
 *
 * @author Lenovo
 */
public class FruitManagerTest {
    MockedStatic<DataInput> mockData;
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
        mockData = mockStatic(DataInput.class);
    }
    
    @After
    public void tearDown() {
        mockData.close();
    }

    /**
     * Test of deleteFruit method, of class FruitManager. Lab 2.2
     */
    @Test
    public void testDeleteFruit() {
        System.out.println("deleteFruit");
        FruitManager instance = new FruitManager();
        ArrayList<Fruit> res = instance.getFruitList();
        res.add(new Fruit("12", "apple", 0.0, 3, "vn"));
        
       // Test case 1:
        mockData.when(()->DataInput.fruitExisted(res, "14")).thenReturn(true);
        mockData.when(()->DataInput.checkInputString("Enter fruit id: ")).thenReturn("14");
        instance.deleteFruit();
        assertEquals(1, res.size());
        
        // Test case 2:
        mockData.when(()->DataInput.fruitExisted(res, "12")).thenReturn(true);
        mockData.when(()->DataInput.checkInputString("Enter fruit id: ")).thenReturn("12");
        instance.deleteFruit();
       
        // Test case 3:
        res.add(new Fruit("16", "pinaple", 0.1, 4, "vn"));
        mockData.when(()->DataInput.fruitExisted(res, "12")).thenReturn(true);
        mockData.when(()->DataInput.checkInputString("Enter fruit id: ")).thenReturn("12");
        instance.deleteFruit();
    }

    
}
