package creational.abstractfactorypattern.CarExample;

public class SedanCar extends Car {

    public SedanCar(Location location) {
        super(CarTypes.SEDAN, location);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Building sedan car");
        // add accessories
    }

    @Override
    public String toString() {
        return "SEDAN CAR";
    }

}
