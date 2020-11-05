/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Source;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuario
 */
public class EstudiantTest {
    
    public EstudiantTest() {
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
     * Test of getPrimerParcial method, of class Estudiant.
     */
    @Test
    public void testGetPrimerParcial() {
        System.out.println("getPrimerParcial");
        Estudiant instance = null;
        double expResult = 0.0;
        double result = instance.getPrimerParcial();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSegundoParcial method, of class Estudiant.
     */
    @Test
    public void testGetSegundoParcial() {
        System.out.println("getSegundoParcial");
        Estudiant instance = null;
        double expResult = 0.0;
        double result = instance.getSegundoParcial();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTercerParcial method, of class Estudiant.
     */
    @Test
    public void testGetTercerParcial() {
        System.out.println("getTercerParcial");
        Estudiant instance = null;
        double expResult = 0.0;
        double result = instance.getTercerParcial();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Override
    public String toString() {
        return "EstudiantTest{" + '}';
    }

    /**
     * Test of toString method, of class Estudiant.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Estudiant instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Estudiant.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Estudiant instance = null;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
