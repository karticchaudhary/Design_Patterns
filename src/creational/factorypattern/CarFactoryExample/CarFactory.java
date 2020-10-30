package creational.factorypattern.CarFactoryExample;

public class CarFactory {

    public static Car buildCar(CarType model) {
        Car car = null;
        switch (model) {
            case SEDAN -> {
                car = new SedanCar();
                break;
            }
            case SMALL -> {
                car = new SmallCar();
                break;
            }
            case LUXURY -> {
                car = new LuxuryCar();
                break;
            }
        }

        return car;
    }
}
