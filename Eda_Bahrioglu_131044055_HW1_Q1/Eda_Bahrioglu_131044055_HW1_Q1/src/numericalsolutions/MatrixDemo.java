/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numericalsolutions;

import java.util.Scanner;

/**
 *
 * @author eda
 */
public class MatrixDemo {
    private int Size;
    
    /**
     *
     * @param size
     */
    public MatrixDemo(int size){
        Size = size;
    }
    
    /**
     *
     * @return
     */
    public int getSize(){
        return Size;
    }

    /**
     *main function
     * @param args
     */
    public static void main(String args[])
    {
        Context context = new Context();
        Scanner scan = new Scanner(System.in);
        double res=0;
        int size = 0;
        
        System.out.println("\nEnter matrixsize");
        if(scan.hasNextInt()){
            size = scan.nextInt();
        }
        
        try
        {
            MatrixDemo m = new MatrixDemo(size);
            double[][] Matrix = new double[size][size];
            double[] Result = new double[size];

            System.out.println("\nEnter coefficient of equations");
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    Matrix[i][j] = scan.nextDouble();

                }
            }

            System.out.println("\nEnter coefficient of equation result");
            for (int i = 0; i < size; i++) {
                Result[i] = scan.nextInt();
            }

            context.Output(Matrix, Result);
        }
        catch (NumberFormatException ex) 
        {
            //If input is not number ,Equation has not solve. 
            System.out.println("\nEquation has not solve.");
        }
        
    }
}
