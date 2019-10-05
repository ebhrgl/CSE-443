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
public class Gaussian implements Matrix{

    /**
     *
     */
    public Gaussian(){
        
    }
    
    /**
     *
     */
    public void GaussianElimination(double[][] Matrix, double[] Result){
        int Size = Result.length;
       
        double res=0;
        double[] newMatrix = null;
        Calculate(Matrix,Result,res,Size);
        
        if(Matrix[0][0] == 1 && Matrix[0][Size-1] == 0)
        {
           newMatrix[0]  = Result[0];  
        }   
        else if(Matrix[Size-1][0] == 0 && Matrix[Size-1][Size-1] == 1)
        {
           newMatrix[1] = Result[1];
        }
        
        for(int i=0; i<Size; ++i)
        {
            System.out.print(Result[i]);
        }
        
    }
    /**
     *
     * @param Matrix
     * @param Result
     */
    public void MatrixInversion(double[][] Matrix, double[] Result){
        /*Not implementation*/
    }
    /**
     *
     * @param Matrix
     * @param Result
     * @param res
     * @param Size
     */
    /*Last result calculate in this function*/
    public void Calculate(double[][] Matrix, double[] Result,double res,int Size){
        int i = 0;
        while(i < Result.length) 
        {
            int maxValue = maxRow(Matrix,Result);
            swap(i,maxValue,Matrix);
            i++;
        }
      
    }
    
    /*MaxRow find for Gauss calculate*/
    private int maxRow(double[][] A, double[] B){
        int max=0;
        for (int k = 0; k < B.length; k++) 
        {
            max = k;
            for (int i = k + 1; i < B.length; i++) 
                if (Math.abs(A[i][k]) > Math.abs(A[max][k])) 
                    max = i;
        }
        return max;
    }
    /*Swap make for gaussian calculate*/
    private void swap(int rowOne, int rowTwo, double[][]Matrix){
        double[] temp;
        temp = Matrix[rowOne];
        Matrix[rowOne] = Matrix[rowTwo];
        Matrix[rowTwo] = temp;
         
    }
    
}
