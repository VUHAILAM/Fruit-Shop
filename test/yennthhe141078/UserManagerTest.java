/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package yennthhe141078;

import controller.UserManager;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import model.User;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Pumpkin
 */
public class UserManagerTest {

    public UserManagerTest() {
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
     * Test of getListAccounts method, of class UserManager.
     */
    @Test
    public void testGetListAccounts() {
        System.out.println("getListAccounts");
        List<String> expResult = null;
        List<String> result = UserManager.getListAccounts();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkLogin method, of class UserManager.
     */
    @Test
    public void testCheckLogin() {
        System.out.println("checkLogin");

        //pass
//        int id = 1;
//        String userName = "hoangyen";
//        String password = "1234567";
//        int type = 1;

        //not pass with wrong username input without first character is letter
//        int id = 1;
//        String userName = "1hoangyen";
//        String password = "1234567";
//        int type = 1;

        //not pass with wrong username input less than 5 character
//        int id = 1;
//        String userName = "hy";
//        String password = "1234567";
//        int type = 1;

        //not pass with wrong password less than 6 character
//        int id = 1;
//        String userName = "hoangyen";
//        String password = "123";
//        int type = 1;
//        User user = new User(id, userName, password, type);

        //not pass with wrong password contains not letter or number characters
//        int id = 1;
//        String userName = "hoangyen";
//        String password = "*1234567";
//        int type = 1;
        
        //not pass with wrong user compares with data
        int id = 1;
        String userName = "hoangyen";
        String password = "0000000";
        int type = 1;
        
        User user = new User(id, userName, password, type);
        boolean expResult = true;
        boolean result = UserManager.checkLogin(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of changePassword method, of class UserManager.
     */
    @Test
    public void testChangePassword() {
        System.out.println("changePassword");
        User user = new User(1, "hoangyen", "1234567", 1);
        
        //pass
//        String newPassword = "0000000";
        
        //not pass with wrong password less than 6 character
//        String newPassword = "123";
        
        //not pass with wrong password contains not letter or number characters
        String newPassword = "*1234567";
        
        UserManager.changePassword(user, newPassword);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of saveAccount method, of class UserManager.
     */
    @Test
    public void testSaveAccount() {
        System.out.println("saveAccount");
        List<String> listUsers = null;
        UserManager.saveAccount(listUsers);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserList method, of class UserManager.
     */
    @Test
    public void testGetUserList() {
        System.out.println("getUserList");
        ArrayList<User> expResult = null;
        ArrayList<User> result = UserManager.getUserList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addUser method, of class UserManager.
     */
    @Test
    public void testAddUser() {
        System.out.println("addUser");
        UserManager instance = new UserManager();
        instance.addUser();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateUser method, of class UserManager.
     */
    @Test
    public void testUpdateUser() {
        System.out.println("updateUser");
        UserManager instance = new UserManager();
        instance.updateUser();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteUser method, of class UserManager.
     */
    @Test
    public void testDeleteUser() {
        System.out.println("deleteUser");
        UserManager instance = new UserManager();
        instance.deleteUser();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reloadUserList method, of class UserManager.
     */
    @Test
    public void testReloadUserList() {
        System.out.println("reloadUserList");
        UserManager instance = new UserManager();
        instance.reloadUserList();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveToFile method, of class UserManager.
     */
    @Test
    public void testSaveToFile() {
        System.out.println("saveToFile");
        UserManager instance = new UserManager();
        instance.saveToFile();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
