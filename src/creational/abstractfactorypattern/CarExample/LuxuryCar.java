package creational.abstractfactorypattern.CarExample;

public class LuxuryCar extends Car {

    public LuxuryCar(Location location) {
        super(CarTypes.LUXURY, location);
    }

    @Override
    protected void construct() {
        System.out.println("Building luxury car");
        //add accessories
    }

    @Override
    public String toString() {
        return "LUXURY CAR";
    }

}
