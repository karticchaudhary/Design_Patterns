package creational.factorypattern.CarFactoryExample;

public class CarFactory {

    public static Car buildCar(CarType model) {
        Car car = null;
        switch (model) {
            case SEDAN -> {
                car = new SedanCar();
            }
            case SMALL -> {
                car = new SmallCar();
            }
            case LUXURY -> {
                car = new LuxuryCar();
            }
        }

        return car;
    }
}
