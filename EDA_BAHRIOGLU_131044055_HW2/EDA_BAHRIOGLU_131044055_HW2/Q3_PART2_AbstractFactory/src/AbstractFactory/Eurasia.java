package AbstractFactory;

public class Eurasia implements Market{

    @Override
    public void EnginInjection() {
        System.out.println("Turbofan.");
    }

    @Override
    public void SeatingCover() {
        System.out.println("Linen.");
    }
}