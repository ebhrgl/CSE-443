package Model;

public class TestFactoryMethod {
    public static void main(String[] args) {
        Plane plane = new TPX100Model();
        plane.createPlane();
        plane = new TPX200Model();
        plane.createPlane();
        plane = new TPX300Model();
        plane.createPlane();
    }
}
