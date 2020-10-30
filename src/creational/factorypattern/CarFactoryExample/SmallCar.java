package creational.factorypattern.CarFactoryExample;

public class SmallCar extends Car {

    SmallCar() {
        super(CarType.SMALL);
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
