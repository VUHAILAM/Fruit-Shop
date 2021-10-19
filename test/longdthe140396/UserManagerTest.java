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
    @Test
    public void testAddUser() {
        System.out.println("addUser");
        UserManager instance = new UserManager();
        instance.addUser();
        fail("The test case is a prototype.");
    }
    @Test
    public void testUpdateUser() {
        System.out.println("updateUser");
        UserManager instance = new UserManager();
        instance.updateUser();
        fail("The test case is a prototype.");
    }
    @Test
    public void testDeleteUser() {
        System.out.println("deleteUser");
        UserManager instance = new UserManager();
        instance.deleteUser();
        fail("The test case is a prototype.");
    }
    
}