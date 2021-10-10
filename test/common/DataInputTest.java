/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package common;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import model.Fruit;
import model.Order;
import model.User;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author YenNTHHE141078
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
     * YenNTHHE141078
     * Test of checkInputIntLimit method, of class DataInput.
     */
    @Test
    public void testCheckInputIntLimit_3args() {
        System.out.println("checkInputIntLimit");
        String msg = "";
        int min = 0;
        int max = 100;
        
        //right input in [0-100]
        String input = "50";
        
        //wrong input
        //String input = "500";
        //String input = "abc";
        //String input = " ";
        
        //read from input
        InputStream sysInBackup = System.in;
        InputStream is = new ByteArrayInputStream(input.getBytes());
        System.setIn(is);
        
        //expected result
        int expResult = 50;
        int result = DataInput.checkInputIntLimit(msg, min, max);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        System.setIn(sysInBackup);
    }

    /**
     * Test of checkPassword method, of class DataInput.
     */
    @Test
    public void testCheckPassword() {
        System.out.println("checkPassword");
        String msg = "";
        String expResult = "";
        String result = DataInput.checkPassword(msg);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * YenNTHHE141078 
     * Test of checkInputIntLimit method, of class DataInput.
     */
    @Test
    public void testCheckInputIntLimit_int_int() {
        System.out.println("checkInputIntLimit");
        int min = 0;
        int max = 100;
        
        //right input in [0-100]
        //String input = "50";
        
        //wrong input
        //String input = "500";
        //String input = "abc";
        String input = " ";
        
        //read from input
        InputStream is = new ByteArrayInputStream(input.getBytes());
        System.setIn(is);
        
        //expected result
        int expResult = 50;
        
        int result = DataInput.checkInputIntLimit(min, max);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * YenNTHHE141078
     * Test of checkInputString method, of class DataInput.
     */
    @Test
    public void testCheckInputString() {
        System.out.println("checkInputString");
        String smg = "";
        
        //right input is a string
        String input = "JUnit";
        
        //wrong input
        //String input = "  ";
        
        //read from input
        InputStream is = new ByteArrayInputStream(input.getBytes());
        System.setIn(is);
        
        //expected result
        String expResult = "";
        String result = DataInput.checkInputString(smg);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of checkInputUsername method, of class DataInput.
     */
    @Test
    public void testCheckInputUsername() {
        System.out.println("checkInputUsername");
        ArrayList<User> userList = null;
        String msg = "";
        String expResult = "";
        String result = DataInput.checkInputUsername(userList, msg);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * YenNTHHE141078
     * Test of checkInputInt method, of class DataInput.
     */
    @Test
    public void testCheckInputInt() {
        System.out.println("checkInputInt");
        String smg = "";
        
        //right input in [0-100]
        String input = "50";
        
        //wrong input
        //String input = "500";
        //String input = "abc";
        //String input = " ";
        
        //read from input
        InputStream is = new ByteArrayInputStream(input.getBytes());
        System.setIn(is);
        
        //expected result
        int expResult = 50;
        int result = DataInput.checkInputInt(smg);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * YenNTHHE141078
     * Test of checkInputDouble method, of class DataInput.
     */
    @Test
    public void testCheckInputDouble() {
        System.out.println("checkInputDouble");
        String smg = "";
        double min = 0.0;
        double max = 100.0;
        
        //right input in [0-100]
        String input = "50.0";
        
        //wrong input
        //String input = "500.0";
        //String input = "abc";
        //String input = " ";
        
        //read from input
        InputStream is = new ByteArrayInputStream(input.getBytes());
        System.setIn(is);
        
        //expected result
        double expResult = 50.0;
        double result = DataInput.checkInputDouble(smg, min, max);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * YenNTHHE141078
     * Test of checkInputYN method, of class DataInput.
     */
    @Test
    public void testCheckInputYN() {
        System.out.println("checkInputYN");
        
        //right input in [0-100]
        //String input = "Y";
        //String input = "N";
        
        //wrong input
        //String input = "500";
        //String input = "abc";
        String input = " ";
        
        //read from input
        InputStream is = new ByteArrayInputStream(input.getBytes());
        System.setIn(is);
        
        //expected result
        boolean expResult = false;
        boolean result = DataInput.checkInputYN();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of fruitExisted method, of class DataInput.
     */
    @Test
    public void testFruitExisted() {
        System.out.println("fruitExisted");
        ArrayList<Fruit> lf = null;
        String id = "";
        boolean expResult = false;
        boolean result = DataInput.fruitExisted(lf, id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of userExisted method, of class DataInput.
     */
    @Test
    public void testUserExisted() {
        System.out.println("userExisted");
        ArrayList<User> userList = null;
        int userCode = 0;
        boolean expResult = false;
        boolean result = DataInput.userExisted(userList, userCode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkItemExist method, of class DataInput.
     */
    @Test
    public void testCheckItemExist() {
        System.out.println("checkItemExist");
        ArrayList<Order> lo = null;
        String id = "";
        boolean expResult = false;
        boolean result = DataInput.checkItemExist(lo, id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
