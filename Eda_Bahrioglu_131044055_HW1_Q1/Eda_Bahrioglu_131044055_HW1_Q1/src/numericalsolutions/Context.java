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
public class Context {
   
    /**
     *
     */
    public Context(){
       
   }

    /**
     *Matrix Inverse and Gauss Elimination Output function
     * @param Matrix
     * @param Result
     */
    public void Output(double[][] Matrix, double[] Result)
   {
       Scanner scan = new Scanner(System.in);
       Inversion inversion = new Inversion();
       Gaussian gaussian = new Gaussian();
       System.out.print("1-Matrix Inverse\n"
               + "2-Gauss Elimination\n");
       int number = scan.nextInt();
       
        if(number==1){
            inversion.MatrixInversion(Matrix, Result);
        }
        else if(number==2){
            gaussian.GaussianElimination(Matrix,Result);   
        }
        else{
            System.out.print("Equation has not solve");  
        }
   }
}
