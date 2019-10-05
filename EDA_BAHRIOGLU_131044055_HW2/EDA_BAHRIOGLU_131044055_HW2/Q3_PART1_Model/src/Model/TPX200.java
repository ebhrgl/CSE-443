package Model;

public class TPX200 implements Model{

    @Override
    public String purpose() {
        return "Domestic and short international flights";
    }

    @Override
    public String constructSkeleton() {
        return "Nickel alloy";
    }

    @Override
    public String placeEngines() {
        return "Twin jet engines";
    }

    @Override
    public Integer placeSeats() {
        System.out.println("Seats");
        return 100;
    }
}
