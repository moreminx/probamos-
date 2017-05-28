/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findemesrendimiento1;

import java.util.ArrayList;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author isma
 */
@RunWith(Parameterized.class)
public class MainTest {
    
    private int numero1;
    private int numero2;
    private String resultado;

    public MainTest(int numero1, int numero2, String resultado) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.resultado = resultado;
    }
    
@Parameters
public static Collection<Object[]> datos() {

    ArrayList pruebas = new ArrayList();
    Object[] prueba1 = {100,-10,"SI"};
    Object[] prueba2 = {-10,-100, "NO"};
    Object[] prueba3 = {-10,100, "SI"};
    Object[] prueba4 = {100,-1000, "NO"};
    Object[] prueba5 = {-10000,10000, "SI"};
    Object[] prueba6 = {10000,-10000, "SI"};
    pruebas.add(prueba1);
    pruebas.add(prueba2);
    pruebas.add(prueba3);
    pruebas.add(prueba4);
    pruebas.add(prueba5);
    pruebas.add(prueba6);
    return pruebas;

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
     * Test of main method, of class Main.
     */
//    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Main.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of casoDePrueba method, of class Main.
     */
    @Test
    public void testCasoDePrueba() {
        System.out.println("casoDePrueba");
        int n1 = this.numero1;
        int n2 = this.numero2;
        String expResult = this.resultado;
        String result = Main.casoDePrueba(n1, n2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
