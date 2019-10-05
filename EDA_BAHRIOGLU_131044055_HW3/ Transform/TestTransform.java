package Transform;

public class TestTransform {
    public static void main(String args[]){


        System.out.println("For DCT....");
        DTransform template = new DCT();
        template.calculate();
        System.out.println("For DFT...");
        template = new DFT();
        template.calculate();
    }
}
