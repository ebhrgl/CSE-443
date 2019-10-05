package AbstractFactory;

public class TPX100 implements Model {

    @Override
    public void purpose() {
        System.out.println("Domestic flights.");
    }

    @Override
    public void constructSkeleton() {
        System.out.println("Aluminum alloy.");
    }

    @Override
    public void placeEngines() {
        System.out.println("Single jet engine.");
    }

    @Override
    public void placeSeats() {
        System.out.println("Seats 50");
    }
}

