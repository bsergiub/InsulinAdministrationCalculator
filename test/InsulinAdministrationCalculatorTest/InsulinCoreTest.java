
package InsulinAdministrationCalculatorTest;

import InsulinAdministrationCalculator.InsulinCore;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sergiu Borlovan <sergiuborlovan.co.uk>
 */
public class InsulinCoreTest {
    
    public InsulinCoreTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }


    /**
     * Test of calculateInsulinForCarbs method, of class InsulinCore.
     */
    @Test
    public void testInsulinForCarbs() {
        System.out.println("insulinForCarbs");
        String carbs = "44";
        InsulinCore instance = new InsulinCore();
        int expResult = 4;
        int result = instance.insulinForCarbs(carbs);
        assertEquals(expResult, result);

    }
    
    @Test
    public void testInsulinForCarbs2() {
        System.out.println("insulinForCarbs");
        String carbs = "45";
        InsulinCore instance = new InsulinCore();
        int expResult = 5;
        int result = instance.insulinForCarbs(carbs);
        assertEquals(expResult, result);

    }
    
    @Test
    public void testInsulinForCarbs3() {
        System.out.println("insulinForCarbs");
        String carbs = "46";
        InsulinCore instance = new InsulinCore();
        int expResult = 5;
        int result = instance.insulinForCarbs(carbs);
        assertEquals(expResult, result);

    }


    /**
     * Test of insulinForCorrection method, of class InsulinCore.
     */
    @Test
    public void testInsulinForCorrection() {
        System.out.println("insulinForCorrection");
        double BMs = 9.9;
        InsulinCore instance = new InsulinCore();
        int expResult = 0;
        int result = instance.insulinForCorrection(BMs);
        assertEquals(expResult, result);
    }

    @Test
    public void testInsulinForCorrection2() {
        System.out.println("insulinForCorrection");
        double BMs = 10.0;
        InsulinCore instance = new InsulinCore();
        int expResult = 1;
        int result = instance.insulinForCorrection(BMs);
        assertEquals(expResult, result);
    }

    @Test
    public void testInsulinForCorrection3() {
        System.out.println("insulinForCorrection");
        double BMs = 4;
        InsulinCore instance = new InsulinCore();
        int expResult = 0;
        int result = instance.insulinForCorrection(BMs);
        assertEquals(expResult, result);
    }

    @Test
    public void testInsulinForCorrection4() {
        System.out.println("insulinForCorrection");
        double BMs = 33.4;
        InsulinCore instance = new InsulinCore();
        int expResult = 8;
        int result = instance.insulinForCorrection(BMs);
        assertEquals(expResult, result);
    }

}
