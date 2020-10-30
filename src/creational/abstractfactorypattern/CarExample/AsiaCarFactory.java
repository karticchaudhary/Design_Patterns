package creational.abstractfactorypattern.CarExample;

public class AsiaCarFactory {

    public static Car buildCar(CarTypes model) {
        Car car = null;
        switch (model) {
            case SMALL -> {
                car = new SmallCar(Location.ASIA);
            }
            case SEDAN -> {
                car = new SedanCar(Location.ASIA);
            }
            case LUXURY -> {
                car = new LuxuryCar(Location.ASIA);
            }
        }
        return car;
    }

}
