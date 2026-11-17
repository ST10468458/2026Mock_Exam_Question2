
package com.mycompany.mock_exam_question2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class SurfSalesTest {
    
    public SurfSalesTest() {
    }

    @Test
    public void testGetProductSales() {
        System.out.println("GetProductSales");
        SurfSales instance = new SurfSales();
        int[][] expResult = null;
        int[][] result = instance.GetProductSales();
        assertArrayEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetTotalSales() {
        System.out.println("GetTotalSales");
        SurfSales instance = new SurfSales();
        int expResult = 0;
        int result = instance.GetTotalSales();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetSalesOverTarget() {
        System.out.println("GetSalesOverTarget");
        SurfSales instance = new SurfSales();
        int expResult = 0;
        int result = instance.GetSalesOverTarget();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetSalesUnderTarget() {
        System.out.println("GetSalesUnderTarget");
        SurfSales instance = new SurfSales();
        int expResult = 0;
        int result = instance.GetSalesUnderTarget();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetYearsProcessed() {
        System.out.println("GetYearsProcessed");
        SurfSales instance = new SurfSales();
        int expResult = 0;
        int result = instance.GetYearsProcessed();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetAverageSales() {
        System.out.println("GetAverageSales");
        SurfSales instance = new SurfSales();
        double expResult = 0.0;
        double result = instance.GetAverageSales();
        assertEquals(expResult, result, 0);
        fail("The test case is a prototype.");
    }
    
}
