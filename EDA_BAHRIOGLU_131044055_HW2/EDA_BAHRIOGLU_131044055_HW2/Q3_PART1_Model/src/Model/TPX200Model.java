package Model;

public class TPX200Model extends Plane {

    @Override
    protected Model getPurpose() {
        return new TPX200();
    }

    @Override
    protected Model getConstructSkeleton() {
        return new TPX200();
    }

    @Override
    protected Model getPlaceEngines() {
        return new TPX200();
    }

    @Override
    protected Model getPlaceSeats() {
        return new TPX200();
    }
}
