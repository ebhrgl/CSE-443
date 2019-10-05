package AbstractFactory;

public class Other implements Market {

    @Override
    public void EnginInjection() {
        System.out.println("Geared turbofan.");
    }

    @Override
    public void SeatingCover() {
        System.out.println("Leather.");
    }
}
