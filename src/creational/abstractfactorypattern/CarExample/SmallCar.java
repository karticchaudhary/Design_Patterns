package creational.abstractfactorypattern.CarExample;

public class SmallCar extends Car {

    public SmallCar(Location location) {
        super(CarTypes.SMALL, location);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Building small car");
        // add accessories
    }

    @Override
    public String toString() {
        return "SMALL CAR";
    }
}
