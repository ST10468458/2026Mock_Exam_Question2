
package com.mycompany.mock_exam_question2;


public class SurfSales implements ISurfSales {
    
    private final int TARGET_UNITS = 400;
    private final int[][] productSales = {
        {520, 380, 150},
        {610, 340, 210},
        {450, 290, 200}
    };
    
    @Override
    public int[][] GetProductSales() {
    return productSales;
    }

    @Override
    public int GetTotalSales() {
    int total = 0;
        for (int row = 0; row < productSales.length; row++) {
            for (int col = 0; col < productSales[row].length; col++) {
                total += productSales[row][col];
            }
        }
        return total;
    }

    @Override
    public int GetSalesOverTarget() {
    int count = 0;
        for (int row = 0; row < productSales.length; row++) {
            for (int col = 0; col < productSales[row].length; col++) {
                if (productSales[row][col] > TARGET_UNITS) {           
                    count++;
                }
            }
        }
        return count;
    }

    @Override
    public int GetSalesUnderTarget() {
    int count = 0;
        for (int row = 0; row < productSales.length; row++) {
            for (int col = 0; col < productSales[row].length; col++) {
                if (productSales[row][col] < TARGET_UNITS) {              
                    count++;
                }
            }
        }
        return count;
    }

    @Override
    public int GetYearsProcessed() {
    return productSales.length;
    }

    @Override
    public double GetAverageSales() {
     int howMany = productSales.length * productSales[0].length;     
        return (double) GetTotalSales() / howMany;  
    }
    
    
    
}
