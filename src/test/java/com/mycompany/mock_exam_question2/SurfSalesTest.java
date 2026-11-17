
package com.mycompany.mock_exam_question2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class SurfSalesTest {

    public SurfSalesTest() {
    }

    @Test
    public void testGetProductSales_ReturnsSalesArray() {
        SurfSales instance = new SurfSales();
        int[][] result = instance.GetProductSales();
        assertEquals(3, result.length);
        assertArrayEquals(new int[] {520, 380, 150}, result[0]);
    }

    @Test
    public void testGetTotalSales_ReturnsTotalSales() {
        SurfSales instance = new SurfSales();
        int result = instance.GetTotalSales();
        assertEquals(3150, result);
    }

    @Test
    public void testGetSalesOverTarget_ReturnsNumberOfSales() {
        SurfSales instance = new SurfSales();
        int result = instance.GetSalesOverTarget();
        assertEquals(3, result);
    }

    @Test
    public void testGetSalesUnderTarget_ReturnsNumberOfSales() {
        SurfSales instance = new SurfSales();
        int result = instance.GetSalesUnderTarget();
        assertEquals(6, result);
    }

    @Test
    public void testGetYearsProcessed_ReturnsNumberOfYears() {
        SurfSales instance = new SurfSales();
        int result = instance.GetYearsProcessed();
        assertEquals(3, result);
    }

    @Test
    public void testGetAverageSales_ReturnsAverageSales() {
        SurfSales instance = new SurfSales();
        double result = instance.GetAverageSales();
        assertEquals(350.0, result, 0.01);
    }

}
