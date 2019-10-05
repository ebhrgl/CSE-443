package Model;

public class TPX100 implements Model {

    @Override
    public String purpose() {
        return "Domestic flights";
    }

    @Override
    public String constructSkeleton() {
        return "Aluminum alloy";
    }

    @Override
    public String placeEngines() {
        return "Single jet engine";
    }

    @Override
    public Integer placeSeats() {
        System.out.println("Seats");
        return 50;
    }
}
