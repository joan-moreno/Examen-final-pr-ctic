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

public class EvaluadorTest1 {
    
    private Estudiant instance;
    private Evaluador Avaluador;
    
    public EvaluadorTest1() {
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
        instance = new Estudiant("Joan",5.0,5.0,5.0);
        Avaluador = new Evaluador();
        
    }
    
    @After
    public void tearDown() {
        instance = null;
        Avaluador = null;
    }

    /**
     * Test of mitjanaSiSupera method, of class Avaluador.
     */
    @Test
    public void testMitjanaSiSupera() throws Exception {
        assertEquals(5.0,Avaluador.mitjana(instance),0.1);
    }

    /**
     * Test of mitjana method, of class Avaluador.
     */
    @Test
    public void testMitjana() throws Exception {
        assertEquals(5.0,Avaluador.mitjana(instance),0.1);
    }

    /**
     * Test of millorEstudiantPerNotaMitjana method, of class Avaluador.
     */
    @Test
    public void testMillorEstudiantPerNotaMitjana()throws Exception {
        Estudiant [] Estudiants = new Estudiant[] {
            new Estudiant("Adria", 7.0, 6.0, 5.0), 
            new Estudiant("Edurne", 8.0, 7.0, 9.0),
            new Estudiant("Nicolas", 4.0, 3.0, 6.0)};
    }
    
}
