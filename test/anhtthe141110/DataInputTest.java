/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anhtthe141110;

import common.DataInput;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;
import model.Fruit;
import model.Order;
import model.User;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mockito;

/**
 *
 * @author Lenovo
 */
public class DataInputTest {

    public DataInputTest() {
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
     * Test of checkInputIntLimit method, of class DataInput.
     */
//    @Test
//    public void testCheckInputIntLimit_3args() {
//        System.out.println("checkInputIntLimit");
//        String msg = "";
//        int min = 0;
//        int max = 0;
//        int expResult = 0;
//        int result = DataInput.checkInputIntLimit(msg, min, max);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    /**
     * Test of checkPassword method, of class DataInput.
     */
//    @Test
//    public void testCheckPassword() {
//        System.out.println("checkPassword");
//        String msg = "";
//        String expResult = "";
//        String result = DataInput.checkPassword(msg);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
    void setupMock() {
        Scanner mockScanner = Mockito.mock(Scanner.class);
        Mockito.when(mockScanner.nextLine()).thenReturn("32");
    }
    
    /**
     * Test of checkInputIntLimit method, of class DataInput. Lab 2.1
     */
    @Test(expected = Exception.class)
    public void testCheckInputIntLimit_int_int() throws Exception {
        System.out.println("checkInputIntLimit");
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        String input = "abc";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        //int expResult = 32;
        int result = DataInput.checkInputIntLimit(min, max);
    }  

    // Lab 2.2
    @Test
    public void testCheckInputInt() throws Exception{
        System.out.println("checkInputInt");
        String smg = "";
        
        // Test case 1: 
        String input = "abc";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        //int expResult = 32;
        int result = DataInput.checkInputInt(smg);
        
        // Test case2:
        String input1 = "32";
        InputStream in1 = new ByteArrayInputStream(input1.getBytes());
        System.setIn(in1);
        int expResult = 32;
        int result1 = DataInput.checkInputInt(smg);
        assertEquals(expResult, result1);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Test of checkInputDouble method, of class DataInput. Lab 2.1
     */
    @Test(expected = Exception.class)
    public void testCheckInputDouble() throws Exception{
        System.out.println("checkInputDouble");
        String smg = "";
        double min = Double.MAX_VALUE;
        double max = Double.MAX_VALUE;
        String input = "abc";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        double result = DataInput.checkInputDouble(smg, min, max);
        //assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
