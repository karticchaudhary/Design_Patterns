package creational.abstractfactorypattern.CarExample;

public class DefaultFactory {
    public static Car buildCar(CarTypes model) {
        Car car = null;
        switch (model) {
            case SMALL -> {
                car = new SmallCar(Location.DEFAULT);
            }
            case SEDAN -> {
                car = new SedanCar(Location.DEFAULT);
            }
            case LUXURY -> {
                car = new LuxuryCar(Location.DEFAULT);
            }
        }
        return car;
    }

}
