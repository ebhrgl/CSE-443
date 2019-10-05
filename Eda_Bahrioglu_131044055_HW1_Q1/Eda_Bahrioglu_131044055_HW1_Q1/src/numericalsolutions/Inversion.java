/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numericalsolutions;

/**
 *
 * @author eda
 */
public class Inversion implements Matrix{

    /**
     *
     */
    public Inversion(){
        
    }
    
    /**
     *
     */
    public void GaussianElimination(double[][] Matrix, double[] Result){
        /*Not implementation*/
    }

    /**
     *
     * @param Matrix
     * @param Result
     */
    /*All inversion calculate*/
    public void MatrixInversion(double[][] Matrix, double[] Result){
        int Size = Result.length;
        double res=0;
       
        res = 1/((Matrix[0][0] * Matrix[Size-1][Size-1]) - (Matrix[0][Size-1] * Matrix[Size-1][0]));
        Calculate(Matrix,Result,res,Size);    
        //swap
        double temp = Matrix[0][0];
        Matrix[0][0] = Matrix[Size-1][Size-1];
        Matrix[Size-1][Size-1] = temp;
         
        //-1 multi    
        Matrix[0][Size-1] = Matrix[0][Size-1] * (-1);
        Matrix[Size-1][0] = Matrix[Size-1][0] * (-1);
        
        System.out.print(res);
       
    }

    /**
     *
     * @param Matrix
     * @param Result
     * @param res
     * @param Size
     */
    /*Inverse result calculate*/
    public void Calculate(double[][] Matrix, double[] Result,double res,int Size){
        
        double[] array = new double[Size];
        Result[0] = (Matrix[0][0] * Result[0]) + (Matrix[0][Size-1] * Result[Size-1]);
        Result[1] = (Matrix[Size-1][0] * Result[0]) + (Matrix[Size-1][Size-1] * Result[Size-1]);
        res = res * Result[0];
        
    }
    
    
}
