package validator.entities;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PasswordValidatorTest {

    public PasswordValidatorTest() {
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
    public void testLongMin() {
        System.out.print("longMin = ");
        String password = "asdasd3";
        PasswordValidator instance = new PasswordValidator();
        boolean expResult = true;
        boolean result = instance.longMin(password);
        System.out.println(result);
        assertEquals(expResult, result);
    }

    @Test
    public void testSpecialChar() {
        System.out.print("specialChar = ");
        String password = "@sdw2as";
        PasswordValidator instance = new PasswordValidator();
        boolean expResult = true;
        boolean result = instance.specialChar(password);
        System.out.println(result);
        assertEquals(expResult, result);
    }

    @Test
    public void testContMayus() {
        System.out.print("contMayus = ");
        String password = "sdfDFsdf";
        PasswordValidator instance = new PasswordValidator();
        boolean expResult = true;
        boolean result = instance.contMayus(password);
        System.out.println(result);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsValid() {
        System.out.print("isValid = ");
        String passwod = "asd@SDasd";
        PasswordValidator instance = new PasswordValidator();
        boolean expResult = true;
        boolean result = instance.isValid(passwod);
        System.out.println(result);
        assertEquals(expResult, result);
    }

}
