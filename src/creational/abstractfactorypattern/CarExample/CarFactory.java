package creational.abstractfactorypattern.CarExample;

public class CarFactory {

    private CarFactory() {
        //Prevent instantiation
    }

    public static Car buildCar(CarTypes type, Location location) {
        Car car = null;
        switch (location) {
            case USA:
                car = USACarFactory.buildCar(type);
                break;
            case ASIA:
                car = AsiaCarFactory.buildCar(type);
                break;
            default:
                car = DefaultFactory.buildCar(type);
        }
        return car;
    }

}
