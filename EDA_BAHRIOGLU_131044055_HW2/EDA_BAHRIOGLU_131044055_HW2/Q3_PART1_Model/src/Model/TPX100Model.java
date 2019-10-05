package Model;

public class TPX100Model extends Plane {

    @Override
    protected Model getPurpose() {
        return new TPX100();
    }

    @Override
    protected Model getConstructSkeleton() {
        return new TPX100();
    }

    @Override
    protected Model getPlaceEngines() {
        return new TPX100();
    }

    @Override
    protected Model getPlaceSeats() {
        return new TPX100();
    }
}
