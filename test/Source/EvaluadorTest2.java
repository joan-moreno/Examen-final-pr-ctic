/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Source;

import java.security.InvalidParameterException;
import java.util.Arrays;
import java.util.Collection;
import org.hamcrest.CoreMatchers;
import org.hamcrest.core.Is;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Usuario
 */
@RunWith(Parameterized.class)
public class EvaluadorTest2 {
    private Evaluador instance;

    @Parameter(0)
    public Estudiant nom;
    @Parameter(1)
    public Estudiant primerParcial;
    @Parameter(2)
    public Estudiant segundoParcial;
    @Parameter(3)
    public Estudiant tercerParcial;


    
    @Parameters
    public static Collection<Object[]> data() {
        
        
        Object[][] data = new Object[][] {
            {
                new Estudiant("Pedro", 10, 8, 2), 
                new Estudiant("Raul", 5, 4, 3),  
                new Estudiant("Lazaro", 5, 7, 2), 
                new Estudiant("Rosario", 8, 3, 5), 
            }   
        };
        return Arrays.asList(data);
    }
        
    public EvaluadorTest2() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Iniciando tests ...");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Acabando tests ...");
    }
    
    @Before
    public void setUp() {
        instance = new Evaluador();
    }
    
    @After
    public void tearDown() {
        instance = null;
    }

    /**
     * Test of mitjanaSiSupera method, of class Evaluador.
     */
    @Test
    public void testMitjanaSiSuperathrows() throws Exception {
        thrown.expect(Exception.class);
        thrown.expectCause(Is.isA(InvalidParameterException.class));
     thrown.expectMessage(CoreMatchers.startsWith("Nota insuficiente"));   
    }

    /**
     * Test of mitjana method, of class Evaluador.
     */
    @Test
    public void testMitjana() throws Exception {
        instance.mitjana(nom);
        instance.mitjana(primerParcial);
        instance.mitjana(segundoParcial);
        instance.mitjana(tercerParcial);   
        instance.mitjana(Estudiant);
        
    }

    /**
     * Test of millorEstudiantPerNotaMitjana method, of class Evaluador.
     */
    @Test
    public void testMillorEstudiantPerNotaMitjana() throws Exception {

    
    }
   
}
