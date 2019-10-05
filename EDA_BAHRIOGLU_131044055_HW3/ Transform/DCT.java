package Transform;

import java.io.*;

public class DCT extends DTransform {

    public int matrix[][];
    public static double pi = 3.14;
    public DCT(){

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
                    "Unable to open file '" +
                            fileName + "'");
        }
        catch(IOException ex) {
            System.out.println(
                    "Error reading file '"
                            + fileName + "'");
        }
        return N;
    }

    @Override
    public void nOutput() {
        int N = 0;
        int i, j, k, l;
        double[][] dct = new double[N][N];
        double ci = 0, cj = 0, dct1, sum;

        for (i = 0; i < N; i++)
        {
            for (j = 0; j < N; j++)
            {
                sum = 0;
                k=0;

                while(k < N)
                {
                    l=0;
                    while(l < N)
                    {
                        dct1 = matrix[k][l] * Math.cos((2 * k + 1) * i * pi / (2 * N)) * Math.cos((2 * l + 1) * j * pi / (2 * N));
                        sum = sum + dct1;
                    }
                    l++;
                    k++;
                }
                dct[i][j] = ci * cj * sum;
            }
        }

        for (i = 0; i < N; i++)
        {
            for (j = 0; j < N; j++)
                System.out.printf("%f\t", dct[i][j]);
            System.out.println();
        }
    }

    @Override
    public void writeToFile() {
        int N=0;
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
            System.out.println("Error writing to file '" + optr + "'");
        }
    }
}
