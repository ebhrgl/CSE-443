package Transform;

import java.io.*;
import java.util.Scanner;

public class DFT extends DTransform {
    double real,  img;
    public DFT()
    {
        this.real = 0.0;
        this.img = 0.0;
    }

    @Override
    public int readFromFile() {
        int N=0;
        String fileName = "src/Transform/temp.txt";
        String line = null;

        try {

            FileReader fileReader =
                    new FileReader(fileName);

            BufferedReader bufferedReader =
                    new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                N = Integer.parseInt(line);
                System.out.println(N);
            }

            bufferedReader.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                    "Unable to open file '" + fileName + "'");
        }
        catch(IOException ex) {
            System.out.println(
                    "Error reading file '" + fileName + "'");
        }
        return N;
    }

    @Override
    public void nOutput() {
        int N = readFromFile();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter coefficient of linear funtion:");
        System.out.println("ax + by = c");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double []function = new double[N];
        for(int i=0; i<N; i++)
        {
            function[i] = (((a*(double)i) + (b*(double)i)) - c);
        }

        System.out.println("Enter the max K value: ");
        int k = sc.nextInt();

        double []cos = new double[N];
        double []sin = new double[N];

        for(int i=0; i<N; i++)
        {
            cos[i] = Math.cos((2 * i * k * Math.PI) / N);
            sin[i] = Math.sin((2 * i * k * Math.PI) / N);
        }

        DFT dft_val = new DFT();
        System.out.println("The coefficients are: ");

        for(int i=0; i<N; i++)
        {
            dft_val.real += function[i] * cos[i];
            dft_val.img += function[i] * sin[i];
        }
        System.out.println("("+dft_val.real + ") - " + "("+dft_val.img + " i)");
        sc.close();

    }

    @Override
    public void writeToFile() {
        int N =0;
        String optr = "src/Transform/output.txt";

        try {

            FileWriter fileWriter =
                    new FileWriter(optr);

            BufferedWriter bufferedWriter =
                    new BufferedWriter(fileWriter);

            bufferedWriter.write(N);

            bufferedWriter.close();
        }
        catch(IOException ex) {
            System.out.println(
                    "Error writing to file '"
                            + optr + "'");
        }
    }

    @Override
    public void timeOfExecution() {
        long start = System.nanoTime();
        // do work
        long time = System.nanoTime() - start;
        double timeInSeconds = time/1e9;
        System.out.println("Time Of Execution for DFT");
        System.out.println(timeInSeconds);
    }
}