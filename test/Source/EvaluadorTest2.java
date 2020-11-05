/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Source;

import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;

/**
 *
 * @author LJChao-PC
 */
@RunWith (Parameterized.class)
public class EvaluadorTest2 {
    
    private Estudiant instance;
    private Evaluador Avaluador;
    
    @Parameter(0)
    public String nombre;
    @Parameter(1)
    public double media;
    @Parameter(2)
    public double primerParcial;
    @Parameter(3)
    public double segundoParcial;
    @Parameter(4)
    public double tercerParcial;
    
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object [][]{
            {"Pedro",5.6,5.0,6.1,5.7},
            {"Lorente",4.6,5.0,5.5,3.3},
            {"Rodrigo",4.06,5.2,0,7},
            {"Enrique",5.0,5.0,5.0,5.0},
            {"Alfredo",7.33,7.0,5.0,10.0},
            {"James",6.0,3.0,7.0,8.0},
            {"Alejandro",5.6,5.0,6.1,5.7},
            {"Sergio",4.6,5.0,5.5,3.3},
            {"Calote",4.06,5.2,0,7},
            {"Prieto",5.0,5.0,5.0,5.0},
            {"Jorge",7.33,7.0,5.0,10.0},
            {"James",5,10,10,0,0},
            {"Alfonso",5.0,10.0,10.0,10.0},
            {"Messi",0,0,0,0},
            {"Frenky",7.5,7.5,7.5,7.5}
            
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
        instance = new Estudiant(nombre,primerParcial,segundoParcial,tercerParcial);
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
        double mediaAv = Avaluador.mitjanaSiSupera(instance);
        if (mediaAv == 0) {
            assertEquals(0,mediaAv,0.1);
        }
        else {
            assertEquals(media,mediaAv,0.1);
        }
        
        
    }

    /**
     * Test of mitjana method, of class Avaluador.
     */
    @Test
    public void testMitjana() throws Exception {
        assertEquals(media,Avaluador.mitjana(instance),0.1);
        
    }

    /**
     * Test of millorEstudiantPerNotaMitjana method, of class Avaluador.
     */
    @Test
    public void testMillorEstudiantPerNotaMitjana() {

    }
    
}
