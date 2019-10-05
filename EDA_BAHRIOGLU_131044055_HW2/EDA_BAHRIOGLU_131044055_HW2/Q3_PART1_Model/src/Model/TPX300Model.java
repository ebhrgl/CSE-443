package Model;

public class TPX300Model extends Plane {

    @Override
    protected Model getPurpose() {
        return new TPX300();
    }

    @Override
    protected Model getConstructSkeleton() {
        return new TPX300();
    }

    @Override
    protected Model getPlaceEngines() {
        return new TPX300();
    }

    @Override
    protected Model getPlaceSeats() {
        return new TPX300();
    }
}
