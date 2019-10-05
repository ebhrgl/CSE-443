package Transform;

public abstract class DTransform {
    public final void calculate(){
        readFromFile();
        nOutput();
        writeToFile();
        timeOfExecution();
    }
    public abstract int readFromFile();
    public abstract void nOutput();
    public abstract void writeToFile();

    public void timeOfExecution() {
        System.out.println("Time Of Execution");
    }
}
