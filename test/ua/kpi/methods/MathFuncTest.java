/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.kpi.methods;

import static junit.framework.Assert.assertTrue;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Anton
 */
public class MathFuncTest {

    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of factorial method, of class MathFunc.
     */
    @Test
    public void testFactorialNull() {
        System.out.println("factorial null test");
        MathFunc math = new MathFunc();
        assertTrue(math.factorial() == 1);

    }
    
    @Test
    public void testFactorialPositive() {
        System.out.println("factorial test");
        MathFunc math = new MathFunc(5);
        assertTrue(math.factorial() == 120);
    }

    /**
     * Test of plus method, of class MathFunc.
     */
    @Test
    public void testPlus() {
        System.out.println("plus test");
        MathFunc math = new MathFunc(45);
        assertTrue(math.plus(123) == 168);
    }
    
}
