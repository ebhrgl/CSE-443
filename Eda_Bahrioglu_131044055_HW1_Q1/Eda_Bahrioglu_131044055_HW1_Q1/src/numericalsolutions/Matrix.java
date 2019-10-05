/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numericalsolutions;

/**
 *Interface 
 * @author eda
 */
public interface Matrix {
    
    /**
     *
     */
    public void GaussianElimination(double[][] Matrix, double[] Result); 

    /**
     *
     * @param Matrix
     * @param Result
     */
    public void MatrixInversion(double[][] Matrix, double[] Result);

    /**
     *
     * @param Matrix
     * @param Result
     * @param res
     * @param Size
     */
    public void Calculate(double[][] Matrix, double[] Result,double res,int Size);
    
}
