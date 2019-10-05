package AbstractFactory;

public class Domestic implements Market {

    @Override
    public void EnginInjection() {
        System.out.println("Turbojet.");
    }

    @Override
    public void SeatingCover() {
        System.out.println("Velvet.");
    }
}

