package AbstractFactory;

public class TPX200 implements Model{
    @Override
    public void purpose() {
        System.out.println("Domestic and short international flights.");
    }

    @Override
    public void constructSkeleton() {
        System.out.println("Nickel alloy.");
    }

    @Override
    public void placeEngines() {
        System.out.println("Twin jet engines.");
    }

    @Override
    public void placeSeats() {
        System.out.println("Seats 100");
    }
}
