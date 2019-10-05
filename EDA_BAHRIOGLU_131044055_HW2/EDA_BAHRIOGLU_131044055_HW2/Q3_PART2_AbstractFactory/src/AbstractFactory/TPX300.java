package AbstractFactory;

public class TPX300 implements Model {
    @Override
    public void purpose() {
        System.out.println("Transatlantic flights.");
    }
    @Override
    public void constructSkeleton() {
        System.out.println("Titanium alloy.");
    }

    @Override
    public void placeEngines() {
        System.out.println("Quadro jet engines.");
    }

    @Override
    public void placeSeats() {
        System.out.println("Seats 250");
    }
}

