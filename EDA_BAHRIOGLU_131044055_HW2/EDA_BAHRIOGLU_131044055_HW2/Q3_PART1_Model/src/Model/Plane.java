package Model;

public abstract class Plane {

    public void createPlane(){
        Model purpose = getPurpose();
        String msgPurpose = purpose.purpose();
        System.out.println(msgPurpose);

        Model skeleton = getConstructSkeleton();
        String msgSkeleton = skeleton.constructSkeleton();
        System.out.println(msgSkeleton);

        Model enginees = getPlaceEngines();
        String msgEnginees = enginees.placeEngines();
        System.out.println(msgEnginees);

        Model seats = getPlaceSeats();
        Integer msgSeats = seats.placeSeats();
        System.out.println(msgSeats);
    }

    protected abstract Model getPurpose();
    protected abstract Model getConstructSkeleton();
    protected abstract Model getPlaceEngines();
    protected abstract Model getPlaceSeats();


}
