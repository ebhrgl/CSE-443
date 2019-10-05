package Model;

public class TPX300 implements Model {

    @Override
    public String purpose() {
        return "Transatlantic flights";
    }
    @Override
    public String constructSkeleton() {
        return "Titanium alloy";
    }

    @Override
    public String placeEngines() {
        return "Quadro jet engines";
    }

    @Override
    public Integer placeSeats() {
        System.out.println("Seats");
        return 250;
    }
}
